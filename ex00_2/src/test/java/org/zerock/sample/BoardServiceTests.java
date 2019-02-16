package org.zerock.sample;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mapper.BoardMapper;
import org.zerock.service.BoardService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {org.zerock.config.RootConfig.class})
@Log4j	
public class BoardServiceTests {
	
	
	@Setter(onMethod=@__({@Autowired})) //setter 메서드 생성시 추가할 어노테이션
	private BoardService service;
	
//	@Test
//	public void test() {
//
//	log.info(service);
//	assertNotNull(service);
//	
//	}
//	
	
	@Test
	public void testGetList() {

		service.getList().forEach(board->log.info(board));
	}

}
