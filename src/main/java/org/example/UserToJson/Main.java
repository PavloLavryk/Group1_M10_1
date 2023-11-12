package org.example.UserToJson;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<User> users = UserFileReader.readUsersFromFile("file.txt");
        UserFileWriter.writeUsersToFile(users, "user.json");
    }
}