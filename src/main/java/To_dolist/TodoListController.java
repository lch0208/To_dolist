package To_dolist;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoListController {

    @PostMapping("api/lists")
    void create(@RequestBody CreateTodolistRequest request){
        todolistService.save(request);
    }
}
