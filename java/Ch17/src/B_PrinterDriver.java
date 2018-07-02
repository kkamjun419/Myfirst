interface Printable2 
{
	void print(String doc);
}
interface ColorPrintable2 extends Printable2 {
	void printCMYK(String doc);
}

//새로운 프린터의 드라이버
class Prn909Drv3 implements ColorPrintable2 {
	@Override
	public void print(String doc) {
		System.out.println("Form MD-909 black & white ver");
		System.out.println(doc);
	}
	@Override
	public void printCMYK(String doc) {
		System.out.println("From MD-909 CMYK ver");
		System.out.println(doc);
	}
}
public class B_PrinterDriver {

	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		
		ColorPrintable2 prn = new Prn909Drv3();
		prn.print(myDoc);
		
		System.out.println();
		prn.printCMYK(myDoc);

	}

}
