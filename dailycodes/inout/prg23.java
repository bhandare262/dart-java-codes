import java.io.*;
class inputdemo{
      	public static void main(String[] args)throws IOException{
	       BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
       String name = br.readLine();	    
      System.out.println("Name = " + name) ;
       String compname = br.readLine();
       System.out.println("compname = " + compname);
	}
}
