import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite um número de cep para consulta: ");
        var cep = scanner.nextLine();

        try {
            Endereco endereco = consultaCep.buscarEndereco(cep);
            System.out.println(endereco);
            GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
            geradorDeArquivo.salvaJson(endereco);
        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
        }
    }
}
