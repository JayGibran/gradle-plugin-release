package sonalake.poc.gradle_plugin;

import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {
    
    private final BuildProperties buildProperties;

    public TestController(BuildProperties buildProperties) {
        this.buildProperties = buildProperties;
    }

    @GetMapping
    public String helloWorld(){
       return "Hello world - version: " +  buildProperties.getVersion();
    }
    
}
