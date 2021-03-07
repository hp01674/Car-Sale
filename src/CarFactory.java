public class CarFactory {
	static CarFactory cf;
	CarPrice carPrice;

	// make constructor of this class private
	private CarFactory() {
		System.setProperty("carPriceFrom", "Tesla");
	}

	public void setCar(String ca) {
		System.setProperty("carPriceFrom", "From" + ca);
	}

	// retrieving car price
	public double getCarPrice() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		String i = System.getProperty("carPriceFrom");
		carPrice = (CarPrice) Class.forName(i).newInstance();
		return carPrice.getCarPrice();
	}

	// ensuring only one instance is created
	public static CarFactory getFactory() {
		if (cf == null)
			cf = new CarFactory();
		return cf;

	}
}
