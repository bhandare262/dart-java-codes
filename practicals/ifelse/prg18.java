class ifelse{
	public static void main(String[] args){
		float percentage = 85f;
		if(percentage>=85.00){
			System.out.println("pass = first class with distinction");
		} else if(percentage>=60.00){
			System.out.println("pass = second class");
		}else if(percentage>=36.00){
			System.out.println("pass");
		}else{
			System.out.println("fail");
		}
	}
}
