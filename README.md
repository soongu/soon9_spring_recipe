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
### 2-13. 아노테이션을 이용해 AOP하기
- 어디에서(Pointcut) 무엇을 할 것인지(Advice)
- AspectJ 지원 어드바이스
  - @Before
  - @After
  - @AfterReturning
  - @AfterThrowing
  - @Around
- 포인트컷은 어드바이스에 적용할 타입 및 객체를 찾는 표현식

### 2-14. 조인포인트 정보 가져오기
- Join Point: 어드바이스가 적용될 수 있는 위치를 말한다. 타겟 객체가 구현한 인터페이스의 모든 메서드는 조인 포인트가 된다.

### 2-15. @Order로 애스펙트 우선순위 부여하기
### 2-16. 애스펙트 포인트컷 재사용하기