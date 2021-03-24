
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleCalculator calculator = new SimpleCalculator();
		calculator.setFirstNumber(5.0);
		calculator.setSecondNumber(4.0);
		
		System.out.println("Add= " + calculator.getAdditionalResult());

		System.out.println("Subtraction= " + calculator.getSubtractionResult());

		calculator.setFirstNumber(5.25);
		calculator.setSecondNumber(0.0);
		
		System.out.println("Multiplication= " + calculator.getMultiplicationResult());

		System.out.println("Division= " + calculator.getDivisionResult());

	}

}
