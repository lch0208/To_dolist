package To_dolist;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodolistRepository extends JpaRepository<Todolist,Long> {
}
