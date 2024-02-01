package ex01;

import java.util.List;

class NumList {
	
	List<Integer> numList;
	
	public static int solution (int[] solution) {
			for (int i = 0; i < solution.length; i++) {
				if(solution[i] < 0)
					return i;
				if (solution[i] >= 0) return -1;
			}
			return 0;
	}
}

public class C_Exam01a {

	public static void main(String[] args) {

		NumList numlist = new NumList();
		System.out.println(numlist.solution());	
	}
}