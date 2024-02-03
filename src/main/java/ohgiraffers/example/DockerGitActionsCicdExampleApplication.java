package ohgiraffers.example;

import lombok.Getter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerGitActionsCicdExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerGitActionsCicdExampleApplication.class, args);
    }

    @GetMapping("/")
    public String doGetHelloWorld() {
        return "Hello world";
    }

    @GetMapping("/ohgiraffers")
    public String doGetOhgiraffers() {
        return "🤖 Hello 성준, 수의, 종완, 태근, 현석, 정인";
    }
}
