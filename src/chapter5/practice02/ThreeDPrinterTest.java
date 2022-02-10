package chapter5.practice02;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		Powder powder = new Powder();
		GenericPrinter printer = new GenericPrinter();
		
		printer.setMaterial(powder);
		
		Powder p = (Powder)printer.getMaterial();

	}

}
