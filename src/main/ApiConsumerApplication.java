package main;

import br.com.alura.screenmatchGCAlura.Exception.YearConversionErrorException;
import br.com.alura.screenmatchGCAlura.Models.Title;
import br.com.alura.screenmatchGCAlura.Models.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jdk.jshell.spi.ExecutionControlProvider;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


public class ApiConsumerApplication {

    static void main() throws IOException, InterruptedException {

        Scanner readingAPI = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");

        var searchAPI = readingAPI.nextLine();
        String addressAPI = "https://www.omdbapi.com/?t=" + searchAPI.replace(" ", "+") + "&apikey=2fd60ec3";

        try
        {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(addressAPI))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();


            TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);
            System.out.println((myTitleOmdb));
            //try {
            Title myTitle = new Title(myTitleOmdb);
            System.out.println("Titulo ja convertido");
            System.out.println(myTitle);
            }
            catch (NumberFormatException e){
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            }
            catch (IllegalArgumentException e)
            {
                    System.out.println("Algum erro de argumento na busca, verifique o endereco");
            }
            catch (YearConversionErrorException e)
            {
                System.out.println(e.getMessage());
        }

        System.out.println("O Programa finalizou corretamente!");
    }

}