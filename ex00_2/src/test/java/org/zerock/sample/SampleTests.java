package org.zerock.sample;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.config.RootConfig;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {RootConfig.class})
@Log4j // Lombok 을 이용해서 로그를 기록하는 Logger 변수로 생성 별도의 Logger 객체 없이 Log4j 설정이 존재한다면 바로 사용할 수 있음 
public class SampleTests {
	
	/*
		@Log 
		public class LogExample{
		}
		
		
		---------------------------컴파일 후 -----------------------------
		
		public class LogExample{
			private static final java.util.logging.Logger log=java.util.
			logging.Logger.getLogger(LogExample.class.getName());
		}
		
	*/
	
	@Setter(onMethod = @__({@Autowired}))
	private Restaurant restaurant;
	
	
	@Test
	public void testExist() {
		assertNotNull(restaurant);
		log.info(restaurant);
		log.info("========================");
		log.info(restaurant.getChef());
	}
	
}
