
public class Bank {

	static String Client;
	static int Acc_no;
	static double Dep;
	static double With;
	static double Bal = 10000;

	Bank(String name, int account_no) {

		Client = name;
		Acc_no = account_no;

	}

	public static String getClient() {
		return Client;
	}

	public static void setClient(String client) {
		Client = client;
	}

	public static int getAcc_no() {
		return Acc_no;
	}

	public static void setAcc_no(int acc_no) {
		Acc_no = acc_no;
	}

	public static double getBal() {
		Bal = (Bal + Dep) - With;
		return Bal;
	}

	public static void setBal(double bal) {
		Bal = bal;

	}

	public static double getDep() {

		return Dep;
	}

	public static void setDep(double dep) {

		if (dep < 0) {
			System.out.println("You cannot deposit a value less than 0: ");
		} else if (dep >= 0) {
			Dep = dep;
		}
	}

	public static double getWith() {
		return With;
	}

	public static void setWith(double with) {

		if (With > Bal) {
			System.out.println("No sufficient funds available");
		}
		With = with;
	}

}
