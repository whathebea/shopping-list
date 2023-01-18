package dev.whathebea.shoppinglist.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;

@Entity
@Getter
@Setter
public class ItemList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "itemList", cascade = CascadeType.ALL)
    @OrderBy("name")
    private List<Item> items = new LinkedList<>();

}
