package ch.zli.notes_app.repositories;

import ch.zli.notes_app.models.ApplicationUser;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ApplicationUserRepo implements PanacheRepository<ApplicationUser> {
    
}

