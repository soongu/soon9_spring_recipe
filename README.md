# Spring 5 Recipe

## Chapter2. Spring Core
### 2-1. 자바로 POJO 구성하기
### 2-2. 생성자 호출해서 POJO 구성하기
### 2-3. POJO 레퍼런스와 자동연결을 이용해 다른 POJO와 상호작용하기
### 2-4. @Resource와 @Inject를 붙여 POJO자동 연결
`implementation 'javax.inject:javax.inject:1'` 라이브러리 필요.
### 2-5. @Scope를 붙여 POJO 스코프 지정
#### 빈 스코프
- singleton
- prototype
- request
- session
- globalSession: 전역 http세션당 빈 인스턴스 하나 생성. 포털 앱 컨텍스트에만 해당.
### 2-6. 외부 리소스(텍스트, xml, 프로퍼티, 이미지 파일)의 데이터 사용하기
### 2-7. 프로퍼티 파일에서 로케일마다 다른 다국어 메시지를 해석하기
### 2-11. 스프링 환경 및 프로파일마다 다른 POJO 로드하기