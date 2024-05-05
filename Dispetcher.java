package clc;
public class Dispetcher {
 	public static void main(String[] args) {
		Model m1 = new Model (50, 8); 
		Model m2 = new Model(100, 80);
		int summa = Controller.add(m1);
		View.displayInteger(summa);
		int sub = Controller.substruct(m2);
		View.displayInteger(sub);
	}

}
