package org.example.calculate;

import org.example.entity.Tax;
import org.example.entity.TaxType;
import org.example.repository.TaxDB;

import java.util.List;

public class TaxCompute {
    static List<Tax> taxList = TaxDB.getTaxDB();

    public static double calculateTax(double price){
        double taxedAmount = 0;
        for(Tax tax:taxList){

            if(price>=tax.getMinPrice() && price<tax.getMaxPrice() ){

                if (tax.getTaxType().equals("percentage")){
                    taxedAmount += price*(tax.getTaxAmount())*0.01;
                }else {
                    taxedAmount += tax.getTaxAmount();
                }
            }
        }
        return taxedAmount;
    }
}
