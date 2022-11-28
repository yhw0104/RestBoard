package com.restboard.yoon.controller;

import com.restboard.yoon.dto.BoardDto;
import com.restboard.yoon.service.BoardService;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller // 컨트롤러임을 명시하는 어노테이션
            // MVC에서 컨트롤러로 명시된 클래스의 메서드들은 return 값으로 템플릿 경로를 작성하거나, redirect를 해줘야 합니다.
@AllArgsConstructor
public class BoardController {

    private BoardService boardService;

    @RequestMapping("/")
    public String list() {
        return "board/list.html";
    }

    // 게시글 추가
    // RequestMapping은 메소드 지정을 안해서 씀
    @RequestMapping("/post")
    public String write() {
        return "board/write.html";
    }
    
    // 게시글 상세조회 페이지
    @RequestMapping("/post/{no}")
    public String detail() {
        return "board/detail.html";
    }

    // 게시글 수정 페이지
    @RequestMapping("/post/edit/{no}")
    public String edit() {
        return "board/update.html";
    }


    // 게시글 삭제
    // @RequestMapping("/delete/{no}")
    // public String delete() {
    //     return "redirect:/";
    // }

    // 게시글 검색
    // 특별한 것은 없고, 클라이언트에서 넘겨주는 keyword를 검색어로 활용
    @GetMapping("/board/search")
    public String search(@RequestParam(value = "keyword") String keyword, Model model) {
        List<BoardDto> boardDtoList = boardService.searchPosts(keyword);

        model.addAttribute("boardList", boardDtoList);

        return "board/list.html";
    }

}