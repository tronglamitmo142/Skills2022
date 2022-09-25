pipeline {
    agent{
        label 'macos'
    }
    environment {
        PATH = '/Users/nguyenlam/.rbenv/shims:/Users/nguyenlam/Library/Android/sdk/tools:/Users/nguyenlam/Library/Android/sdk/platform-tools:/usr/local/opt/ruby/bin:/Users/nguyenlam/.rbenv/shims:/Users/nguyenlam/Library/Android/sdk/tools:/Users/nguyenlam/Library/Android/sdk/platform-tools:/usr/local/opt/ruby/bin:/opt/local/bin:/opt/local/sbin:/Library/Frameworks/Python.framework/Versions/3.9/bin:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin:/Applications/VMware Fusion.app/Contents/Public:/usr/local/go/bin:/opt/X11/bin:/Library/Apple/usr/bin:/Library/Frameworks/Mono.framework/Versions/Current/Commands:/Applications/Wireshark.app/Contents/MacOS:/Users/nguyenlam/flutter/bin:/Users/nguyenlam/go/bin:/Users/nguyenlam/flutter/bin:/Users/nguyenlam/go/bin'
    }

    stages {
        stage('Pull NTP Images from Dockerhub') {
            steps {
                sh "whoami"
                sh "docker pull cturra/ntp"
            }
        }
        stage('Run NTP server as contaienr'){
            steps {
                sh "docker run --name=ntp --restart=always --detach --publish=123:123/udp cturra/ntp"
            }
        }
        stage ('Verify the result'){
            steps {
                sh "docker exec ntp chronyc tracking"
            }
        }
    }
}
