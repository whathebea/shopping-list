package dev.whathebea.shoppinglist.controllers;

import dev.whathebea.shoppinglist.entities.ItemList;
import dev.whathebea.shoppinglist.services.ItemListService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class Controller {

    @Autowired
    private ItemListService itemListService;

    @GetMapping("/")
    public Iterable<ItemList> showLists() {
        return itemListService.getAllItemLists();
    }
}
