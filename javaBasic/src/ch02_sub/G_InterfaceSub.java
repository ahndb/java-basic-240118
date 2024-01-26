package ch02_sub;

public class G_InterfaceSub implements G_Message {

	void method1 () {
		System.out.println(GREETING_MASSAGE);// implements 사용해서 변수 사용시
		
		System.out.println(GOODBYE_MASSAGE);
	}

	void method2 () {
		System.out.println(G_Message.GREETING_MASSAGE);// 스테틱변수 활용
		
		System.out.println(G_Message.GOODBYE_MASSAGE);
	}
	
}
