package com.example.jooqreactivetest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping("/createByName")
    public Mono<Long> createByName(@RequestParam("name") String name) {
        return guyRepository.saveByName(name);
    }
}
