pipeline {
    agent any
        stage('Run Python Script') {
            steps {
                    bat 'python hello.py'
            }
        }
    }
}
