package proskyskypro32;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StoreService {

    private final Map<Integer, StoreItem>  items = new HashMap<>();
    private final StoreBasket basket;

    public StoreService(StoreBasket basket) {
        this.basket = basket;
    }
    @PostConstruct
    public void init() {
        items.put(1, new StoreItem(1,"Smartphone", 25000));
        items.put(2, new StoreItem(2,"Headphones", 1500));
        items.put(3, new StoreItem(3,"Computer", 250000));
        items.put(4, new StoreItem(4,"HDD", 7000));
    }
    public List<StoreItem> get() {
        return basket.get();
    }

    public void add(List<Integer> ids) {
         basket.add(
                ids.stream()
                        .map(id -> items.get(id))
                        .collect(Collectors.toList())
        );
    }


}
