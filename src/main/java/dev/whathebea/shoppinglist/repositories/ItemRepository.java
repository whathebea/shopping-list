package dev.whathebea.shoppinglist.repositories;

import dev.whathebea.shoppinglist.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}


