import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first value:");
        String val1 = input.next();
        
        System.out.println("Enter second value:");
        String val2 = input.next();
        
        System.out.println("Enter operation (or, and, xor, not1 (not val1), not2 (not val2), nand, nor, xnor):");
        String operation = input.next();
        
        input.close();
        
        BooleanCalculator calculator = new BooleanCalculator();
        try{
        calculator.calculate(val1, val2, operation);
    } catch (CustomException e){
      System.out.println("Caught error: " + e.getMessage());
    }
}
}

