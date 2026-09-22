public class CalculatorTest {
    public static void main(String args[]){
        Calculator newCalculator = new Calculator();

        System.out.print(newCalculator.add(1, 2)+"\n"); //Adds two integers

        System.out.print(newCalculator.add(1.53, 7.56)+"\n"); //Adds two doubles

        System.out.print(newCalculator.add(1, 2, 3)+"\n"); //Adds three integers

        System.out.print(newCalculator.add("Hello ", "World"));
    }
}
