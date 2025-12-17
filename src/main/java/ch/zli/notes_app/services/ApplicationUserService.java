package ch.zli.notes_app.services;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;

import ch.zli.notes_app.models.ApplicationUser;
import ch.zli.notes_app.repositories.ApplicationUserRepo;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class ApplicationUserService {
    
    @Inject
    ApplicationUserRepo repo;

    public List<ApplicationUser> getAll(){
        return repo.listAll();
    }

    @Transactional
    public ApplicationUser create(ApplicationUser user, String plainPassword) {
        user.setPassword(BCrypt.hashpw(plainPassword, BCrypt.gensalt()));
        repo.persist(user);
        return user;
    }

    public ApplicationUser fetchByUsername(String username) {
        return repo.find("username", username).firstResult();
    }

    @Transactional
    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}
