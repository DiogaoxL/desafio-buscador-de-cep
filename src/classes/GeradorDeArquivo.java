package classes;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {

    public void salvaJson (Endereco endereco){
        Gson gson = new Gson().newBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("historico.json", true)){
            gson.toJson(endereco.cep() , writer);
        }catch (IOException e){
            System.out.println("Erro ao salvar dado no arquivo: " + e.getMessage());
        }
        System.out.println("Dados inseridos no arquivo JSON");
    }


}
