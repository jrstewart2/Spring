package stewart.jonathan.repository;

import org.springframework.stereotype.Repository;
import stewart.jonathan.model.Speaker;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerReppository")
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
