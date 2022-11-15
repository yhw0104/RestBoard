package com.restboard.yoon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.AllArgsConstructor;
import com.restboard.yoon.service.BoardService;
import com.restboard.yoon.dto.BoardDto;

@RestController
@AllArgsConstructor
//헷갈리지 않게 /api를 사용한다.
@RequestMapping("/api")
public class RestBoardController {
    private BoardService boardService;

    // @PostMapping은 url의 주소를 숨기고 데이터 전달
    // js로 연결시켜 다음 페이지로 넘길 수 있게 만든다. (ajax사용)
    // @RequestMapping(value = "/post", method = RequestMethod.POST)처럼 사용 가능
    // 데이터 송신을 위한 url이라 눈에 안보임 ( write.html 의 등록 버튼 누르면 /post/save url에 데이터가 전달된다.)
    @PostMapping("/save")
    public Long write(@RequestBody BoardDto boardDto) {
        return boardService.savePost(boardDto);
    }
}
