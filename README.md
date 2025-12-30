  ## 🚀 API 명세서

### 📌 Member API

| 기능 | 메서드 | URL | 요청 본문(JSON) | 설명 |
| :-- | :-- | :-- | :-- | :-- |
| 회원 생성 | POST | `/members` | `{"name":"홍길동","email":"test@test.com"}` | 회원을 생성합니다 |
| 회원 전체 조회 | GET | `/members` | 없음 | 모든 회원 조회 |
| 회원 상세 조회 | GET | `/members/{id}` | 없음 | 특정 ID의 회원 조회 |
| 회원 수정 | PUT | `/members/{id}` | `{"name":"김규범","email":"kyu@test.com"}` | 회원 정보 수정 |
| 회원 삭제 | DELETE | `/members/{id}` | 없음 | 회원 삭제 |

## 📷 Postman 테스트 (Member API)

### ➕ 회원 생성
<img src="https://github.com/user-attachments/assets/32bcef5e-c93e-4560-a9d1-04ab27a69196" width="700" />

---

### ✏️ 회원 수정
<img src="https://github.com/user-attachments/assets/d52d8bb3-2a63-404c-bcdc-e3984047cd9b" width="700" />

---

### 📄 회원 전체 조회
<img src="https://github.com/user-attachments/assets/4e3863d0-719d-4fa4-a621-753bdfd26dff" width="700" />

---

### 🗑️ 회원 삭제
<img src="https://github.com/user-attachments/assets/a740003d-6175-4907-a24f-facb4df07e69" width="700" />

---

### 🔍 회원 상세 조회
<img src="https://github.com/user-attachments/assets/4dafb15c-e9b7-4a1b-9391-b98bc052d967" width="700" />
