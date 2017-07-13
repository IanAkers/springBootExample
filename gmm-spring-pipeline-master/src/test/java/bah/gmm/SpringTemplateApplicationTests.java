package bah.gmm;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringTemplateApplicationTests {

	@Test
	public void contextLoads() {
	}


	@Test
	public void alwaysPass(){
		assertEquals("10 x 1 must be 10",10,10*1);
	}

//	@Test
//	 public void alwaysFail(){
//	     assertEquals("10 x 0 must be 10",10,10*0);
//	 }


}
