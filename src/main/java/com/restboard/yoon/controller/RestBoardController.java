package com.restboard.yoon.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import lombok.AllArgsConstructor;
import com.restboard.yoon.service.BoardService;
import com.restboard.yoon.dto.BoardDto;

import java.util.List;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@AllArgsConstructor
//헷갈리지 않게 /api를 사용한다.
@RequestMapping("/api")
public class RestBoardController {
    private BoardService boardService;

    // @PostMapping은 url의 주소를 숨기고 서버에 데이터 전달
    // js로 연결시켜 다음 페이지로 넘길 수 있게 만든다. (ajax사용)
    // @RequestMapping(value = "/post", method = RequestMethod.POST)처럼 사용 가능
    // 데이터 송신을 위한 url이라 눈에 안보임 ( write.html 의 등록 버튼 누르면 /post/save url에 데이터가 전달된다.)
    // 게시글 저장
    @PostMapping("/save")
    public Long write(@RequestBody BoardDto boardDto) {
        return boardService.savePost(boardDto);
    }
    
    // @GetMapping은 페이지에 데이터를 받아옴
    // 게시글 목록
    @GetMapping("/list")
    public List<BoardDto> list() {
        List<BoardDto> boardList = boardService.getBoardlist();
        return boardList;
    }
    
    // 게시글 상세조회 페이지
    @GetMapping("/post/{no}")
    public BoardDto detail(@PathVariable("no") Long no) {
        BoardDto boardDTO = boardService.getPost(no);
        
        return boardDTO;
    }

    // 게시글 수정
    @PutMapping("/post/edit/{no}")
    public BoardDto update(@PathVariable(name = "no") Long no,@RequestBody BoardDto boardDTO) {
        return boardService.updateDto(no, boardDTO);
    }

    // 여기
    // 게시글 삭제
    @DeleteMapping("/delete/{no}")
    public void delete(@PathVariable("no") Long no) {
        boardService.deletePost(no);
    }
}