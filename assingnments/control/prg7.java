import java.util.Scanner;
class Rangeof{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                char  let = sc.next().charAt(0);
		if (let<=90&& let>=65){
		if(let == 'a'|| let== 'e' ||let== 'i'||let == 'o'||let == 'u'||let == 'A'|| let== 'E' ||let== 'I'||let == 'O'||let == 'U'){
		System.out.println(let +"is a vowel ");
		}else{
		System.out.println(let +"is a constant");
		}
		}
		else if ( let <=121&& let>=97){
                if(let == 'a'|| let== 'e' ||let== 'i'||let == 'o'||let == 'u'||let == 'A'|| let== 'E' ||let== 'I'||let == 'O'||let == 'U'){
                System.out.println(let +"is a vowel ");
                }else{
                System.out.println(let +"is a constant");
                }
		}else{
			System.out.println("is not a alphabet");
		}
	
}
}


