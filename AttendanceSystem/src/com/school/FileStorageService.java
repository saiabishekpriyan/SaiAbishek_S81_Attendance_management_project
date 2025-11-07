package com.school;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.List;

public class FileStorageService {

    public void saveData(List<? extends Storable> items, String filename) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
            for (Storable item : items) {
                pw.println(item.toDataString());
            }
            System.out.println("✅ Data saved to " + filename);
        } catch (IOException e) {
            System.err.println("❌ Error saving data to " + filename + ": " + e.getMessage());
        }
    }
}
