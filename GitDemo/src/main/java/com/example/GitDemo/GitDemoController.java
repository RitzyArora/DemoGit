
package com.example.GitDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitDemoController {
    @RequestMapping("/")
    public String helloWorldDemo()
    {
        return "Hello World";
    }
    
}
