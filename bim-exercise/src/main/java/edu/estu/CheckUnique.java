package edu.estu;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class CheckUnique {

    public static void main(String[] args) {
        List<String> lines;

        try {
            lines = Files.readAllLines(Paths.get("uniquetest.txt"), StandardCharsets.UTF_8);
            List<String> uniqLines = new ArrayList<>(new HashSet<>(lines));
            System.out.println("Unique lines of the text is: " + uniqLines.size());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
