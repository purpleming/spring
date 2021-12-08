package chap03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		MemberController con = ctx.getBean("memberController", MemberController.class);
		con.insert("홍길동");
	}

}
