package uk.co.nationwide.stewart.jonathan.conferencedemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uk.co.nationwide.stewart.jonathan.conferencedemo.models.Session;
import uk.co.nationwide.stewart.jonathan.conferencedemo.models.Speaker;
import uk.co.nationwide.stewart.jonathan.conferencedemo.repositories.SpeakerRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/speakers")
public class SpeakerController {
    @Autowired
    private SpeakerRepository speakerRepository;

    @GetMapping
    public List<Speaker> list() {
        return speakerRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Speaker get(@PathVariable Long id) {
        return speakerRepository.getReferenceById(id);
    }

    @PostMapping
    public Speaker create(@RequestBody final Speaker speakers) {
        return speakerRepository.saveAndFlush(speakers);
    }
}

