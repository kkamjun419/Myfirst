//기본 자료형의 값을 감싸는 랩퍼클래스
public class A_UseWrapperClass 
{
	public static void showData(Object obj)
	{
		System.out.println(obj);
	}
	
	public static void main(String[] args) 
	{	
		
		Integer iInst = new Integer(3);
		showData(iInst);
		
		
		showData(new Double(7.15));
	}
	
}
