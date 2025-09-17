class pattern{
        public static void main(String[] args){
                  char ch1 ='A';
		 char ch2 = 'a';
		for(int i=1; i<=10;i++){
			if(i%2==1){
				System.out.print(ch1 + " ");
			}else{
				System.out.print(ch2 + " ");
			}
			ch1++;
			ch2++;
		}
		System.out.println( );
	}
}

			
