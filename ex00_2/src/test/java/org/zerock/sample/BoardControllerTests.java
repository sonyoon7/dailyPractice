package org.zerock.sample;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
//test 확장
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration //servletContext 를 이용하기 위해서 
//설정파일
@ContextConfiguration(classes= {org.zerock.config.RootConfig.class,
								org.zerock.config.ServletConfig.class
})
@Log4j
public class BoardControllerTests {
	
	
	@Setter(onMethod_= {@Autowired}) //setter 만들어주고 자동으로 @Autowired 붙여줌 
	private WebApplicationContext ctx;
	
	private MockMvc  mockMvc;
	
	
	@Before
	public void setup() {
		this.mockMvc=MockMvcBuilders.webAppContextSetup(ctx).build();
		System.out.println(this);
	}
	
	@Test
	public void testList()throws Exception {
		
		log.info(
				mockMvc.perform(MockMvcRequestBuilders.get("/board/list"))
				.andReturn()
				.getModelAndView()
				.getModelMap()
				
				);
		
		
	}
	
	
//	@Test
//	public void testRegister()throws Exception {
//		
//		String resultPage=mockMvc.perform(MockMvcRequestBuilders.post("/board/register")
//				.param("title", "테스트 새글 제목")
//				.param("content","테스트 새글 내용")
//				.param("writer", "user00")
//				).andReturn().getModelAndView().getViewName();
//		
//		log.info(resultPage);
//		
//		
//	}
	
//	@Test
//	public void testModify()throws Exception {
//		
//		String resultPage=mockMvc.perform(MockMvcRequestBuilders.post("/board/modify")
//				.param("bno", "264277")
//				.param("title", "테스트 새글 제목2")
//				.param("content","테스트 새글 내용")
//				.param("writer", "user00")
//				).andReturn().getModelAndView().getViewName();
//		
//		log.info(resultPage);
//	}
	
//	@Test
//	public void testRemove()throws Exception {
//		
//		String resultPage=mockMvc.perform(MockMvcRequestBuilders.post("/board/remove")
//				.param("bno", "264277")
//			
//				).andReturn().getModelAndView().getViewName();
//		
//		log.info(resultPage);
//	}
	
	
	
	
}
