package org.zerock.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.service.BoardService;

import lombok.Getter;
import lombok.extern.log4j.Log4j;
import oracle.jdbc.proxy.annotation.Post;


@Controller
@RequestMapping("/board/*")
@Log4j
public class BoardController {
	@Inject
	private BoardService service;   // 한개 일 경우 묵시적 생성자 자동 주입 
	
	@GetMapping("/list")  //리턴값없어도 알아서 view 페이지 이동...
	public void list (Model model) {
		log.info("나와라");
		model.addAttribute("list", service.getList());
		log.info("나와라2");
		log.info(service.getList());
		
		//return "/board/list";
	}
	

	@PostMapping("/register")
	public String register (BoardVO board, RedirectAttributes rttr) {
		
		service.register(board);
		rttr.addFlashAttribute("result", board.getBno());
		return "redirect:/board/list";
		
	}
	
	
	@GetMapping("/get")
	public void get(@RequestParam("bno")Integer bno, Model model) {
		
		model.addAttribute("board", service.get(bno));
	}
	
	
	
	@PostMapping("/modify")
	public String modify (BoardVO board, RedirectAttributes rttr) {
		if(service.modify(board)) {
			rttr.addFlashAttribute("result","success");
			
		}
		return "redirect:/board/list";
	}
	
	@PostMapping("/remove")
	public String remove(@RequestParam("bno")Integer bno, RedirectAttributes rttr) {
		if(service.remove(bno)) {
			rttr.addFlashAttribute("result","success");
		}
		return "redirect:/board/list";
	}


}
