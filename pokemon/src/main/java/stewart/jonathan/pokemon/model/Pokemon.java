package stewart.jonathan.pokemon.model;

import javax.persistence.*;


@Entity(name = "Pokemon")
@Table(name = "Pokemon")
public class Pokemon {

    @Id
    @SequenceGenerator(name = "pokemon_sequence", sequenceName = "pokemon_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pokemon_sequence")
    private Integer id;
    private String name;
    private String type;

    public Pokemon () {}

    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "PokemonModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
