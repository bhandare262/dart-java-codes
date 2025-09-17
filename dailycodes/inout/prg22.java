import java.io.*;
class inputdemo{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String name = br.readLine();
		System.out.println("Name =" + name);
		br.close();
		String compname = br.readLine();
		System.out.println("compname = " + compname);
	}
}


