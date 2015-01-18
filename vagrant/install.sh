#!/bin/bash
set -x

# add oracle repository
sudo add-apt-repository -y ppa:webupd8team/java

# agree to oracle java licence
echo debconf shared/accepted-oracle-license-v1-1 select true | sudo debconf-set-selections
echo debconf shared/accepted-oracle-license-v1-1 seen true | sudo debconf-set-selections


sudo apt-get update
sudo apt-get install -y oracle-java8-installer postgresql
