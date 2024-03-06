import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
  
    Scanner scanner = new Scanner(System.in);
    
    double num1 = 0.0;
    double num2 = 0.0;
    double num3 = 0.0;
    double num4 = 0.0;
        
    System.out.println("Insira a primeira nota:");
    num1 = scanner.nextDouble();
    
    System.out.println("Insira a segunda nota:");
    num2 = scanner.nextDouble();
    
    System.out.println("Insira a terceira nota:");
    num3 = scanner.nextDouble();
    
    System.out.println("Insira a quarta nota:");
    num4 = scanner.nextDouble();
    
    double numT = (num1 + num2 + num3 + num4)/4;
    
    System.out.println("O resultado e " + numT);
     
    if(numT >= 6){
        System.out.println("Aprovado");
    }else{
        System.out.println("Reprovado");
    }
     
    }
}
