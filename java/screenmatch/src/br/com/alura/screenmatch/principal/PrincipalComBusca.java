package br.com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
         .uri(URI.create("https://www.omdbapi.com/?i=tt3896198&apikey=cbfee9f5"))
         .build();
         HttpResponse<String> response = client
     .send(request, BodyHandlers.ofString()); 
     System.out.println(response.body());
    }
}
