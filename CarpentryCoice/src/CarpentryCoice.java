import java.util.Scanner;

public class CarpentryCoice {

	static String input;

	public static void main(String[] args) {

		choosingItem();

	}

	static void choosingItem() {

		String[] str_arr = { "table", "desk", "dresser", "entertainment center" };

		for (int count = 0; count <= str_arr.length - 1; count++) {

			System.out.println(str_arr[count]);
		}

		Scanner s = new Scanner(System.in);
		System.out.print("Please enter an item: ");
		input = s.nextLine();

		switch (input) {
		
		case "tab":
			System.out.println("Price is $250.");
			break;
		case "table":
			System.out.println("Price is $250.");
			break;
		case "des":
			System.out.println("Price is $325.");
			break;
		case "desk":
			System.out.println("Price is $325.");
			break;
		case "dre":
			System.out.println("Price is $420.");
			break;
		case "dresser":
			System.out.println("Price is $420.");
			break;
		case "ent":
			System.out.println("Price is $600.");
			break;
		case "entertainment center":
			System.out.println("Price is $600.");
			break;
		default:
			System.out.println("Error: Item not in the list. ");
		}

	}

}
