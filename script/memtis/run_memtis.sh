#!/bin/bash

sudo dmesg -c 

/home/xmu/playground/yi/script/memtis/scripts/run_bench.sh -B XSBench -V "trace"

# XSBench liblinear

# for i in {1..2};
# do
	# /home/xmu/playground/yi/script/memtis/scripts/run_bench.sh -B XSBench -V "trace${i}"
# done

