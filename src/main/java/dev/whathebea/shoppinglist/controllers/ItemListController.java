package dev.whathebea.shoppinglist.controllers;

import dev.whathebea.shoppinglist.entities.ItemList;
import dev.whathebea.shoppinglist.services.ItemListService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/itemList")
public class ItemListController {

    private ItemListService itemListService;
    @GetMapping
    public ItemList getItemListById(@RequestParam Long id) {
        return itemListService.getItemListById(id);
    }

    @PostMapping("/create")
    public Long addItemList(@RequestBody ItemList itemList) {
        return itemListService.addItemList(itemList);
    }

    @PostMapping("/update")
    public void updateItemList(@RequestBody ItemList itemList) {
        itemListService.updateItemList(itemList);
    }

    @PostMapping("/{id}/delete")
    public void removeItemList(@PathVariable Long id) {
        itemListService.removeItemList(id);
    }



}
