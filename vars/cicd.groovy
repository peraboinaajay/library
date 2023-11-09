def gitcode(file){
     git "https://github.com/intelliqittrainings/${file}.git"
}
def build(){
     sh "mvn package"
}
def deploy(job,ip,contex){
     sh "scp /var/lib/jenkins/workspace/${job}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${contex}.war
}
