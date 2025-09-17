class loop{
     public static void main(String[] args){
	     int row = 4;
	     int num =1;
        for(int i =1;i<=row;i++){
		 char ch = (char)(64 + row);
	for(int j = 1;j<=row;j++){
		System.out.print(ch + "" + num + "\t");
		num++;
	
	}
	System.out.println();
	}
     }
}
