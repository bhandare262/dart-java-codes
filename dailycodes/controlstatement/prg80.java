class pattern{
        public static void main(String[] args){
	    int	num =9;
	    char ch ='A';
                   for(int i =1;i<=10;i++){
			if(i%2==0){
				System.out.print(ch + " ");
			}else{
				System.out.print(num + "");
			}
			--num;
			ch++;
		   }
		   System.out.println( );
	}
}


