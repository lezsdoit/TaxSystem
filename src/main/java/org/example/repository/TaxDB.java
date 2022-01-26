package org.example.repository;

import org.example.entity.Tax;

import java.util.ArrayList;
import java.util.List;

public class TaxDB {

    private static List<Tax> list = new ArrayList<>();

    public static List<Tax> getTaxDB(){
        return list;
    }

    public static void add(Tax tax){
        list.add(tax);
    }
}
