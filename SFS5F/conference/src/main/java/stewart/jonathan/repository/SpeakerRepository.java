package stewart.jonathan.repository;

import stewart.jonathan.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
