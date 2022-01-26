package org.example.parser;

import org.example.entity.Item;
import org.example.repository.ItemDB;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

public class InputParser {
    private Item item = new Item();
    JSONParser jsonParser = new JSONParser();

    public void parse() throws IOException, ParseException {

        FileReader fileReader = new FileReader("src/input.json");
        JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);
        String itemName = (String) jsonObject.get("item");

       item.setBasePrice((Long) jsonObject.get("basePrice"));
       if(jsonObject.containsKey("discount")){
           item.setDiscount((Long) jsonObject.get("discount"));
       }
       else {
           item.setDiscount(0);
       }
        ItemDB.add(item);
    }
}
