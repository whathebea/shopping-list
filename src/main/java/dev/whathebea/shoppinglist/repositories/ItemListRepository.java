package dev.whathebea.shoppinglist.repositories;

import dev.whathebea.shoppinglist.entities.ItemList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemListRepository extends JpaRepository<ItemList, Long> {
}
