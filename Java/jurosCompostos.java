import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valorInicial = scanner.nextDouble();
        
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial;

        DecimalFormat df = new DecimalFormat("#.##");
        
        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        valorFinal = valorFinal * Math.pow((1 + taxaJuros), periodo);


        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }
    public static double calculaJurosCompostos(double valorFinal, double taxaJuros, int periodo) {
      
    return valorFinal; };
}