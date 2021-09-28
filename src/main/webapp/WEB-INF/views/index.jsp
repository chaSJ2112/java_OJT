<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>content</title>
</head>
<body>
<!-- container -->
<div class="container">
	<form action="/simple/save" method="post" >
		<div class="form-group">
			<lable for="contents">내용</lable>
			<input type="text" id="contents" name="contents" placeholder="내용을 입력하세요."> 
			<button type="submit">등록</button>
		</div>
	</form>
	<form action="/simple/update" method="post" >
		<div class="form-group">
			<lable for="seq">수정 번호</lable>
			<input type="text" id="seq" name="seq" placeholder="수정번호를 입력하세요."> 
			<lable for="contents">수정 내용</lable>
			<input type="text" id="contents" name="contents" placeholder="내용을 입력하세요."> 
			<button type="submit">수정</button>
		</div>
	</form>
	
	<form action="/simple/delete" method="post" >
		<div class="form-group">
			<lable for="contents">내용</lable>
			<input type="text" id="contents" name="contents" placeholder="내용을 입력하세요."> 
			<button type="submit">삭제</button>
		</div>
	</form>
</div>
<!-- container -->
<a href="/simple/list">내용 조회</a>
</body>
</html>