import java.util.Scanner;

// test
public class Driver {
	// main method
	public static void main(String[] args)
			// throw exceptions if error occurs with user input
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		CarFactory cf = CarFactory.getFactory();

		// default value
		String carName = "Tesla";

		// creating a scanner for user input
		Scanner input = new Scanner(System.in);
		System.out.println("Which car would you like to know the average price of? " + "Tesla, Jeep, or a Porsche? ");
		carName = input.next();

		cf.setCar(carName);
		System.out.println("The average price of a " + carName + " is $" + cf.getCarPrice());

	}
}
