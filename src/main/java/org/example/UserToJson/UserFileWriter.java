package org.example.UserToJson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class UserFileWriter {
    public static void writeUsersToFile(List<User> users, String filename) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(users);

        FileWriter writer = new FileWriter(filename);
        writer.write(json);
        writer.close();
    }
}
