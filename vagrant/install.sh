#!/bin/bash
set -x

# add oracle repository
sudo add-apt-repository -y ppa:webupd8team/java

# agree to oracle java licence
echo debconf shared/accepted-oracle-license-v1-1 select true | sudo debconf-set-selections
echo debconf shared/accepted-oracle-license-v1-1 seen true | sudo debconf-set-selections

# install dependencies
sudo apt-get update
sudo apt-get install -y oracle-java8-installer postgresql nginx nfs-common portmap git

# setup nginx
sudo cp /vagrant/vagrant/nginx/books-frontend /etc/nginx/sites-available/
sudo rm /etc/nginx/sites-enabled/default
sudo ln -s /etc/nginx/sites-available/books-frontend /etc/nginx/sites-enabled/books-frontend
sudo service nginx restart

# setup frontend
cd /books/frontend
npm install
$(npm bin)/jspm install
cd /
