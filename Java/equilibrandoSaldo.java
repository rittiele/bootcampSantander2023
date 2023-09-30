import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
  		Scanner scanner = new Scanner(System.in);
  
  		double saldoAtual = scanner.nextDouble();
  		double valorDeposito = scanner.nextDouble();
  		double valorRetirada = scanner.nextDouble();
  
  		//TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
  
        double saldoFinal = saldoAtual + valorDeposito - valorRetirada;
  			System.out.println("Saldo atualizado na conta: " + String.format("%.1f", saldoFinal));
    }
}