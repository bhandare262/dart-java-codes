class ifelse{
	public static void main(String[] args){
		int num1=1200;
		int num2=1000;
		if(num1>num2){
			System.out.println("profit of"+   ( num1 - num2));
		}else if(num1<num2){
			System.out.println("loss of" + (num2 -num1));
		}else{
			System.out.println("no loss no profit");
		}
	}
}
