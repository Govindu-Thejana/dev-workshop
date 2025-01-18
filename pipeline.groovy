pipeline {
    agent any
        stage('Run Python Script') {
            steps {
                    bat 'python3 hello.py'
            }
        }
    }
}
