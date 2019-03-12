package org.zerock.sample;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {org.zerock.config.RootConfig.class})
@Log4j
public class BoardMapperTests {

	
	@Setter(onMethod_=@Autowired)	
	private BoardMapper mapper;
//	@Test
//	public void test() {
//		mapper.getList().forEach(i->log.info(i));;
//	
//	}
//	
	@Test
	public void test2() {
		BoardVO board = new BoardVO();
		
		board.setTitle("새로 작성 20190217");
		board.setContent("새로 작성하는 내용");
		board.setWriter("newbie");
		mapper.insert(board);
		
		log.info(board);
	
	}
	
	@Test
	public void testRead() {
		BoardVO board= mapper.read(264165);
		
		log.info(board);
	}

}
