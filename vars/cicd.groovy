def gitcode(file){
     git "https://github.com/intelliqittrainings/${file}.git"
}
def build(){
     sh "mvn package"
}
