import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter operation (and, or, xor, not, nand, nor, xnor):");
          String operation=input.next();
          String val1=null, val2=null;
          if (operation.toLowerCase().equals("not")) {
            System.out.println("Enter a single value:");
             val1 = input.next();
          } else{
            System.out.println("Enter the first value:");
             val1=input.next();
            System.out.println("Enter the second value:");
             val2=input.next();
          }
      input.close();
        
        BooleanCalculator calculator = new BooleanCalculator();
        try{
          calculator.calculate(val1, val2, operation);
            } catch (CustomException e){
        System.out.println("Caught error: " + e.getMessage());
    }
  }
}

