package dev.whathebea.shoppinglist.services;

import dev.whathebea.shoppinglist.entities.Item;

public interface ItemService {

    void addItem(Item item);

    void removeItem(Long id);

    void updateItem(Item item);

    Item getItemById(Long id);

}
