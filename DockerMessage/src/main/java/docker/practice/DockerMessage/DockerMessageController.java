package docker.practice.DockerMessage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerMessageController {
    @GetMapping("/message")
    public String getMessage(){
        return "Hello from Docker!";
    }
}
