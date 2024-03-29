### 기능 구현 목록
- 회원 등록
   - MySql로 옮기기
   - 실행 쿼리 보기 설정
   - 회원가입페이지(signup.html)이 Post /users로 요청
   - DB에 userDto 정보 저장
   - 생성후 로그인 화면 이동
   - 회원 가입 규칙 위반시 알림
       - 동일한 email 중복불가
       - 이름은 2~10자 숫자, 특문 X
       - 비밀번호는 8자 이상의 소문, 대문, 숫자, 특문 조합
- 회원 조회
   - Get /users로 요청 후 목록페이지(userDto-list.html)이동
- 로그인
   - 성공시 메인화면 우측 상단에 사용자 이름
   - 실패 시 맞는 실패 메시지
       - 이메일 없음
       - 비밀번호 틀림
   - 로그아웃 -> 메인화면
   - 로그인 한 유저가 로그인/회원가 접근시 메인 리다이렉트
- 회원 정보 수정
   - 본인만 가능해야 함
   - 회원 수정 페이지(signup.html)에서 PUT 사용해 요청
- 회원 탈퇴
   - MyPage > profile 하단 > 탈퇴 버튼을 추가
   - DELETE 메소드를 이용하여 탈퇴 요청

## to do list
- [x] SecurityConfig에 로그인 관련 추가
- [x] User에 UserDetails 추가
- [x] UserDetailservice 추가
- [x] UserForm 추가 및 UserForm에서 User 생성하게 변경
- [x] 회원 수정
- [x] 탈퇴
- [ ] 인증시 회원페이지 접근 가능 테스트 
- [ ] 미인증시 회원페이지 접근 실패 테스트

