package To_dolist;

import jakarta.persistence.Entity;

@Entity
public class TodolistController {
    @Id
    private Long Id;
    private String Item;

}
