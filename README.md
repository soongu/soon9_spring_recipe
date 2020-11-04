# Spring 5 Recipe

## Chapter2. Spring Core
```groovy
dependencies {
    implementation 'org.springframework:spring-context:5.3.0'
    implementation 'org.springframework:spring-core:5.3.0'
    implementation 'org.springframework:spring-beans:5.3.0'
}
```
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
```groovy
dependencies {
    ...
    implementation 'org.aspectj:aspectjrt:1.8.13'
    implementation 'org.aspectj:aspectjweaver:1.8.13'
}
```
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

---

## Chapter3. Spring MVC
```groovy
dependencies {
    ...
    implementation 'org.springframework:spring-webmvc:5.3.0'
    implementation "javax.servlet:javax.servlet-api:4.0.0"
    implementation "javax.servlet:jstl:1.2"
}
```
### 3-1. 간단한 스프링 MVC 웹 앱 개발하기
#### 내장 톰캣 설정 
- gradle
```groovy
implementation 'org.apache.tomcat.embed:tomcat-embed-jasper:9.0.39'
```
- maven
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.jsp</groupId>
    <artifactId>jsp-starter</artifactId>
    <version>1.0-SNAPSHOT</version>


    <!-- embedded tomcat 설정 -->
    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
        <tomcat.version>9.0.39</tomcat.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.apache.tomcat.embed</groupId>
            <artifactId>tomcat-embed-core</artifactId>
            <version>${tomcat.version}</version>
        </dependency>
        <dependency>
            <groupId>org.apache.tomcat.embed</groupId>
            <artifactId>tomcat-embed-jasper</artifactId>
            <version>${tomcat.version}</version>
        </dependency>
        <dependency>
            <groupId>org.apache.tomcat</groupId>
            <artifactId>tomcat-jasper</artifactId>
            <version>${tomcat.version}</version>
        </dependency>
        <dependency>
            <groupId>org.apache.tomcat</groupId>
            <artifactId>tomcat-jasper-el</artifactId>
            <version>${tomcat.version}</version>
        </dependency>
        <dependency>
            <groupId>org.apache.tomcat</groupId>
            <artifactId>tomcat-jsp-api</artifactId>
            <version>${tomcat.version}</version>
        </dependency>

        <!-- servlet api -->
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>javax.servlet-api</artifactId>
            <version>3.1.0</version>
        </dependency>
    </dependencies>

    <build>
        <finalName>embeddedTomcatSample</finalName>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-shade-plugin</artifactId>
                <version>3.2.1</version>
                <configuration>
                </configuration>
                <executions>
                    <execution>
                        <phase>package</phase>
                        <goals>
                            <goal>shade</goal>
                        </goals>
                        <configuration>
                            <transformers>
                                <transformer implementation="org.apache.maven.plugins.shade.resource.ManifestResourceTransformer">
                                    <mainClass>com.jsp.JspStarterMain</mainClass>
                                </transformer>
                            </transformers>
                        </configuration>
                    </execution>
                </executions>
            </plugin>

        </plugins>
    </build>
</project>
```
- java
```java
package kr.co.kokono.recipe;
import org.apache.catalina.startup.Tomcat;
import java.io.File;

public class AppMain {

    private static final int PORT = 8090;

    public static void main(String[] args) throws Exception {
        String webappDirLocation = "src/main/webapp/";
        Tomcat tomcat = new Tomcat();

        tomcat.setPort(PORT);
        tomcat.getConnector();

        tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());

        tomcat.start();
        tomcat.getServer().await();
    }   

}
```