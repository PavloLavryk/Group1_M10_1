package org.example.Sort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Word_Sort{
    public static void main(String[] args) {
        String filename = "words.txt";

        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line;
            while((line = reader.readLine()) != null){
                String [] words = line.split("\\s+");
                for (String word : words){
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);

                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
