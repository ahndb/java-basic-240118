package ch02;

// 캡슐화: 멤버 변수(속성)와 메서드를 묶어서 변수에 대한 조작을 메서드를 통해서만 할 수 있도록 하는 것 
// 정보 은닉과 데이터 보호, 데이터 무결성을 보장할 수 있음
class FootballPlayerB {
	private String name;
	// 생일은 절대 바뀌지 않음, 그래서 절대 바뀌지 않는 정보는 setter 은 만들지 않음.
	private String birth; 
	private String team;
	private int goal;
	
	FootballPlayerB (String name, String birth, String team, int goal){
		this.name = name;
		this.birth = birth;
		this.team = team;
		this.goal = goal;
	}
	
	String getName () {
		return this.name;
	}
	
	String getBirth () {
		return this.birth;
	}
	
	String getTeam () {
		return this.team;
	}
	
	int getGoal () {
		return this.goal;
	}
	
	void setName (String name) {
		this.name = name;
	}
	
	void setTeam (String team) {
		this.team = team;
	}
	
	void setGoal (int goal) {
		if (goal < 0) return; // 골은 -1이 없어서 -1이 들어가는 경우를 방지해 준다.
		this.goal = goal;	  // 제약조건을 걸게됨	
	}
}

class FootballPlayerC {
	private String name;
	private String birth; 
	private String team;
	private int goal;
	
	FootballPlayerC(String name, String birth, String team, int goal) {
		// super(); // 생성자, 상위클래스=object, 삭제가능
		this.name = name;
		this.birth = birth;
		this.team = team;
		this.goal = goal;
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getTeam() {
		return team;
	}
	
	void setTeam(String team) {
		this.team = team;
	}
	
	int getGoal() {
		return goal;
	}
	
	void setGoal(int goal) {
		this.goal = goal;
	}
	
	String getBirth() {
		return birth;
	}
	
}

public class E_Encapsulation {

	public static void main(String[] args) {
			
		FootballPlayerB son = new FootballPlayerB("손흥민", "920000", "토트넘 홋스퍼", 0);
//		son.name = "손흥민";
//		son.team = "토트넘 홋스퍼";
//		son.goal = 0;
		
		son.setGoal(-1);
		
		System.out.println(son.getGoal());
		
	}

}
