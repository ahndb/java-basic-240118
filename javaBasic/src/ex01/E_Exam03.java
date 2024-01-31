package ex01;

class Number {
	static int sum;
	
	public static int solution (int number) {
		if(number<=0)return 0;
		while(number>0) {
			sum += number%10;
			number /=10;
		}
		return sum;
	}
}

public class E_Exam03 {

	public static void main(String[] args) {
		
		Number number = new Number();
		
		System.out.println(number.solution(-123456789));	
	}
}
