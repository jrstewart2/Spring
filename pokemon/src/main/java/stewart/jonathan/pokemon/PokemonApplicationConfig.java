package stewart.jonathan.pokemon;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import stewart.jonathan.pokemon.model.Pokemon;
import stewart.jonathan.pokemon.repository.PokemonRepository;

import java.util.List;
import java.util.UUID;


@Configuration
public class PokemonApplicationConfig {

    @Bean
    CommandLineRunner commandLineRunner(PokemonRepository pokemonRepository) {
        return args -> {
            Pokemon charmander = new Pokemon(
                    UUID.randomUUID().toString(),
                    "Charmander",
                    "Fire"
            );
            Pokemon charmeleon = new Pokemon(
                    UUID.randomUUID().toString(),
                    "Charmeleon",
                    "Fire"
            );
            Pokemon charizard = new Pokemon(
                    UUID.randomUUID().toString(),
                    "Charizard",
                    "Fire"
            );
            pokemonRepository.saveAll(List.of(charmander, charmeleon, charizard));
        };
    }
}