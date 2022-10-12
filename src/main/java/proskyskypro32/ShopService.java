package proskyskypro32;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ShopService {
    private final Map<Integer, Item> items = new HashMap<>;

    public ShopService() {
        items.put(1, new Item(1, "Smartphone", 25000));
        items.put(2, new Item(2, "Headphones", 4000));
        items.put(3, new Item(3, "Mouse", 2000));
        items.put(4, new Item(4, "Keyboard", 3000));

    }

    public List<Item> get(List<Integer> ids) {
        return basket.add(ids.stream()
                .map(items::get)
                .collect(Collectors.toList())
        );

    }


}
