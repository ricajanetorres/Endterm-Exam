package BankAccount;

public class accountArray {
	public static void main (String [] args)
	{
		account someAccts [] = new account [10];
		int i;
		someAccts [0] = new Checking(101);
		someAccts [1] = new Savings (201 , 2.1);
		someAccts [2] = new Checking(102);
		someAccts [3] = new Checking(202 , 2.2 );
		someAccts [4] = new Savings (203);
		someAccts [5] = new Checking(203, 2.3);
		someAccts [6] = new Savings (104);
		someAccts [7] = new Checking(204, 2.4);
		someAccts [8] = new Savings (105);
		someAccts [9] = new Checking(205, 2.5);
		for ( i = 0; i < 10; ++i)
		{
			someAccts [i].getInfo();
		}
	}

}
