package org.example.calculate;

import org.example.entity.Item;
import org.example.entity.OutputItem;
import org.example.repository.ItemDB;
import org.json.simple.ItemList;

import java.util.List;

public class ProcessItem {

    private List<Item> itemList = ItemDB.getList();

    public void process(){
        for (Item item : itemList){
            double taxTotal = TaxCompute.calculateTax(item.getBasePrice());
            double finalPrice = item.getBasePrice()+taxTotal - item.getBasePrice()* item.getDiscount()*0.01;
            System.out.println(finalPrice+ " final price");
            OutputItem outputItem = new OutputItem(item.getItem(), item.getBasePrice(), finalPrice);

        }
    }
}
