  ## 🚀 API 명세서

### 📌 Member API

| 기능 | 메서드 | URL | 요청 본문(JSON) | 설명 |
| :-- | :-- | :-- | :-- | :-- |
| 회원 생성 | POST | `/members` | `{"name":"홍길동","email":"test@test.com"}` | 회원을 생성합니다 |
| 회원 조회 | GET | `/members` | 없음 | 모든 회원 조회 |
| 회원 수정 | PUT | `/members/{id}` | `{"name":"김규범","email":"kyu@test.com"}` | 회원 정보 수정 |
| 회원 삭제 | DELETE | `/members/{id}` | 없음 | 회원 삭제 |
### 📷 Postman 테스트

<img width="700" height="420" alt="postman test" src="https://github.com/user-attachments/assets/32bcef5e-c93e-4560-a9d1-04ab27a69196" />
<img width="700" height="420" alt="image" src="https://github.com/user-attachments/assets/d52d8bb3-2a63-404c-bcdc-e3984047cd9b" />
<img width="700" height="420" alt="image" src="https://github.com/user-attachments/assets/b64390e8-dfe0-40ca-8261-c8de51173623" />

