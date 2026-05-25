package main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ApiConsumerApplication {

    static void main(String[] args) throws IOException, InterruptedException {
        Scanner readingAPI = new Scanner(System.in);
        IO.println("Digite um filme para busca: ");
        var searchAPI = readingAPI.nextLine();
        String addressAPI = "https://www.omdbapi.com/?t=" + searchAPI + "SuaAPIAQUI";


        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(addressAPI))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        IO.println(response.body());
    }
}