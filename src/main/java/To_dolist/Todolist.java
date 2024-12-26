package To_dolist;

import jakarta.persistence.Entity;

@Entity
public class Todolist {
    private Long id;


    public Todolist(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
