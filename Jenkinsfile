pipeline {
    agent any

    stages {
        stage('Print Credentials') {
            steps {
                script {
                    // Получаем креденшалы, сохраненные в Jenkins под идентификатором 'my-credentials-id'
                    def creds = credentials('my-credentials-id')

                    // Выводим креденшалы в консоль
                    // Внимание: Никогда не выводите реальные креденшалы в реальном проекте!
                    // Это только для демонстрационных целей.
                    println("Username: ${creds.Username}")
                    println("Password: ${creds.Password}")
                }
            }
        }
    }
}
