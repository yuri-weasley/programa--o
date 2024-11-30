import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class Livraria {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um livro que queira buscar: ");
        String busca = leitor.nextLine();

        String chave = "AIzaSyDn047gjqMRnFQZIPRaYwyfB2NzvSPzCBY";
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + busca + "&key=" + chave;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();

        HttpResponse<String> response = client.send(request, BodyHandlers.ofString()); 

        System.out.println(response.body());
    }
}
