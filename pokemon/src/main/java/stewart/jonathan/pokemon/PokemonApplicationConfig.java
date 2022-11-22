package stewart.jonathan.pokemon;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import stewart.jonathan.pokemon.model.Pokemon;
import stewart.jonathan.pokemon.repository.PokemonRepository;

import java.util.List;


@Configuration
public class PokemonApplicationConfig {

    @Bean
    CommandLineRunner commandLineRunner(PokemonRepository pokemonRepository) {
        return args -> {
            Pokemon charmander = new Pokemon(
                    "Charmander",
                    "Fire"
            );
            Pokemon charmeleon = new Pokemon(
                    "Charmeleon",
                    "Fire"
            );
            Pokemon charizard = new Pokemon(
                    "Charizard",
                    "Fire"
            );
            pokemonRepository.saveAll(List.of(charmander, charmeleon, charizard));
        };
    }
}