package proskyskypro32;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Basket {
    private final List<Item> items;

    public Basket() {
        this.items = new ArrayList<>();
    }
    public Item add(Item item) {
        items.add(item);
        return item;
    }
    public List<Item> get() {
        return new ArrayList<>(items);
    }

}
