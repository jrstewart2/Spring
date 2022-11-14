package uk.co.nationwide.stewart.jonathan.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.co.nationwide.stewart.jonathan.conferencedemo.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
