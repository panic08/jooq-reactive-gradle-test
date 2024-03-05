package com.example.jooqreactivetest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/init")
@RequiredArgsConstructor
public class InitController {
    private final InitRepository initRepository;
    @GetMapping("/name")
    public Mono<Void> getName(@RequestParam("id") long id) {
        return initRepository.findNameById(id)
                .flatMap(name -> {
                    System.out.println(name);

                    return Mono.empty();
                });
    }
}
