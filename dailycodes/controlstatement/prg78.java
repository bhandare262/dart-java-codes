class pattern{
        public static void main(String[] args){
                   int num= 1;
		  char ch = 'A' ;
		  for(int i=1;i<=10;i++){
			  if(i%2==0){
				System.out.print(num + " ");
			  }else{
				System.out.print(ch + " " );
			  }
			  ++num;
			  ++ch;
		  }
				System.out.println();
	}
}
