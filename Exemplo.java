import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
    double saldo = 0.0;
    double valorSaque = 0.0;
        
    Scanner scanner = new Scanner(System.in);    
        
    System.out.println("Informe o saldo da conta");
    saldo = scanner.nextDouble();
    
    System.out.println("Qual o valor do saque");
    valorSaque = scanner.nextDouble();
    
    double novoSaldo = saldo - valorSaque;
    
    System.out.println("Novo saldo e " + novoSaldo);
    
    
    }
}
