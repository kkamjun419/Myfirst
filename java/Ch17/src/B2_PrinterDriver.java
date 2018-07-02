interface Printable3
{
	void print(String doc);
	default void printCMYK(String doc) {}
}

class Prn731Drv4 implements Printable3 
{
	@Override
	public void print(String doc) 
	{
		System.out.println("Form MD-731 printer");
		System.out.println(doc);
	}
}

class Prn909Drv4 implements Printable3 
{
	@Override
	public void print(String doc) 
	{
		System.out.println("Form MD-909 black & white ver");
		System.out.println(doc);
	}
	
	@Override
	public void printCMYK(String doc) {
		System.out.println("From MD-909 CMYK ver");
		System.out.println(doc);
	}
}
public class B2_PrinterDriver {

	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		
		ColorPrintable2 prn = new Prn909Drv3();
		prn.print(myDoc);
		
		System.out.println();
		prn.printCMYK(myDoc);

	}

}
