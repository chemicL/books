Vagrant.configure(2) do |config|
  config.vm.box = "urban/trusty64-node"

  config.vm.network "forwarded_port", guest: 80, host: 8080
  config.vm.network "private_network", type: "dhcp"

  config.vm.provision :shell, path: "vagrant/install.sh", privileged: false

  config.vm.synced_folder "books-frontend/", "/books/frontend", :nfs => true
end
