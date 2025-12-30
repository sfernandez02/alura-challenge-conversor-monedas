import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarApi {
    public String convertirMonedas(String morigen,String mdestino, double monto){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/6b99d791553d434857367c08/pair/"+morigen+"/"+mdestino+"/"+monto);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Moneda m = new Gson().fromJson(response.body(), Moneda.class);
            if (!"success".equalsIgnoreCase(m.result())) {
                return "Error al convertir: " + m.error_type();
            }
            return ("El valor "+monto + " [" +morigen+ "] corresponde al valor final de =>>> "+m.conversion_result()+" ["+mdestino+"]");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
