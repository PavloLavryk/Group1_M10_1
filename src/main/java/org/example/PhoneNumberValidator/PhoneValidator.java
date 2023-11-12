package org.example.PhoneNumberValidator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public

class PhoneValidator extends Validator {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Path file = Paths.get("mobile_number.txt");
        List<String> phoneNumbers = new ArrayList<>();

        String[] lines = Files.readAllLines(file).toArray(new String[0]);
        if (lines.length == 0) {
            System.out.println("Файл не містить жодного рядка.");
        } else {
            for (String line : lines) {
                phoneNumbers.add(line.trim());
            }

            for (String phoneNumber : phoneNumbers) {
                if (VALIDATOR.matcher(phoneNumber).matches()) {
                    System.out.println(phoneNumber);
                }
            }
        }
    }
}