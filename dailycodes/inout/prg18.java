import java.io.*;
class inputdemo{
	public static void main(String[] args){
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String name = br.readline();
		System.out.println(name);
	}
}
