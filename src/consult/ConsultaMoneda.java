package consult;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

import model.Moneda;

public class ConsultaMoneda {
	String apiKey = "2d3438afd5b3f1d192502da5";
	
	
	public Moneda buscaMoneda (String baseCode, String targetCode, double monto) {
		
		
		
		URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + baseCode + "/" + targetCode + "/" + monto);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
            
        }catch (Exception e) {
            throw new RuntimeException("La moneda ingresada no es valida");
            
        }
	}
}
