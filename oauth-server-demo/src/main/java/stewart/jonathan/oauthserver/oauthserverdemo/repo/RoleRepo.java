package stewart.jonathan.oauthserver.oauthserverdemo.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import stewart.jonathan.oauthserver.oauthserverdemo.model.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {

    Role findByName(String username);
}
