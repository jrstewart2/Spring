package stewart.jonathan.repository;

import stewart.jonathan.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Jonathan");
        speaker.setLastName("Stewart");

        speakers.add(speaker);

        return speakers;
    }

}
