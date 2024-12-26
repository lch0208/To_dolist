package To_dolist;

import org.springframework.stereotype.Service;

@Service
public class TodolistService {

    TodolistRepository todolistRepository;

    public TodolistService(TodolistRepository todolistRepository) {
        this.todolistRepository = todolistRepository;
    }

    public void findAll(Long TodolistId){

    }

    public void save(CreateTodoRequest request) {
        todolistRepository.save(new Todolist(request.itemname()));
    }
}
