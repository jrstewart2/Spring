package stewart.jonathan.service;

import stewart.jonathan.model.Speaker;
import stewart.jonathan.repository.HibernateSpeakerRepositoryImpl;
import stewart.jonathan.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

}
