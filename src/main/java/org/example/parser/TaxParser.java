package org.example.parser;

import org.example.entity.Tax;
import org.example.entity.TaxType;
import org.example.repository.TaxDB;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

public class TaxParser {

    JSONParser jsonParser = new JSONParser();

    public TaxParser() throws IOException, ParseException {
    }

    public void parse() throws IOException, ParseException {
        FileReader fileReader = new FileReader("src/config.json");
        JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);
       Set<String> setKeys = jsonObject.keySet();

       for (String key:setKeys){
           JSONObject keyDetail = (JSONObject) jsonObject.get(key);
           long minPrice = keyDetail.containsKey("minPrice")? (long) keyDetail.get("minPrice") :0;
           long maxPrize = keyDetail.containsKey("maxPrice")? (long) keyDetail.get("maxPrice") :Integer.MAX_VALUE;
           long taxAmount = (long) keyDetail.get("tax");
           String taxType = (String) keyDetail.get("type");

           TaxDB.add(new Tax(minPrice,maxPrize,taxAmount,taxType));
       }
    }
}
