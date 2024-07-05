package classes;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscaCep {

    public Endereco buscaEndereco(String cep) throws InvalidCepException {


        cep = cep.replace("-", "").replace(" ", "");
        int tamanhoCep = cep.length();


        if (tamanhoCep != 8){
            throw new InvalidCepException("Cep deve ter 8 digitos");
        }

        for (int i = 0; i < cep.length(); i++){
            if (!Character.isDigit(cep.charAt(i))){
                throw new InvalidCepException("O cep deve conter apenas numeros");
            }
        }


        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Não consegui obter o endereço a partir desse CEP");
        }
        return new Gson().fromJson(response.body(), Endereco.class);
    }
}

