package To_dolist;

import org.springframework.stereotype.Service;

@Service
public class TodoListService {

    TodoListRepository todoListRepository;

    public TodoListService(TodoListRepository todoListRepository){
        this.todoListRepository = todoListRepository;
    }

    public
}
