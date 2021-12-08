package chap07;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor {
// 재정의해서 로그인체크 기능을 할수 있도록
	// 핸들은 컨트롤러가 함
/* preHandel : 컨트롤러 실행전
 * postHandel : 컨트롤러 실행후
 * afterCompletion : 뷰까지 다 실행된 후(완료)
 * 대부분 preHandel씀 
 */
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
		throws Exception {
		/*
		 * 여기서 해야할일
		 * 세션객체를 생성해서
		 * 로그인세션이 존재하는지 여부를 체크
		 * 존재여부에 따라서 처리
		 */
		HttpSession sess = req.getSession();
		if(sess.getAttribute("loginInfo") == null) {//로그인 안된 상태
			res.setContentType("text/html; charset=utf-8");
			PrintWriter out = res.getWriter();
			out.println("<script>");
			out.println("alert('로그인 후 이용가능합니다.')");
			out.println("location.href='/spring/user/login.do';");
			out.println("</script>");
			return false;
		} else {//로그인된 상태
			return true; //가던길 가라
		}
	}
}
