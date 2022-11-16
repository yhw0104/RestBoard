# RestfulsimpleBoard

Controller 하나로만 만들었던 SimpleBoard를 Restful하게 바꿔보는 레파지토리


11/15
---
BoardController에 있던 게시글 추가 메서드를 Controller에는 RequestMapping를 RestController에는 PostMapping로 나눔

Write.html에 js를 삽입해 "등록"버튼을 클릭 할 때 DB에 data가 입력

11/16
---
BoardController에 있던 게시글 목록 메서드를 RestController에 삽입
  - 게시글 목록은 기본 localhost:8080 주소에 바로 데이터를 받아야 하므로 RequestMapping은 사용하지 않음

List.html에 js 삽입 -> vue.js를 사용하여 페이지 실행시 게시글 목록이 나오게 만듬
