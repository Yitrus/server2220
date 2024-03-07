#!/bin/bash
TPP_PATH=/home/xmu/playground/yi/res
RES_PATH=/home/xmu/playground/yi/results
WKL_PATH=/home/xmu/playground/yi/workloads
TOOL_PATH=/home/xmu/playground/yi/tools
DEF_PATH=/home/xmu/playground/yi/default_numa

#  -o $DEF_PATH/xsb.data

xsb1() {
    echo 0 > /sys/kernel/mm/numa/demotion_enabled 
    echo 0 > /proc/sys/kernel/numa_balancing 
    echo 10000 > /proc/sys/kernel/perf_event_max_sample_rate
    echo "never" | tee /sys/kernel/mm/transparent_hugepage/enabled
    $WKL_PATH/XSBench/openmp-threading/XSBench -t 20 -g 130000 -p 30000000 >> ./xsb.out
}

xsb3() {
    echo "xsb3"
    numactl --membind=0,2 $WKL_PATH/XSBench/openmp-threading/XSBench -t 20 -g 130000 -p 30000000 >> $TPP_PATH/xsb.out &
    program_pid=$!
    echo "$program_pid" &
    while true 
    do
        if ! kill -0 "$program_pid" >/dev/null 2>&1; then
            cat /proc/vmstat >> xsb3.txt
    	    echo "collact data..."
    	    kill -SIGINT $(pgrep damo)
    	    break
        fi
    done	
}

xsb0() {
    echo "xsb0"
    numactl --membind=0,2 $WKL_PATH/XSBench/openmp-threading/XSBench -t 20 -g 130000 -p 30000000 >> $DEF_PATH/xsb.out
}


xsb1  &
sleep 10
damo record $(pidof XSBench) 



# cat /proc/vmstat >> xsb_begin.txt
# xsb0
# echo '__________________________________________'

# echo 0 > /sys/kernel/mm/numa/demotion_enabled 
# echo 1 > /proc/sys/kernel/numa_balancing 
# cat /proc/vmstat >> xsb0.txt

# echo '__________________________________________'

# echo 1 > /sys/kernel/mm/numa/demotion_enabled 
# echo 3 > /proc/sys/kernel/numa_balancing 
# cat /proc/vmstat >> xsb1.txt
# xsb3






