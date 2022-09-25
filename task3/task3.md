# Step by step to install NTP Server using Docker    
1. Check docker is availble in local machine  
`docker --version`  
![Result](./Screen%20Shot%202022-09-25%20at%2020.41.36.png)    
2. Pull NTP image from docker hub   
`docker pull cturra/ntp`  
3. Check the result:   
`docker images | grep ntp`  
![Result](./Screen%20Shot%202022-09-25%20at%2020.44.20.png)  
4. Run the docker container   
`docker run --name=ntp --restart=always --detach --publish=123:123/udp cturra/ntp`  
5. Check the result  
![Result](./Screen%20Shot%202022-09-25%20at%2020.54.36.png)  
![Result](./Screen%20Shot%202022-09-25%20at%2020.55.14.png)  


