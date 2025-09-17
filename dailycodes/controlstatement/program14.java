class loop{


        public static void main(String[] args){
             
        for(int i = 1;i<=4 ;i++){
		 char ch = 'A';
             char  num = 97;
         if(i%2!= 0){
        for (int j=1;j<=4;j++){
                System.out.print(ch++ + " " );
                                
        }
         }
         else{
           for (int j=1;j<=4;j++){
                System.out.print (num++  + " " );
                
           }
         }

        System.out.println();
        }
        }
}
