package com.graphs.completablefuture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.CompletableFuture;

public class AsyncApiConsumptionExample {

    public static void main(String[] args) {
        String apiUrl = "https://jsonplaceholder.typicode.com/users";

        // Asynchronously consume the API
        CompletableFuture<String> apiResponseFuture = CompletableFuture.supplyAsync(() -> {
            try {
                return fetchDataFromApi(apiUrl);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        });

        // Continue performing other tasks while waiting for the API response
        System.out.println("Doing some other tasks...");

        // Get the result from the CompletableFuture (this will block until the result is available)
        try {
            String apiResponse = apiResponseFuture.get();
            System.out.println("API Response: " + apiResponse);
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
}
