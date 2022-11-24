package stewart.jonathan.oauthserver.oauthserverdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import stewart.jonathan.oauthserver.oauthserverdemo.model.AppUser;

public interface AppUserRepo extends JpaRepository<AppUser, Long> {

    AppUser findByUsername(String username);

}
