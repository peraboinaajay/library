def gitcode(file){
     git "https://github.com/intelliqittrainings/${file}.git"
}
def build(){
     sh "mvn package"
}
def deploy(job,ip,contex){
     sh  "scp /var/lib/jenkins/workspace/cicd-libraries/webapp/target/webapp.war ubuntu@172.31.44.255:/var/lib/tomcat9/webapps/ajju.war"
}
