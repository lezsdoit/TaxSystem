package org.example;


import org.example.calculate.ProcessItem;
import org.example.parser.InputParser;
import org.example.parser.TaxParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, ParseException {


        TaxParser taxParser = new TaxParser();
        taxParser.parse();

        InputParser inputParser = new InputParser();
        inputParser.parse();

        ProcessItem processItem = new ProcessItem();
        processItem.process();

    }
}
