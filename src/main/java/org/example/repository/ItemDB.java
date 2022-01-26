package org.example.repository;

import org.example.entity.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemDB {
    private static List<Item> list = new ArrayList<>();

    public static void add(Item item){
        list.add(item);
    }

    public static List<Item> getList(){
        return list;
    }
}
