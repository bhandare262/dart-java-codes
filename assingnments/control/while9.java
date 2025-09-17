class OddSum{
        public static void main(String[] args){
		int i = 150;
		int Sum =0;
		while(i>=101){
			if(i%2!=0){
				Sum =Sum +i;
			}
			i--;
		}

		System.out.println(Sum);
		
	}
}
