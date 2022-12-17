import java.util.Scanner;
public class Main {

	public static void main(String[]String) {
		
		Bank cli = new Bank("Michael Omondi", 3395324);
		
		System.out.println(cli.getClient());
		System.out.println("Account number: " + cli.getAcc_no());
		System.out.println("Balance is: " + cli.getBal());

		cli.setDep(600);
		cli.setWith(500);
		
		System.out.println("Deposit is: " + cli.getDep());
		System.out.println("Withdrawal is: " + cli.getWith());
		System.out.println("New Balance is: " + cli.getBal());

		
	}
}
