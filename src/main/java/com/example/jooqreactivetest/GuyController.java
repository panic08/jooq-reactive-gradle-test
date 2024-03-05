package com.example.jooqreactivetest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/guy")
@RequiredArgsConstructor
public class GuyController {
    private final GuyRepository guyRepository;
    @GetMapping("/name")
    public Mono<String> getName(@RequestParam("id") long id) {
        return guyRepository.findNameById(id);
    }
}
