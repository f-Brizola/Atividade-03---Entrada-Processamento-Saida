import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
  
    Scanner scanner = new Scanner(System.in);
    
    String nomeP = "";
    double precoP = 0.0;
    double precoD = 0.0;
        
    System.out.println("Insira o nome do produto:");
    nomeP = scanner.nextLine();
    
    System.out.println("Insira o preco do Produto:");
    precoP = scanner.nextDouble();
    
    System.out.println("Insira o percentual de desconto:");
    precoD = scanner.nextDouble();
  
    double desconto =  precoP - precoP * (precoD / 100);
    
    System.out.println("Nome do Produto: " + nomeP);
    System.out.println("Preco com desconto " + desconto);
    
    }
}
