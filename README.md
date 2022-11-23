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

11/17~11/23
---
게시글 상세조회 페이지, 게시글 수정 페이지 완성
 - jquery를 사용하여 RestController의 GetMapping을 이용하여 데이터를 ajax로 받아옴
 - button태그 클릭시 다음 페이지로 넘어가게 js 작성
 - 게시글 수정 페이지로 넘어갈 때 get방식으로 데이터를 받아옴(value로 데이터를 받아와 input태그 안에 데이터 넣기)
 
 게시글 수정 RestController 작성
 - update.html에서 put 방식을 이용하여 데이터 수정 (작성중)
