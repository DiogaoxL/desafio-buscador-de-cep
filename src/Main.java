import classes.BuscaCep;
import classes.Endereco;
import classes.GeradorDeArquivo;
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
        System.out.println("Digite o CEP que deseja buscar: ");
        String cep = sc.nextLine();

        try {
            BuscaCep consultaCep = new BuscaCep();
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);

            System.out.println(novoEndereco);

            GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
            geradorDeArquivo.salvaJson(novoEndereco);


        }catch (InvalidCepException e ){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}