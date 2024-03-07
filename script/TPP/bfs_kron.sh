#!/bin/bash

WKL_PATH=/home/xmu/playground/yi/workloads

bfs0() {
    echo 0 > /sys/kernel/mm/numa/demotion_enabled 
    echo 0 > /proc/sys/kernel/numa_balancing 
    echo 10000 > /proc/sys/kernel/perf_event_max_sample_rate
    echo "never" | tee /sys/kernel/mm/transparent_hugepage/enabled
    $WKL_PATH/gapbs/bfs -f $WKL_PATH/gapbs/kron.sg >> ./bfs_kron.out 
}

bfs0 &
sleep 10
damo record $(pidof bfs) 

