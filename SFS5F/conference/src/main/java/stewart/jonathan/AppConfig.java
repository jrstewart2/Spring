package stewart.jonathan;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import stewart.jonathan.repository.HibernateSpeakerRepositoryImpl;
import stewart.jonathan.repository.SpeakerRepository;
import stewart.jonathan.service.SpeakerService;
import stewart.jonathan.service.SpeakerServiceImpl;

import java.beans.BeanDescriptor;

@Configuration
@ComponentScan({"stewart.jonathan"})
public class AppConfig {

    /*
    @Bean(name = "speakerService")
    @Scope(value= BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService() {
        //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        //service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }

     */
}
