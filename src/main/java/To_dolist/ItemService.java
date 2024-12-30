package To_dolist;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ItemService {

    ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<ItemResponse> findAll(){
        List<Item> items = itemRepository.findAll();
        return items.stream()
                .map(item -> new ItemResponse(item.getName(),item.getId()))
                .toList();
    }

    public void save(CreateItemRequest request) {
        itemRepository.save(new Item(request.itemName()));
    }

    public void delete(Long id) {
        itemRepository.deleteById(id);
    }

    public void findById(Long id) {
        itemRepository.findById(id);
    }

    @Transactional
    public void update(Long id, UpdateItemRequest request) {
        Item item = itemRepository.findById(id).orElseThrow();

        item.update(request);
//        itemRepository.save(item);
    }

//    public ListDetailResponse findAll(Long listId){
//        itemRepository.
//        return new ListDetailResponse()
//    }
}
