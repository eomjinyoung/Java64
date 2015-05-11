[그래들]
1. java 플러그인
1) compileJava 
	- src/main/java 폴더의 파일을 컴파일하여 build/classes/main 폴더로 복사한다.
2) processResources
	- src/main/resources 폴더의 모든 파일을 build/resources/main 폴더로 복사한다.
3) classes
	- 1)번과 2)번을 실행한다.

4) compileTestJava 
	- 3)번 작업을 포함한다.
	- src/test/java 폴더의 파일을 컴파일하여 build/classes/test 폴더로 복사한다.
5) processTestResources
	- src/test/resources 폴더의 모든 파일을 build/resources/test 폴더로 복사한다.

6) jar
	- 3)번 작업을 포함한다.
	- build/libs 폴더에 *.jar 파일을 생성한다.
7) build
	- check --> test --> ...


2. eclipse 플러그인
이클립스 관련 설정 파일(.project, .classpath, .settings/*)을 다루는 플러그인 이다.
1) cleanEclipseClasspath
	- .classpath 파일 삭제
2) eclipseClasspath
	- .classpath 파일 생성 

3) cleanEclipseProject
	- .project 파일 삭제
4) eclipseProject
	- .project 파일 생성
참고!
	- 이클립스 프로젝트를 그래들 프로젝트로 만들려면 다음을 .project 파일의
	<natures> 태그에 추가하라!
<nature>org.springsource.ide.eclipse.gradle.core.nature</nature>

3. eclipse-wtp 및 war 플러인
웹 애플리케이션 관련 설정파일을 다루는 플러그인 이다.
두 플러그인 모두 추가해야 한다.
eclipse-wtp는 eclipse 플러그인을 포함하기 때문에 
따로 eclipse 플러그인을 추가할 필요가 없다.


	