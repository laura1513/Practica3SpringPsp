package api;

import org.springframework.web.reactive.function.client.WebClient;

public class ApiClient {
    public static void main(String[] args) {
        WebClient webClient1 = WebClient.create();  //with empty URI

        WebClient webClient2 = WebClient.create("https://client-domain.com");
    }
}
