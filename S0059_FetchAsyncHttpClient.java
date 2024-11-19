import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

interface S0059_FetchAsyncHttpClient {

  static void onFetch(String content) {
    System.out.println(content);
  }

  static void fetch(URI uri) throws Exception {
    try (var httpClient = HttpClient.newHttpClient()) {
      var req = HttpRequest.newBuilder(uri)
          .GET()
          .build();
       httpClient
          .sendAsync(req, BodyHandlers.ofString())
          .thenApply(HttpResponse::body)
          .thenAccept(S0059_FetchAsyncHttpClient::onFetch);
    }
  }

  static void main(String... args) throws Exception {
    var uri = URI.create("https://airhacks.fm");
    fetch(uri);
  }
}