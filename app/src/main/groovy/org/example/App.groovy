package org.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class App {

    static void main(String[] args) {
        println "Starting application"
        SpringApplication.run(App, args)
    }
}