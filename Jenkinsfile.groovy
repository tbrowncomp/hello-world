pipeline {
    agent any
    stages {
        stage('Hello') {
            steps {
                script {
                    echo 'Hello World'
                    def number = 1
                    if (number >= 1) {
                        input 'what do you want?'   
                    }
                }
            }
        }
    }
}