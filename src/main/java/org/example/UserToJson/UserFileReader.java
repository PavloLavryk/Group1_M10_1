package org.example.UserToJson;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserFileReader {
    public static List<User> readUsersFromFile(String filename) throws IOException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        scanner.nextLine();  // Пропускаємо перший рядок (заголовок)

        List<User> users = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String[] data = scanner.nextLine().split(" ");
            users.add(new User(data[0], Integer.parseInt(data[1])));
        }
        scanner.close();

        return users;
    }
}