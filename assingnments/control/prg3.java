import java.util.Scanner;
class CheckCase {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
		System.out.println(" enter num");
		int num1 = sc.nextInt();
		System.out.println(" enter num1");
		if(num>num1){
			
		System.out.println(num + "is maximum between  "+num1+ "and "+num );
		}else if(num1>num){
		System.out.println(num1 +" is maximum between"+ num +"and "+num1);
		}else{
		System.out.println(num + "and" +num1 +" is equal");
		}
	}
}
		
