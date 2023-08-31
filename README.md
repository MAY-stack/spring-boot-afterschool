# spring-boot-afterschool
스프링부트를 이용한 온라인 방과 후 교육 플랫폼

## 목차

1. [프로젝트 개요](#1-프로젝트-개요)
2. [프로젝트 문서](#2-프로젝트-문서)
    - [요구사항 정의 및 페이지·기능 명세서](#📝-요구사항-정의-및-페이지기능-명세서)
    - [테이블 명세서 및 ERD](#📝-테이블-명세서-및-erd)
    - [API 명세서](#📝-api-명세서)
3. [화면 설계](#3-화면-설계)
    - [UML](#uml)
    - [와이어 프레임](#와이어-프레임)
4. [구현 기능 및 화면](#4-주요-기능-및-구현-화면)
    - [공통 기능](#👨‍👩‍👧‍👦-공통기능)
    - [회원 기능](#🪪-회원기능)
    - [학생용 기능](#🧑‍💻-학생용-기능)
    - [강사용 기능](#🧑‍🏫-강사용-기능)
    - [관리자 기능](#🧑‍🔧-관리자-기능)

## 1. 프로젝트 개요

### 🎯 목표

주변 환경으로 인해 학업의 도움을 받지 못하는 학생들을 위해,
환경에 구애 받지 않고 다양한 교육을 받을 수 있는 공공 교육 플랫폼 개발

- **프로젝트 수행 기간**: 2023.05.24 ~ 2023.06.20 (약 1개월)
- **참여 인원**: 5명 (front-end 3명, back-end 2명)

### ⚒️ 기술 스택

![Spring Boot](https://img.shields.io/badge/-Spring_Boot-6DB33F?style=flat-square&logo=Spring&logoColor=white)
![JPA](https://img.shields.io/badge/-JPA-007396?style=flat-square&logo=Java&logoColor=white)
![Oracle](https://img.shields.io/badge/-Oracle-F80000?style=flat-square&logo=Oracle&logoColor=white)
![HTML](https://img.shields.io/badge/-HTML-E34F26?style=flat-square&logo=HTML5&logoColor=white)
![CSS](https://img.shields.io/badge/-CSS-1572B6?style=flat-square&logo=CSS3&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/-Thymeleaf-005F0F?style=flat-square&logo=Thymeleaf&logoColor=white)
![JavaScript](https://img.shields.io/badge/-JavaScript-F7DF1E?style=flat-square&logo=JavaScript&logoColor=white)
![AWS](https://img.shields.io/badge/-AWS-D46A00?style=flat-square&logo=Amazon-AWS&logoColor=white)
![Google Cloud](https://img.shields.io/badge/-Google_Cloud-4285F4?style=flat-square&logo=Google-Cloud&logoColor=white)

### 📐 프로젝트 규모

- 화면 수: 32 페이지
- 데이터베이스 테이블 수: 18개
- 총 코드 라인 수: 16,052 줄

### 🚀 개발 및 배포 환경
![아키텍쳐](images\architecture.png)

## 2. 프로젝트 문서

### 📝 요구사항 정의 및 페이지·기능 명세서

![요구사항 정의 및 페이지·기능 명세서](images\documents\functional_specification.png)

### 📝 테이블 명세서 및 ERD

![테이블 명세서](images\documents\table_specifications.png)
![ERD](images\documents\erd.png)


### 📝 API 명세서

![API 명세서](images\documents\api_specification.png)

## 3. 화면 설계
### ⛓️ UML
#### •　애플리케이션 전체 프로세스 및 공통기능
![애플리케이션 전체 프로세스](images\uml\application_process_overview.png)
#### •　회원가입 및 로그인
![회원가입 및 로그인](images\uml\user_registration_and_login.png)
#### •　아이디 찾기 및 비밀번호 찾기
![아이디 찾기 및 비밀번호 찾기](images\uml\find_username_and_password.png)
#### •　강의 완강율 및 평점 반영
![강의 완강율 및 평점 반영](images\uml\course_completion_rate_and_rating.png)
---
#### 🧑‍🏫 강사 회원의 기능
##### •　회원정보수정 및 신규 강좌 등록 신청
![회원정보수정 및 신규 강좌 등록 신청](images\uml\instructor_functionality.png)
##### •　신규 강좌 등록 신청 처리 프로세스
![신규 강좌 등록 신청 처리 프로세스](images\uml\new_course_registration_process.png)
##### •　강좌 공지사항 관리
![강좌 공지사항 관리](images\uml\course_notice_management.png)
---
#### 🧑‍💻 학생 회원의 기능
##### •　회원정보수정 및 자유게시판 이동
![회원정보수정 및 자유게시판 이동](images\uml\modify_member_information_and_free_board_access.png)
##### •　수강신청 및 찜하기
![수강신청 및 찜하기](images\uml\course_enrollment_and_add_to_wishlist.png)
##### •　강의 이어듣기 및 완경 여부에 따른 후기작성
![강의 이어듣기 및 완경 여부에 따른 후기작성](images\uml\continue_listening_to_lectures_and_review_writing.png)
---
#### 🧑‍🔧 관리자의 기능
##### •　강좌 등록 신청 승인 및 거절 회원관리
![강좌 등록 신청 승인 및 거절 회원관리](images\uml\administrator_functionality.png)

### 🖌️ 와이어 프레임
![와이어 프레임 1](images\uml\wireframes-1.png)
![와이어 프레임 2](images\uml\wireframes-2.png)


## 4. 주요 기능 및 구현 화면
### 👨‍👩‍👧‍👦 공통 기능
- 메인
  ![메인](images/ImplementationScreens/main.png)
- 강좌 조회
  ![강좌 조회](images/ImplementationScreens/course_list.png)
- 강좌 상세 보기
  ![강좌 상세 보기](images/ImplementationScreens/course_details.png)
- 강사 조회
  ![강사 조회](images/ImplementationScreens/instructor_list.png)
- 강사 상세정보 보기
  ![강사 상세정보 보기](images/ImplementationScreens/instructor_details.png)

### 🪪 회원 기능
- 로그인
  ![로그인](images/ImplementationScreens/login.png)
- 아이디 찾기
  ![아이디 찾기](images/ImplementationScreens/find_id.png)
- 비밀번호 찾기
  ![비밀번호 찾기](images/ImplementationScreens/find_password.png)
- 회원가입 - 회원 유형 선택
  ![회원가입 - 회원 유형 선택](images/ImplementationScreens/signup.png)
- 회원가입 - 학생
  ![회원가입 - 학생](images/ImplementationScreens/signup_student.png)
- 회원가입 - 강사
  ![회원가입 - 강사](images/ImplementationScreens/signup_instructor.png)
- 회원 정보수정 - 학생
  ![회원 정보수정 - 학생](images/ImplementationScreens/student_profile_edit.png)
- 회원 정보수정 - 강사
  ![회원 정보수정 - 강사](images/ImplementationScreens/instructor_profile_edit.png)
- 비밀번호 변경
  ![비밀번호 변경](images/ImplementationScreens/change_password.png)

### 🧑‍💻 학생용 기능
- 내 강의실
  ![학생 - 내 강의실](images/ImplementationScreens/student_my_courses.png)
- 내 강의실 - 강의 평가
  ![학생 - 내 강의실 (강의 평가)](images/ImplementationScreens/student_my_courses_rating.png)
- 강의 플레이어
  ![강의 플레이어](images/ImplementationScreens/course_player.png)
- 자유 게시판 - 글목록
  ![자유 게시판 - 글목록](images/ImplementationScreens/free_board_list.png)
- 자유 게시판 - 글쓰기
  ![자유 게시판 - 글쓰기](images/ImplementationScreens/free_board_write.png)

### 🧑‍🏫 강사용 기능
- 내 강의실
  ![강사 - 내 강의실](images/ImplementationScreens/instructor_my_courses.png)
- 신규 강좌 등록 신청
  ![신규 강좌 등록 신청](images/ImplementationScreens/new_course_registration.png)
- 강좌 공지 게시판 - 글목록
  ![강좌 공지 게시판 - 글목록](images/ImplementationScreens/course_notice_list.png)
- 강좌 공지 게시판 - 글쓰기
  ![강좌 공지 게시판 - 글쓰기](images/ImplementationScreens/course_notice_write.png)

### 🧑‍🔧 관리자 기능
  ![관리자 메뉴](images/ImplementationScreens/admin_menu.png)