package junit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes =chap07.MvcConfig.class)
public class Test2 {
	
	@Autowired
	
	
	@Autowired
	BoardDao boardDao;
	
	@Test
	public void boardDaoTest() {
		int cnt = boardDao.count(new boardVo());
		System.out.println(cnt);
	}
}
