package ch.bbw.consolecalculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Calculator calculator = new Calculator();
    	int valueA = 0;
    	int valueB = 0;
    			
    	valueA = 10;
    	valueB = 5;
    	
    	System.out.println("Console Calculator");
    	System.out.println("==================");
    	System.out.println(calculator.summe(valueA, valueB));
    	
    	System.out.println("Console Calculator");
    	System.out.println("==================");
    	System.out.println(calculator.subtraction(valueA, valueB));
    	
    	System.out.println("Console Calculator");
    	System.out.println("==================");
    	System.err.println(calculator.division(valueA, valueB));

    	System.out.println("Console Calculator");
    	System.out.println("==================");
    	System.err.println(calculator.multiplikation(valueA, valueB));
	
    }
}
