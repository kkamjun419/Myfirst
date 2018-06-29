class BankAccount
{
	int balance = 0; //예금잔액
	
	public int deposit(int amount) 
	{
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) 
	{
		balance -= amount;
		return balance;
	}
	public int chekMyBalance() 
	{
		System.out.println("잔액 :" + balance);
		return balance;
	}
}
public class A_BankAccount00 
{

	public static void main(String[] args) 
	{ 	// 두 개의 인스턴스 생성
	BankAccount yoon = new BankAccount();
	BankAccount park = new BankAccount();
	//	BankAccount park = yoon;
	
	//각 인스턴스를 대상으로 예금
	yoon.deposit(5000);
	park.deposit(3000);
	
	//각 인스턴스를 대상으로 출금
	yoon.withdraw(2000);
	park.withdraw(2000);
	
	//각 인스턴스를 대상으로 잔액 조회
	yoon.chekMyBalance();
	park.chekMyBalance();
	
	}
	
	

}
