package proskyskypro32;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path= "/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping(path = "/add")
    public void add(@RequestParam("id") List<Integer> ids) {
        storeService.add(ids);
    }

    @GetMapping(path = "/get")
    public List<StoreItem> get() {
        return storeService.get();
    }

}
//meh
