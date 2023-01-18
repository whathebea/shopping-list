package dev.whathebea.shoppinglist.services;

import dev.whathebea.shoppinglist.entities.ItemList;
import dev.whathebea.shoppinglist.repositories.ItemListRepository;

public class ItemListServiceImpl implements ItemListService {

    private ItemListRepository itemListRepository;

    @Override
    public Long addItemList(ItemList itemList) {
        return itemListRepository.save(itemList).getId();
    }

    @Override
    public void removeItemList(Long id) {
        itemListRepository.deleteById(id);
    }

    @Override
    public void updateItemList(ItemList itemList) {
        itemListRepository.save(itemList);
    }

    @Override
    public ItemList getItemListById(Long id) {
        return itemListRepository.findById(id).orElseThrow( () -> new RuntimeException("Item list not found"));
    }

    @Override
    public Iterable<ItemList> getAllItemLists() {
        return itemListRepository.findAll();
    }
}
