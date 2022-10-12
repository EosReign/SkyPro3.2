package proskyskypro32;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/order")
public class ShopController {
    private final ShopService shopService;
    ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping(path = "/add")
    public Item addShop(@RequestParam("id") List<Integer> ids) {
        return shopService.add(ids);
    }
    @GetMapping(path = "/get")
    public Item getShop(@RequestParam("id") List<Integer> ids) {
        return shopService.add(ids);
    }

}
