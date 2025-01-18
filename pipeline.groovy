pipeline {
    agent any
        stage('Run Python Script') {
            steps {
                    sh 'python3 hello.py'
            }
        }
    }
}
