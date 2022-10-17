package proskyskypro32;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class StoreBasket {
    private final List<StoreItem> items;

    public StoreBasket() {
        this.items = new ArrayList<>();
    }
    public void add(List<StoreItem> items) {
        this.items.addAll(items);
    }

    public List<StoreItem> get() {
        return new ArrayList<>(items);
    }
}
//Meh
