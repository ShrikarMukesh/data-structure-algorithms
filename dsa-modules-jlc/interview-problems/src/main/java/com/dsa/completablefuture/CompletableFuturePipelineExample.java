package com.dsa.completablefuture;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;

public class CompletableFuturePipelineExample {

    public static void main(String[] args) {
        String apiUrl = "https://jsonplaceholder.typicode.com/users";

        // Step 1: Fetch data from the API asynchronously
        CompletableFuture<String> apiResponseFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("Step 1 Thread: " + Thread.currentThread().getName());
            try {
                return fetchDataFromApi(apiUrl);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        });

        // Step 2: Parse the JSON response into a List<User> asynchronously
        CompletableFuture<List<User>> parsedDataFuture = apiResponseFuture.thenApplyAsync(response -> {
            System.out.println("Step 2 Thread: " + Thread.currentThread().getName());
            if (response != null) {
                return parseJsonResponse(response);
            }
            return null;
        });

        // Step 3: Perform further processing on the parsed data asynchronously
        CompletableFuture<Void> processingFuture = parsedDataFuture.thenAcceptAsync(users -> {
            System.out.println("Step 3 Thread: " + Thread.currentThread().getName());
            if (users != null && !users.isEmpty()) {
                for (User user : users) {
                    System.out.println("User ID: " + user.getId() + ", Name: " + user.getName());
                }
            }
        });

        // Step 4: Continue performing other tasks while waiting for the pipeline to complete
        System.out.println("Doing some other tasks...");

        List<String> strs = List.of("mukesh","dinesh","john", "rohan");
        strs.stream()
                .sorted()
                .map(
                   s -> s.toUpperCase(Locale.CHINA)
                ).forEach(System.out::println);

        // Wait for the pipeline to complete
        CompletableFuture<Void> allStepsFuture = CompletableFuture.allOf(processingFuture);

        try {
            allStepsFuture.get(); // Block and wait for all steps to complete
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String fetchDataFromApi(String apiUrl) throws IOException {
        StringBuilder response = new StringBuilder();

        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
        }
        connection.disconnect();
        return response.toString();
    }

    private static List<User> parseJsonResponse(String jsonResponse) {
        Gson gson = new Gson();
        Type userListType = new TypeToken<List<User>>() {}.getType();
        return gson.fromJson(jsonResponse, userListType);
    }

    // Assume we have a User class for Gson to deserialize the JSON response into
    private static class User {
        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}
