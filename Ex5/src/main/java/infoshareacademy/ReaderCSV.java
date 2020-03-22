package main.java.infoshareacademy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReaderCSV {
    private ArrayList<String[]> data = new ArrayList<String[]>();
    BufferedReader bufferReader = null;

    public ArrayList<String[]> readCSV(String csvFile) {
        try {
            bufferReader = new BufferedReader(new FileReader("Ex5/resources/" + csvFile + ".csv"));
            String row;
            while ((row = bufferReader.readLine()) != null) {
                String [] rows = row.split(",");
                data.add(rows);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferReader != null) {
                try {
                    bufferReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return data;
    }
}
