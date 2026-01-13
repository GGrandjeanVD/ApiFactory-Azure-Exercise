package ch.vaudoise.vaapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import ch.vaudoise.vaapi.service.HelloService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class HelloController {

    private final HelloService helloService;

    @GetMapping("/hello-world")
    public Map<String, String> helloWorld() {
        return helloService.getHelloMessage();
    }
}