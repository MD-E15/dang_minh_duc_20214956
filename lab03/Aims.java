
public class Aims {
	public static void main(String[] args) {
		/// create an new cart
		Cart anOrder = new Cart();
		/// 
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		
		anOrder.addDigitalVideoDisc(dvd1);
		anOrder.addDigitalVideoDisc(dvd2);
		anOrder.addDigitalVideoDisc(dvd3);
		
		System.out.println("Total Cost is " + anOrder.totalCost());
		
		anOrder.removeDigitalVideoDisc(dvd2);
		anOrder.removeDigitalVideoDisc(dvd3);

		DigitalVideoDisc dvd4 = new DigitalVideoDisc(null, null, null, 0, 0);

		anOrder.addDigitalVideoDisc(dvd1, dvd2, dvd4);
	}
}
