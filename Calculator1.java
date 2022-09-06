public class Calculator1 {

    public static void main(String[] args) {
        Calc1(10, 15, '+');
        Calc1(10, 15, '-');
        Calc1(10, 15, '*');
        Calc1(10, 15, '/');
    }

    private static void Calc1(double a, double b, char operation) {
        double result = 0;
        switch (operation) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = a / b;
            default -> System.out.println("Incorrect operation");
        }
       System.out.println("Operation result" + operation + " = " + result);

    }

//  public static void Calc1(double a, double b, char operation) {
//      if (operation == '+') {
//          System.out.println(a + b);
//      } else if (operation == '-') {
//           System.out.println(a - b);
//        } else if (operation == '*') {
//            System.out.println(a * b);
//       } else if (operation == '/') {
//            System.out.println(a / b);
//        } else System.out.println("Incorrect type of operation");


    }



