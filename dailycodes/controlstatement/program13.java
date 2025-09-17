class loop{


        public static void main(String[] args){
             char ch = 'A';
	     int num = 1;
        for(int i = 1;i<=4 ;i++){
         if(i%2!= 0){
        for (int j=1;j<=3;j++){
                System.out.print(num + " " );
				num++;
	}
	 }
         else{
	   for (int j=1;j<=3;j++){
                System.out.print (ch + " " ); 
		ch++;
	   }                                           
	 }
        
        System.out.println();
	}
        }
}

