import java.util.Scanner;
class Program3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String Size = sc.next();
		switch(Size){
			case "S":
				System.out.println("small");
				break;
			case "M":
				System.out.println("Medium");
				break;
			case "L":
				System.out.println("Large");
				break;
			case "Xl":
				System.out.println("Extra large");
					break;
			case "XXL":
			System.out.println("Extra Extra Large ");
			break;
			case "XXXL":
			System.out.println("Triple Extra Large");
			break;
		}
	}
}

