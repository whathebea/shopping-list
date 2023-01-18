package dev.whathebea.shoppinglist.services;

import dev.whathebea.shoppinglist.entities.Item;
import dev.whathebea.shoppinglist.repositories.ItemListRepository;
import dev.whathebea.shoppinglist.repositories.ItemRepository;

public class ItemServiceImpl implements ItemService {

    private ItemRepository itemRepository;
    private ItemListRepository itemListRepository;

    @Override
    public void addItem(Item item) {
        itemRepository.save(item);
    }

    @Override
    public void removeItem(Long id) {
        itemRepository.deleteById(id);
    }

    @Override
    public void updateItem(Item item) {
        itemRepository.save(item);
    }

    @Override
    public Item getItemById(Long id) {
        return itemRepository.findById(id).orElseThrow( () -> new RuntimeException("Item not found"));
    }
}

