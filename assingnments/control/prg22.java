import java.util.Scanner;
class Program2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		char ch = sc.next().charAt(0);

		switch(ch){
			case 'A':
				System.out.println("Excellent");
			case 'B':
				System.out.println("very good");
			case 'C':
				System.out.println("good");
			case 'D':
				System.out.println("fair");
			case 'F':
				System.out.println("fail");
			case 'O':
				System.out.println("Outstanding");
		}
	}
}



