package ch.vaudoise.vaapi.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import ch.vaudoise.vaapi.entity.HelloEntity;
import ch.vaudoise.vaapi.repository.HelloRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HelloService {

    private final HelloRepository helloRepository;

    public Map<String, String> getHelloMessage() {
        String firstMessage = helloRepository.findAll().stream()
                                             .findFirst()
                                             .map(HelloEntity::getMessage).orElseThrow();
        return Map.of("First message", firstMessage);
    }
}
