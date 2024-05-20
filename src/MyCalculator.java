public class MyCalculator {
    public boolean isGreater (double parametrOne,double parametrTwo){
        boolean isParametrOneBiggerTwo = parametrOne > parametrTwo;
        System.out.println("Resalt of creater = "+ isParametrOneBiggerTwo);
        return isParametrOneBiggerTwo;


    }
    public double percentageCalculator (double value, int percentage){
        double resaltPercentage = (value*percentage/100);
        System.out.println(" Resalt percentage = " + resaltPercentage);
        return resaltPercentage;
    }


}
