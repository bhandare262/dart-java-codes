import java.util.Scanner;
class loop{
public static void main(String[] args){
	//char ch = 'A';
	Scanner sc = new Scanner(System.in);
	int row = sc.nextInt();
	for(int i= 1;i<=row;i++){
		char ch = (char)(64+i);
		for(int j =1;j<=i;j++){
		
		 System.out.print(ch++ + "\t");
		}
		System.out.println();
	
	}
 
}
}
