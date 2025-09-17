import java.util.Scanner;
class loop{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Row");
	int row= sc.nextInt();

 for(int i =1; i<=row;i++ ){
	 int num = row;
 for(int j =1; j<=i;j++){

 System.out.print(num-- + "\t");
 }
 System.out.println();
 }
}
}
