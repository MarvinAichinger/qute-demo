package at.htl.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo extends PanacheEntityBase {

    @Id
    @GeneratedValue
    public Long id;

    public String title;
    public Boolean checked;

    public Todo() {
    }

    public Todo(Long id, String title, Boolean checked) {
        this.id = id;
        this.title = title;
        this.checked = checked;
    }

}
