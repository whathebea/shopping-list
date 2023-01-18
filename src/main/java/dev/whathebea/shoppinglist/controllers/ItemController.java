package dev.whathebea.shoppinglist.controllers;

import dev.whathebea.shoppinglist.entities.Item;
import dev.whathebea.shoppinglist.services.ItemService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/item")
public class ItemController {

    ItemService itemService;

    @GetMapping("/{id}")
    public Item getItemById(@RequestParam Long id) {
        return itemService.getItemById(id);
    }

    @PostMapping("/create")
    public void addItem(Item item) {
        itemService.addItem(item);
    }

    @PutMapping("/update")
    public void updateItem(Item item) {
        itemService.updateItem(item);
    }

    @DeleteMapping("/{id}")
    public void removeItem(@RequestParam Long id) {
        itemService.removeItem(id);
    }


}
