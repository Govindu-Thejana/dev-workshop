pipeline {
    agent any
        stage('Run Python Script') {
            steps {
                script{
                    bat 'python hello.py'
            }
        }
    }
}
