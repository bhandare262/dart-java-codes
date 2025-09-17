class loop{
 public static void main(String[] args){
	 int row = 3;
  for(int i =1;i<=row;i++){
	  char ch = (char)(96+row);
	  for(int j=1;j<=row;j++){
       System.out.print(ch-- + "\t" );
  }
  System.out.println();
  }
 }
}
