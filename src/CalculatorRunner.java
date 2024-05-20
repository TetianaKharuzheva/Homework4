public class CalculatorRunner {
    public static void main(String[] args) {
        MyCalculator instansMyCalculatorOne = new MyCalculator();
        instansMyCalculatorOne.isGreater(10,5);
        instansMyCalculatorOne.percentageCalculator(100,10);
        MyCalculator instansMyCalculatorTwo = new MyCalculator();
        instansMyCalculatorTwo.isGreater(4, 8);
        instansMyCalculatorTwo.percentageCalculator(100, 50);

    }
}
