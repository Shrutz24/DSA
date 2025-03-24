package questions.random;

public class L7 {
	public static void main(String[] args) {
		System.out.println("Hello");
		int num = 500000000;
		reverse(num);
	}
	public static int reverse(int num){
		System.out.println(String.valueOf(num));
		String number = String.valueOf(num);
		int rev = 0;
		if(number.startsWith("-")){
			number = "-" + new StringBuilder(number.substring(1)).reverse().toString();
		}else{
			number = new StringBuilder(number).reverse().toString();
		}
		System.out.println(number);
		try{
			rev = Integer.parseInt(number);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			return rev;
		}
		
	}
}
