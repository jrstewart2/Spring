package stewart.jonathan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stewart.jonathan.model.Speaker;
import stewart.jonathan.repository.HibernateSpeakerRepositoryImpl;
import stewart.jonathan.repository.SpeakerRepository;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl(){
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    public SpeakerServiceImpl (SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImpl repository constructor");
        repository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl setter");
        this.repository = repository;
    }
}
