import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BancoOrganizadorAtivos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList < String > ativos = new ArrayList < > ();
    
    boolean controleLoop = false;
    
    while (! controleLoop) {
      try {
        //Entrada dos tipos de ativos
        int quantidadeAtivos = scanner.nextInt();
        scanner.nextLine();
        
        // Entrada dos códigos dos ativos
        for (int i = 0; i < quantidadeAtivos; i++) {
        String codigoAtivo = scanner.nextLine();
        ativos.add(codigoAtivo);
      }
      //TODO: ordenar os ativos em ordem alfabetica
      Collections.sort(ativos);
      
      for (String ativo : ativos) {
        System.out.println(ativo);
      }
      controleLoop = true;
      
      } catch (Exception erro) {
        
        System.out.println("Algum dado inserido está incorreto!");
        scanner.nextLine();
      }
    }
  }
}