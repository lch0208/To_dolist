package To_dolist;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {
   ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("api/items")
    void create(@RequestBody CreateItemRequest request){
        itemService.save(request);
    }
    @GetMapping("api/items")
    List<ItemResponse> read(){
      return itemService.findAll();
    }

    @PutMapping("api/items/{id}")
    void update(@PathVariable Long id, @RequestBody UpdateItemRequest request){
        itemService.update(id, request);

    }
    @DeleteMapping("api/items/{id}")
    void delete(@PathVariable Long id){
        itemService.delete(id);
    }
    @GetMapping("")
    void completed(){

    };
}
