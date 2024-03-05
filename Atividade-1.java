import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
  
    Scanner scanner = new Scanner(System.in);
    
    double num1 = 0.0;
    double num2 = 0.0;
    double num3 = 0.0;
        
    System.out.println("Insira o primeiro valor:");
    num1 = scanner.nextDouble();
    
    System.out.println("Insira o segundo valor:");
    num2 = scanner.nextDouble();
    
    System.out.println("Insira o terceiro valor:");
    num3 = scanner.nextDouble();
    
    double numT = num1 + num2 + num3;
    
    System.out.println("O resultado e " + numT);
    
    
    }
}
