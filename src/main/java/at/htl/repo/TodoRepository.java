package at.htl.repo;

import at.htl.model.Todo;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TodoRepository implements PanacheRepository<Todo> {
}
