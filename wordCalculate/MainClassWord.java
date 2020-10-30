package by.issoft.wordCalculate;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class MainClassWord {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/main/resources/text.txt");
        String text = new String(Files.readAllBytes(path));

        text = text.replaceAll("[,.]", "");

        String[] words = text.split(" ");

        Map<String, Integer> keyValue = new HashMap<String, Integer>();

        for (int i = 0; i <= words.length - 1; i++) {

            if (keyValue.containsKey(words[i])) {
                int counter = keyValue.get(words[i]);
                keyValue.put(words[i], counter + 1);

            } else {
                keyValue.put(words[i], 1);
            }
        }

        System.out.println("Total word counter " + keyValue);

        Map<String, Integer> result = new LinkedHashMap<>();
        keyValue.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .forEachOrdered(x -> result.put(x.getKey(), x.getValue()));
//                        .collect(Collectors.toMap());
//                        .forEach(x -> System.out.println(x));

        System.out.println("Max 10 results " + result);
    }
}

