package To_dolist;

import java.util.List;

public record ListDetailResponse(
        Long listId,
        String title,
        List<Item> tasks
) {

    record Item(Long id, String name) {
    }
}
