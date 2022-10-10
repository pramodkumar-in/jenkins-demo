pipelineJob('theme-park-job') {
    definition {
//        cps {
//            script(readFileFromWorkspace('pipelineJob.groovy'))
//            sandbox()
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/pramodkumar-in/spring-boot-api-example.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}