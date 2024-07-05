import classes.BuscaCep;
import classes.Endereco;
import classes.InvalidCepException;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InvalidCepException {
        Scanner sc = new Scanner(System.in);
        List<Endereco> historico = new ArrayList<>();
        System.out.println("Digite o CEP que deseja buscar: ");
        String cep = sc.nextLine();

        try {
            BuscaCep consultaCep = new BuscaCep();
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);

            System.out.println(novoEndereco);
            historico.add(novoEndereco);
            Gson gson = new Gson().newBuilder().setPrettyPrinting().create();

            try (FileWriter writer = new FileWriter("historico.json", true)){
                gson.toJson(historico , writer);
            }catch (IOException e){
                System.out.println("Erro ao salvar dado no arquivo: " + e.getMessage());
            }
            System.out.println("Dados inseridos no arquivo JSON");

        }catch (InvalidCepException e ){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}