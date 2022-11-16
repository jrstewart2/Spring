package stewart.jonathan.buildingapi.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class LiveStreamTest {

    @Test
    void create_new_immutable_live_stream() {
        ImmutableLiveStream stream = new ImmutableLiveStream(
                UUID.randomUUID().toString(),
                "Building REST APIs with Spring Boot",
                "Learning how to build RESTful APIs with Spring Boot",
                "https://www.twitch.tv/danvega",
                LocalDateTime.of(2022, 2, 16, 11, 0),
                LocalDateTime.of(2022, 2, 16, 12, 0)
        );
        assertNotNull(stream);
        assertEquals("Building REST APIs with Spring Boot", stream.getTitle());
    }

    @Test
    void create_new_record_live_stream() {
        LiveStream stream = new LiveStream(
                UUID.randomUUID().toString(),
                "Building REST APIs with Spring Boot",
                "Learning how to build RESTful APIs with Spring Boot",
                "https://www.twitch.tv/danvega",
                LocalDateTime.of(2022, 2, 16, 11, 0),
                LocalDateTime.of(2022, 2, 16, 12, 0)
        );
        assertNotNull(stream);
        assertEquals("Building REST APIs with Spring Boot", stream.title());
        assertTrue(stream.getClass().isRecord());
        assertEquals(6,stream.getClass().getRecordComponents().length);
    }
}
