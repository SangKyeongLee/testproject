// div#header 태그에 /html/header.html 내용을 삽입한다.

//$.get("/bitcamp-java-project/html7/header.html", (data) => {
//	$("#header").html(data);
//	loadLoginUser();
//});
//
//function loadLoginUser() {
//	var jqxhr = $.getJSON("/bitcamp-java-project/json/auth/loginUser", (data) => {
//		$("#username").text(data.id);
//		$("#logoutBtn").click((e) => {
//			e.preventDefault(); //클릭했을 때 원래 하던 작업을 하지 않도록 설정
//			$.get("/bitcamp-java-project/json/auth/logout", () => {
//				location.href = "/bitcamp-java-project/html7/auth/login.html";
//			});
//		});
//	});
//	jqxhr.fail(() => {
//		location.href = "/bitcamp-java-project/html7/auth/login.html";
//	});
//}

//getJSON(url, 정상일 때 실행하는 함수) ; 기다리는 것이 아니다.
//getJSON().fail() ; 실패했을 때 실행할 메서드도 바로 실행