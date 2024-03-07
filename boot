[    4.818749] ================================================================================
[    4.820613] UBSAN: array-index-out-of-bounds in drivers/scsi/megaraid/megaraid_sas_fp.c:103:32
[    4.822543] index 1 is out of range for type 'MR_LD_SPAN_MAP [1]'
[    4.824255] ================================================================================
[    4.825881] ================================================================================
[    4.827493] UBSAN: array-index-out-of-bounds in drivers/scsi/megaraid/megaraid_sas_fp.c:103:32
[    4.829135] index 1 is out of range for type 'MR_LD_SPAN_MAP [1]'
[    4.830438] ================================================================================
[    4.832060] ================================================================================
[    4.833637] UBSAN: array-index-out-of-bounds in drivers/scsi/megaraid/megaraid_sas_fp.c:103:32
[    4.835254] index 1 is out of range for type 'MR_LD_SPAN_MAP [1]'
[    4.836439] ================================================================================
[    4.838017] ================================================================================
[    4.839601] UBSAN: array-index-out-of-bounds in drivers/scsi/megaraid/megaraid_sas_fp.c:140:9
[    4.841199] index 1 is out of range for type 'MR_LD_SPAN_MAP [1]'
[    4.842382] ================================================================================
[    4.843962] megaraid_sas 0000:17:00.0: NVME page size	: (4096)
[    4.844321] megaraid_sas 0000:17:00.0: megasas_enable_intr_fusion is called outbound_intr_mask:0x40000000
[    4.844323] megaraid_sas 0000:17:00.0: INIT adapter done
[    4.888363] ================================================================================
[    4.890367] UBSAN: array-index-out-of-bounds in drivers/scsi/megaraid/megaraid_sas_fp.c:103:32
[    4.892432] index 1 is out of range for type 'MR_LD_SPAN_MAP [1]'
[    4.893924] ================================================================================
[    4.895643] ================================================================================
[    4.897360] UBSAN: array-index-out-of-bounds in drivers/scsi/megaraid/megaraid_sas_fp.c:1240:9
[    4.899117] index 1 is out of range for type 'MR_LD_SPAN_MAP [1]'
[    4.900369] ================================================================================
[    4.901947] ================================================================================
[    4.903532] UBSAN: array-index-out-of-bounds in drivers/scsi/megaraid/megaraid_sas_fp.c:1245:35
[    4.905162] index 1 is out of range for type 'MR_LD_SPAN_MAP [1]'
[    4.906344] ================================================================================
[    4.907924] ================================================================================
[    4.909505] UBSAN: array-index-out-of-bounds in drivers/scsi/megaraid/megaraid_sas_fp.c:1253:10
[    4.911139] index 1 is out of range for type 'MR_LD_SPAN_MAP [1]'
[    4.912279] CPU: 0 PID: 307 Comm: kworker/0:2 Not tainted 5.18.0 #1
[    4.912280] Hardware name: Dell Inc. PowerEdge R750/0WT8Y6, BIOS 1.5.4 12/17/2021
[    4.912281] Workqueue: events work_for_cpu_fn
[    4.912282] Call Trace:
[    4.912283]  <TASK>
[    4.912283]  dump_stack_lvl+0x49/0x5f
[    4.912284]  dump_stack+0x10/0x12
[    4.912285]  ubsan_epilogue+0x9/0x3b
[    4.912286]  __ubsan_handle_out_of_bounds.cold.13+0x2b/0x36
[    4.912287]  ? _raw_spin_lock_irqsave+0x28/0x50
[    4.912289]  MR_ValidateMapInfo+0xa6f/0xe50 [megaraid_sas]
[    4.912294]  megasas_probe_one.cold.89+0x10e5/0x1934 [megaraid_sas]
[    4.912297]  ? raw_spin_rq_unlock+0x10/0x30
[    4.912299]  local_pci_probe+0x47/0x90
[    4.912301]  work_for_cpu_fn+0x17/0x30
[    4.912302]  process_one_work+0x229/0x400
[    4.912304]  worker_thread+0x21c/0x3d0
[    4.912305]  ? process_one_work+0x400/0x400
[    4.912306]  kthread+0xfc/0x130
[    4.912307]  ? kthread_complete_and_exit+0x20/0x20
[    4.912309]  ret_from_fork+0x1f/0x30
[    4.912311]  </TASK>
[    4.912312] ================================================================================
[    4.913230] ata2: SATA link down (SStatus 4 SControl 300)
[    4.913889] ================================================================================
[    4.913892] UBSAN: array-index-out-of-bounds in drivers/scsi/megaraid/megaraid_sas_fp.c:151:32
[    4.913893] index 1 is out of range for type 'MR_LD_SPAN_MAP [1]'
[    4.922653] megaraid_sas 0000:17:00.0: Snap dump wait time	: 15
[    4.922656] megaraid_sas 0000:17:00.0: pci id		: (0x1000)/(0x10e2)/(0x1028)/(0x1ae0)
[    4.922657] megaraid_sas 0000:17:00.0: unevenspan support	: yes
[    4.922658] megaraid_sas 0000:17:00.0: firmware crash dump	: no
[    4.922659] megaraid_sas 0000:17:00.0: JBOD sequence map	: enabled
[    4.922867] megaraid_sas 0000:17:00.0: Max firmware commands: 5100 shared with default hw_queues = 48 poll_queues 0
[    4.922869] scsi host0: Avago SAS based MegaRAID driver
[    4.950639] usb 1-12: New USB device found, idVendor=413c, idProduct=301a, bcdDevice= 1.00
[    4.950650] usb 1-12: New USB device strings: Mfr=1, Product=2, SerialNumber=0
[    4.950655] usb 1-12: Product: Dell MS116 USB Optical Mouse
[    4.950659] usb 1-12: Manufacturer: PixArt
[    5.049138] ata5: SATA link down (SStatus 0 SControl 300)
[    5.049180] ata4: SATA link down (SStatus 0 SControl 300)
[    5.049212] ata6: SATA link down (SStatus 0 SControl 300)
[    5.049244] ata8: SATA link down (SStatus 0 SControl 300)
[    5.049276] ata3: SATA link down (SStatus 0 SControl 300)
[    5.049307] ata7: SATA link down (SStatus 0 SControl 300)
[    5.049340] ata9: SATA link down (SStatus 0 SControl 300)
[    5.049372] ata10: SATA link down (SStatus 0 SControl 300)
[    5.078514] usb 1-13: new low-speed USB device number 3 using xhci_hcd
[    5.237725] usb 1-13: New USB device found, idVendor=413c, idProduct=2113, bcdDevice=33.10
[    5.237737] usb 1-13: New USB device strings: Mfr=0, Product=2, SerialNumber=0
[    5.237742] usb 1-13: Product: Dell KB216 Wired Keyboard
[    5.366524] usb 1-14: new high-speed USB device number 4 using xhci_hcd
[    5.515006] usb 1-14: New USB device found, idVendor=1604, idProduct=10c0, bcdDevice= 0.00
[    5.515018] usb 1-14: New USB device strings: Mfr=0, Product=0, SerialNumber=0
[    5.516395] hub 1-14:1.0: USB hub found
[    5.516500] hub 1-14:1.0: 4 ports detected
[    5.541005] hid: raw HID events driver (C) Jiri Kosina
[    5.561342] usbcore: registered new interface driver usbhid
[    5.561349] usbhid: USB HID core driver
[    5.806345] scsi 0:3:110:0: Direct-Access     DELL     PERC H755 Adp    5.16 PQ: 0 ANSI: 5
[    5.807470] scsi 0:3:111:0: Direct-Access     DELL     PERC H755 Adp    5.16 PQ: 0 ANSI: 5
[    5.837296] sd 0:3:110:0: Attached scsi generic sg0 type 0
[    5.837526] sd 0:3:111:0: Attached scsi generic sg1 type 0
[    5.838073] sd 0:3:110:0: [sda] 4687134720 512-byte logical blocks: (2.40 TB/2.18 TiB)
[    5.838118] sd 0:3:111:0: [sdb] 1874329600 512-byte logical blocks: (960 GB/894 GiB)
[    5.838126] sd 0:3:110:0: [sda] Write Protect is off
[    5.838131] sd 0:3:110:0: [sda] Mode Sense: 1f 00 00 08
[    5.838170] sd 0:3:111:0: [sdb] Write Protect is off
[    5.838175] sd 0:3:111:0: [sdb] Mode Sense: 1f 00 00 08
[    5.838214] sd 0:3:110:0: [sda] Write cache: disabled, read cache: enabled, doesn't support DPO or FUA
[    5.838259] sd 0:3:111:0: [sdb] Write cache: disabled, read cache: enabled, doesn't support DPO or FUA
[    5.841114] sd 0:3:110:0: [sda] Optimal transfer size 262144 bytes
[    5.841238] sd 0:3:111:0: [sdb] Optimal transfer size 262144 bytes
[    5.875482]  sdb: sdb1 sdb2 < sdb5 >
[    5.875801] ================================================================================
[    5.879013] UBSAN: array-index-out-of-bounds in drivers/scsi/megaraid/megaraid_sas_fp.c:103:32
[    5.882266] index 1 is out of range for type 'MR_LD_SPAN_MAP [1]'
[    8.306420] ACPI Error: No handler for Region [SYSI] (000000002c954bc0) [IPMI] (20211217/evregion-135)
[    8.375631] ACPI Error: Region IPMI (ID=7) has no handler (20211217/exfldio-265)
[    8.383311] loop7: detected capacity change from 0 to 129976

[    8.443959] No Local Variables are initialized for Method [_GHL]

[    8.443962] No Arguments are initialized for method [_GHL]

[    8.443973] ACPI Error: Aborting method \_SB.PMI0._GHL due to previous error (AE_NOT_EXIST) (20211217/psparse-531)
[    8.444456] ================================================================================
[    8.586777] UBSAN: array-index-out-of-bounds in drivers/acpi/acpica/dswexec.c:401:12
[    8.586780] index -1 is out of range for type 'acpi_operand_object *[9]'
[    8.586783] CPU: 37 PID: 870 Comm: systemd-udevd Not tainted 5.18.0 #1
[    8.586785] Hardware name: Dell Inc. PowerEdge R750/0WT8Y6, BIOS 1.5.4 12/17/2021
[    8.586786] Call Trace:
[    8.586788]  <TASK>
[    8.586790]  dump_stack_lvl+0x49/0x5f
[    8.586796]  dump_stack+0x10/0x12
[    8.586797]  ubsan_epilogue+0x9/0x3b
[    8.586798]  __ubsan_handle_out_of_bounds.cold.13+0x2b/0x36
[    8.586800]  acpi_ds_exec_end_op+0x1a0/0x787
[    8.586805]  acpi_ps_parse_loop+0x7f9/0x8d3
[    8.586809]  acpi_ps_parse_aml+0x1bb/0x55d
[    8.586812]  acpi_ps_execute_method+0x20f/0x2d1
[    8.586814]  acpi_ns_evaluate+0x34d/0x4ef
[    8.586816]  acpi_evaluate_object+0x180/0x3aa
[    8.586818]  acpi_evaluate_dsm+0xb2/0x120
[    8.586824]  ? kfree+0xe7/0x320
[    8.586829]  acpi_check_dsm+0x21/0xa0
[    8.586831]  acpi_nfit_init+0xac1/0x1910 [nfit]
[    8.586839]  ? __slab_free+0x188/0x310
[    8.586841]  ? up+0x32/0x50
[    8.586846]  ? acpi_evaluate_object+0x2be/0x3aa
[    8.586848]  ? kfree+0x2f9/0x320
[    8.586851]  acpi_nfit_add+0x192/0x1f0 [nfit]
[    8.586855]  ? acpi_nfit_add+0x192/0x1f0 [nfit]
[    8.586858]  acpi_device_probe+0x49/0x170
[    8.586861]  really_probe+0x176/0x360
[    8.586867]  __driver_probe_device+0x117/0x190
[    8.586868]  driver_probe_device+0x24/0xa0
[    8.586870]  __driver_attach+0xa1/0x170
[    8.586872]  ? __device_attach_driver+0x120/0x120
[    8.586874]  ? __device_attach_driver+0x120/0x120
[    8.586876]  bus_for_each_dev+0x77/0xc0
[    8.586880]  driver_attach+0x1e/0x20
[    8.586882]  bus_add_driver+0x163/0x200
[    8.586883]  driver_register+0x70/0xc0
[    8.586885]  acpi_bus_register_driver+0x39/0x50
[    8.586887]  nfit_init+0x166/0x1000 [nfit]
[    8.586891]  ? 0xffffffffc0282000
[    8.586893]  do_one_initcall+0x47/0x210
[    8.586896]  ? do_init_module+0x27/0x210
[    8.586900]  ? kmem_cache_alloc_trace+0x189/0x2f0
[    8.586902]  do_init_module+0x50/0x210
[    8.586904]  load_module+0x2a0b/0x2cf0
[    8.586908]  __do_sys_finit_module+0xc0/0x130
[    8.586909]  ? __do_sys_finit_module+0xc0/0x130
[    8.586912]  __x64_sys_finit_module+0x1a/0x20
[    8.586913]  do_syscall_64+0x58/0x80
[    8.586917]  ? do_syscall_64+0x67/0x80
[    8.586918]  ? syscall_exit_to_user_mode+0x1b/0x30
[    8.586921]  ? do_syscall_64+0x67/0x80
[    8.586923]  ? do_syscall_64+0x67/0x80
[    8.586924]  ? exit_to_user_mode_prepare+0x178/0x1a0
[    8.586928]  ? syscall_exit_to_user_mode+0x1b/0x30
[    8.586930]  ? do_syscall_64+0x67/0x80
[    8.586932]  ? irqentry_exit+0x33/0x40
[    8.586933]  ? exc_page_fault+0x8e/0x180
[    8.586935]  ? asm_exc_page_fault+0x8/0x30
[    8.586937]  entry_SYSCALL_64_after_hwframe+0x44/0xae
[    8.586939] RIP: 0033:0x7f1c22b1773d
[    8.586942] Code: 00 c3 66 2e 0f 1f 84 00 00 00 00 00 90 f3 0f 1e fa 48 89 f8 48 89 f7 48 89 d6 48 89 ca 4d 89 c2 4d 89 c8 4c 8b 4c 24 08 0f 05 <48> 3d 01 f0 ff ff 73 01 c3 48 8b 0d 23 37 0d 00 f7 d8 64 89 01 48
[    8.586943] RSP: 002b:00007ffd80947678 EFLAGS: 00000246 ORIG_RAX: 0000000000000139
[    8.586946] RAX: ffffffffffffffda RBX: 0000562f151a8b60 RCX: 00007f1c22b1773d
[    8.586947] RDX: 0000000000000000 RSI: 00007f1c229f7ded RDI: 0000000000000006
[    8.586948] RBP: 0000000000020000 R08: 0000000000000000 R09: 0000000000000000
[    8.586949] R10: 0000000000000006 R11: 0000000000000246 R12: 00007f1c229f7ded
[    8.586950] R13: 0000000000000000 R14: 0000562f154034e0 R15: 0000562f151a8b60
[    8.586951]  </TASK>
[    8.586953] ================================================================================
[    8.587360] ACPI Error: Aborting method \_SB.PMI0._PMC due to previous error (AE_NOT_EXIST) (20211217/psparse-531)
[    8.588373] ACPI: \_SB_.PMI0: _PMC evaluation failed: AE_NOT_EXIST
[    8.588654] IPMI message handler: version 39.2
[    8.589416] dcdbas dcdbas: Dell Systems Management Base Driver (version 5.6.0-3.4)
[    8.592208] dca service started, version 1.12.1
[    8.595239] ipmi device interface
[    8.608184] mei_me 0000:00:16.0: Device doesn't have valid ME Interface
[    8.609809] ioatdma: Intel(R) QuickData Technology Driver 5.00
[    8.618219] ipmi_si: IPMI System Interface driver
[    8.618241] ipmi_si dmi-ipmi-si.0: ipmi_platform: probing via SMBIOS
[    8.618243] ipmi_platform: ipmi_si: SMBIOS: io 0xca8 regsize 1 spacing 4 irq 10
[    8.618245] ipmi_si: Adding SMBIOS-specified kcs state machine
[    8.618309] ipmi_si IPI0001:00: ipmi_platform: probing via ACPI
[    8.618335] ipmi_si IPI0001:00: ipmi_platform: [io  0x0ca8] regsize 1 spacing 4 irq 10
[    8.642840] ipmi_si dmi-ipmi-si.0: Removing SMBIOS-specified kcs state machine in favor of ACPI
[    8.642847] ipmi_si: Adding ACPI-specified kcs state machine
[    8.643026] ipmi_si: Trying ACPI-specified kcs state machine at i/o address 0xca8, slave address 0x20, irq 10
[    8.687603] checking generic (91000000 300000) vs hw (91000000 1000000)
[    8.759467] loop8: detected capacity change from 0 to 716176
[    8.761108] loop9: detected capacity change from 0 to 83672
[    8.761337] loop11: detected capacity change from 0 to 1017816
[    8.761411] loop10: detected capacity change from 0 to 129608
[    8.797722] fb0: switching to mgag200 from VESA VGA
[    9.012404] Console: switching to colour dummy device 80x25
[    9.012776] mgag200 0000:03:00.0: vgaarb: deactivate vga console
[    9.018056] RAPL PMU: API unit is 2^-32 Joules, 2 fixed counters, 655360 ms ovfl timer
[    9.018064] RAPL PMU: hw unit of domain package 2^-14 Joules
[    9.018068] RAPL PMU: hw unit of domain dram 2^-16 Joules
[    9.018198] [drm] Initialized mgag200 1.0.0 20110418 for 0000:03:00.0 on minor 0
[    9.032476] cryptd: max_cpu_qlen set to 1000
[    9.051031] fbcon: mgag200drmfb (fb0) is primary device
[    9.052556] mgag200 0000:03:00.0: [drm] drm_plane_enable_fb_damage_clips() not called


