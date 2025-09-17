import java.util.Scanner;
class CheckCase {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter number");
		char ch = sc.next().charAt(0);

		if(ch >=65 && ch<=90){
		System.out.println(ch + " is UPPERCASE");
		}else if(ch >=97 && ch <=122){
		System.out.println(ch + " is lowercase");
		}
	}

}
