package stewart.jonathan.pokemon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stewart.jonathan.pokemon.model.Pokemon;
import stewart.jonathan.pokemon.repository.PokemonRepository;

import java.util.List;

@Service
public class PokemonService {

    private final PokemonRepository pokemonRepository;

    @Autowired
    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public List<Pokemon> getAll() {
        return pokemonRepository.findAll();
    }

    public Pokemon getById(Integer id) {
        return getAll().stream()
                .filter(p -> id.equals(p.getId()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Pokemon with ID " + id + " not found"));
    }

    public String deleteById(String id) {
        Pokemon entity = getById(Integer.valueOf(id));
        pokemonRepository.deleteById(Integer.valueOf(id));
        return entity.toString() + " was removed from your collection";
    }

    public String add(Pokemon pokemon) {
        pokemonRepository.save(pokemon);
        return pokemon.toString() + " was added to your collection.";
    }

    public String patch(String id, Pokemon pokemon) {
        Pokemon entity = getById(Integer.valueOf(id));
        entity.setName(pokemon.getName());
        entity.setType(pokemon.getType());
        pokemonRepository.save(entity);
        return pokemon.toString() + " was updated";
    }
}
