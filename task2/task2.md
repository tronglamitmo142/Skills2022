## To do this task, I use my local machine (MacOS X) and EC2 Ubuntu instance in AWS Cloud provider 
## Steps
1. Launch EC2 Instance in AWS  
<space><space>
![Result](./Screen%20Shot%202022-09-25%20at%2020.15.22.png)
<space><space>
1. Install ansible in MAC OS X 
<space><space>
`brew install ansible`
<space><space>
`sudo mkdir /etc/ansible`
<space><space>
1. Provide some config to access and do the task with EC2 instance  
`nano ansible.cfg`
![Result](./Screen%20Shot%202022-09-25%20at%2020.18.49.png)
4. Create Ansible Inventory with the IP of EC2 machince
`nano hosts`
![Result](./Screen%20Shot%202022-09-25%20at%2020.19.59.png)
5. Test Connection using **ping** command 
`ansible all -m ping`
![Result](./Screen%20Shot%202022-09-25%20at%2020.22.03.png)
6. Create playbook to install and config nginx server into EC2 instance(detail in the root of repository - nginx_install.yml)
7. Run ansible playbook to complete everything 
`ansible-playbook /Users/nguyenlam/Skills2022/nginx_install.yml`
8. Check the result in EC2 instance
`curl localhost:80`
![Result](./Screen%20Shot%202022-09-25%20at%2020.26.04.png)



