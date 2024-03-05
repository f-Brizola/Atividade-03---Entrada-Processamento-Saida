import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
  
    Scanner scanner = new Scanner(System.in);
    
    double num1 = 0.0;
    double num2 = 0.0;
        
    System.out.println("Insira a primeira nota:");
    num1 = scanner.nextDouble();
    
    System.out.println("Insira a segunda nota:");
    num2 = scanner.nextDouble();
    
    double numT = (num1 + num2)/2;
    
    System.out.println("O resultado e " + numT);
    
    
    }
}
