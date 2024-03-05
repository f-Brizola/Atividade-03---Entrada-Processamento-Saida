import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
  
    Scanner scanner = new Scanner(System.in);
    
    double num1 = 0.0;
    double num2 = 0.0;
        
    System.out.println("Insira o primeiro valor:");
    num1 = scanner.nextDouble();
    
    System.out.println("Insira o segundo valor:");
    num2 = scanner.nextDouble();
    
    double numA = num1 + num2;
    double numS = num1 - num2;
    double numD = num1 / num2;
    double numM = num1 * num2;
    
    System.out.println("Soma: " + numA);
    System.out.println("Subtracao " + numS);
    System.out.println("Divisao " + numD);
    System.out.println("Multiplicacao " + numM);
    
    }
}
