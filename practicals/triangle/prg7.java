import java.util.*;
class loop{
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row= sc.nextInt();
        for(int i = row;i>=row;i--){

                for(int j=row;j>=i;j--){
			
                        System.out.print( i +"\t");


                }
                System.out.println();

        }


}
}
