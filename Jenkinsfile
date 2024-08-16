pipeline {
    agent any

    stages {
        stage('Print Credentials') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'my-credentials-id', 
                                                  usernameVariable: 'USERNAME', 
                                                  passwordVariable: 'PASSWORD')]) {
                    script {
                        // Выводим креденшалы в консоль
                        // Внимание: Никогда не выводите реальные креденшалы в реальном проекте!
                        // Это только для демонстрационных целей.
                        println("Username: ${env.USERNAME}")
                        println("Password: ${env.PASSWORD}")
                    }
                }
            }
        }
    }
}
