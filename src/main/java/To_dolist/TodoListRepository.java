package To_dolist;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoListRepository  extends JpaRepository<TodoList,Long> {
}