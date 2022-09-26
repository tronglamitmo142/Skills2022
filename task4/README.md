# Task 4: Jenkins Test  

## Implementaion   
1. Install Jenkins in MacOS X     
- I use the instruction: https://www.jenkins.io/download/lts/macos/    
- Check the result and make sure jenkins is enable in local machine    
`brew services info jenkins-lts`    
![Result](./Screen%20Shot%202022-09-25%20at%2021.04.21.png)    
- Jenkins is available in localhost:8080, we need to take the password to access as admin with this command:     
` cat /Users/nguyenlam/.jenkins/secrets/initialAdminPassword`    
![Result](./Screen%20Shot%202022-09-25%20at%2021.06.21.png)    
2. Create Agent in Jenkins to run our job     
- I have my local machine as my agent     
![Result](./Screen%20Shot%202022-09-25%20at%2021.07.40.png)    
3. Create pipeline to do the task     
![Result](./Screen%20Shot%202022-09-25%20at%2021.09.16.png)    
4. Create script for jenkinsfile to run the job    
![Result](./Screen%20Shot%202022-09-25%20at%2021.58.36.png)    
5. Check the result     
![Result](./Screen%20Shot%202022-09-25%20at%2021.59.44.png)    
![Result](./Screen%20Shot%202022-09-25%20at%2022.00.10.png)    
In agent, we can check the container is running or not    
![Result](./Screen%20Shot%202022-09-25%20at%2022.01.06.png)      


