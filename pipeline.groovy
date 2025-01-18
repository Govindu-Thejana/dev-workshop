pipeline {
    agent any

        stage('Run Python Script') {
            steps {
                // Run the hello.py script using Python
                script {
                    sh 'python3 hello.py'
                }
            }
        }
    }
}
