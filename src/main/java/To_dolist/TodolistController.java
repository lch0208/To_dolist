package To_dolist;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.sql.Update;
import org.springframework.web.bind.annotation.*;

@RestController
public class TodolistController {
   TodolistService todolistService;

    public TodolistController(TodolistService todolistService) {
        this.todolistService = todolistService;
    }

    @PostMapping("api/items")
    void create(@RequestBody CreateTodoRequest request){
        todolistService.save(request);
    }
    @GetMapping("api/items")
    void read(){

    }
    @PutMapping("api/items/{id}")
    void update(@PathVariable Long id, @RequestBody Update){

    }
    @DeleteMapping("api/items/{id}")
    void delete(@PathVariable Long id){
        todolistService.delete(id);


    }
}
