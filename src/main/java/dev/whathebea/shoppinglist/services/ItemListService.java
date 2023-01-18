package dev.whathebea.shoppinglist.services;

import dev.whathebea.shoppinglist.entities.ItemList;

public interface ItemListService {

    Long addItemList(ItemList itemList);

    void removeItemList(Long id);

    void updateItemList(ItemList itemList);

    ItemList getItemListById(Long id);

    Iterable<ItemList> getAllItemLists();
}

