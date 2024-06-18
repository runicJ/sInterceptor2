<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
  <jsp:include page="/WEB-INF/views/include/bs4.jsp" />
</head>
<body>
<p><br><p>
<div class="container">
<h1>
	환영합니다!  
</h1>

<pre>
<b>* 회원관리 인터셉터설계 *</b>
- 회원가입/아이디중복체크, 닉네임중복체크, 로그인창, 방명록은 모든 이들이 접속 가능 처리
- 방명록의 글은 모두 볼 수 있으며, 방명록 글쓰기는 로그인 회원만 글을 올릴 수 있다.(수정/삭제 포함)
- 게시판은 로그인한 회원만 접속가능, 모든 회원들이 사용할 수 있다. 단, 준회원은 읽기만 가능
- 자료실은 정회원 이상만 사용가능, 단, 정회원은 자료실 리스트 보기와 다운로드만 할수 있다. 업로드/수정/삭제 할 수 없다.
- 관리자 메뉴는 관리자 등급(0)만 사용할 수 있다.
회원등급 : 
  0 : 관리자, 1:우수회원, 2:정회원, 3:준회원, 99:비회원
</pre>

<P>  The time on the server is ${serverTime}. </P>
<hr>
	<p>
		<!-- 중계(중간) 경로가 같다면 ctp 안써도 됨 -->
		| <a href="${ctp}/guest/guestList">방명록</a> |
		<a href="${ctp}/member/login">로그인</a> | 
		<a href="${ctp}/member/join">회원가입</a> |
	</p>
<hr>
</div>
</body>
</html>
