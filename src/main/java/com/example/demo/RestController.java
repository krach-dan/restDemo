package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private final PokemonRepo repo;

    Pokemon missingNo = new Pokemon(0, "missingno", "");


    RestController(PokemonRepo repository) {
        this.repo = repository;
    }

    @GetMapping("/pokemon")
    List<Pokemon> all() {
        return repo.findAll();
    }

    @GetMapping("/pokemon/{id}")
    Pokemon one(@PathVariable int id) {
        return repo.findById(id).orElse(missingNo);
    }

    @PostMapping("/pokemon")
    Pokemon catchedPokemon(@RequestBody Pokemon pokemon) {
        return repo.save(pokemon);
    }

    @DeleteMapping("/pokemon/{id}")
    void releasePokemon(@PathVariable int id) {
        repo.deleteById(id);
    }
}
