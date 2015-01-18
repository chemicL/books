Vagrant.configure(2) do |config|
  config.vm.box = "urban/trusty64-node"
  config.vm.network "forwarded_port", guest: 80, host: 8080
  config.vm.provision :shell, path: "vagrant/install.sh", privileged: false
end
