package stewart.jonathan.pokemon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import stewart.jonathan.pokemon.model.Pokemon;
import stewart.jonathan.pokemon.service.PokemonService;

import java.util.List;

@RestController
@RequestMapping("pokemon")
public class PokemonController {

    private final PokemonService pokemonService;

    @Autowired
    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping
    public List<Pokemon> getAll() {
        return pokemonService.getAll();
    }

    @GetMapping("/{id}")
    public Pokemon getById(@PathVariable Integer id) {
        return pokemonService.getById(id);
    }

    @PostMapping
    public String add(@RequestBody Pokemon pokemon) {
        return pokemonService.add(pokemon);
    }

    @PatchMapping("/{id}")
    public String update(@PathVariable String id,
                         @RequestBody Pokemon pokemon){
        return pokemonService.patch(id, pokemon);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id){
        return pokemonService.deleteById(id);
    }
}
