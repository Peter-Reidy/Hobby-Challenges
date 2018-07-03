
public class runFizzBang {
	
	
	
	
	public runFizzBang(){
		
		int i = 1;
		int n = 1;
		int m = 1;
		int o = 3;
		int p = 5;
		
		while(i < 100){
			
			if (i/n == o & i/m == p){
				
				System.out.println("Fizz Buzz");
				n++;
				m++;
				
			}
			
			else if (i/n == o){
				
				System.out.println("Fizz");
				n++;
			}
			else if(i/m == p){
				System.out.println("Buzz");
				m++;
			}
			else{
				System.out.println(i);
			}
			
		
			
			i++;
		}
		
		
	}

	public static void main(String[] args) {
		new runFizzBang();

	}

}
