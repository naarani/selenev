# selene V
(agentless) automation engine



## Background
I run remote deployment installation test of kargo and kubeadm.
All is done provisioning centos 7.x servers for each job on digitalocean, but I run tests on bare metal too.

Actually I do it running a java application from windows, macos or linux:
I need 'em to test kargo and kubeadm releases, before evaluate to use 'em in production.

The requirements of kargo are some pre-flight activities and ansible with specific version, while kubeadm needs only some preflight checks.

I've decided to put all in a new application where the install start with yaml configuration file like ansible:
this is Selene V.



## Overview
pre alpha, not working now...

[Roadmap](https://github.com/naarani/selenev/wiki/roadmap)


## Main Dependencies 

1) JSCH (BSD-style license) Copyright (c) 2002-2015 Atsuhiko Yamanaka, JCraft,Inc. All rights reserved.

2) Apache jclouds, Apache license 2.0

3) yamlbean EsotericSoftware/yamlbeans is licensed under the MIT License



## Sponsor
IPERIONE SRL


