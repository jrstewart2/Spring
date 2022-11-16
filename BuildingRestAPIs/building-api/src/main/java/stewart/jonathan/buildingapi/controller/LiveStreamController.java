package stewart.jonathan.buildingapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import stewart.jonathan.buildingapi.model.LiveStream;
import stewart.jonathan.buildingapi.repository.LiveStreamRepository;

import java.util.List;

@RestController
@RequestMapping("/streams")
public class LiveStreamController {

    /* BAD WAY TO DO THIS
    LiveStreamRepository repository;

    public LiveStreamController() {
        repository = new LiveStreamRepository();
    } */

    private final LiveStreamRepository repository;

    public LiveStreamController(LiveStreamRepository repository) {
        this.repository = repository;
    }

    // GET request at http://localhost:8080/streams
    @GetMapping
    public List<LiveStream> findAll() {
        return repository.findAll();
    }

    // GET request with id
    @GetMapping("/{id}")
    public LiveStream findById(@PathVariable String id) {
        return repository.findById(id);
    }

    // CREATE
    @PostMapping
    public LiveStream create(@RequestBody LiveStream stream) {
        return null;
    }
}
