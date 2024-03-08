package com.example.jooqreactivetest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/guy")
@RequiredArgsConstructor
public class GuyController {
    private final GuyRepository guyRepository;
    @GetMapping("/{id}/getName")
    public Mono<String> getName(@PathVariable("id") long id) {
        return guyRepository.findNameById(id);
    }

    @PostMapping("/createByName")
    public Mono<Long> createByName(@RequestParam("name") String name) {
        return guyRepository.saveByName(name);
    }

    @PutMapping("/{id}/updateName")
    public Mono<Void> updateNameById(@RequestParam("name") String name,
                                     @PathVariable("id") long id) {
        return guyRepository.updateNameById(name, id);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable("id") long id) {
        return guyRepository.deleteById(id);
    }
}
