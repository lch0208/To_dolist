package To_dolist;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TodoList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String listName;

    public Long getId() {
        return id;
    }

    public String getListName() {
        return listName;
    }

    public TodoList(Long id, String listName) {
        this.id = id;
        this.listName = listName;
    }
}
