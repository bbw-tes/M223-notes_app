package ch.zli.notes_app.services;

import java.util.List;
import ch.zli.notes_app.models.Expense;
import ch.zli.notes_app.repositories.ExpenseRepo;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class ExpenseService {
    
    @Inject
    ExpenseRepo repo;

    public List<Expense> getAll() {
        return repo.listAll();
    }

    public Expense findById(Long id) {
        repo.findById(id);
    }

    @Transactional
    public Expense create(Expense expense) {
        repo.persist(expense);
        return expense;
    }

    @Transactional
    public void deleteById(Long id) {
        repo.deleteById(id;)
    }

}
