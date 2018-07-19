$(window).on("scroll touchmove", function () {
    $('#header_bg').toggleClass('tiny', $(document).scrollTop() > 0);
});

$.get(serverRoot + "/interia/html/header.html", (data) => {
    $("#header").html(data);
    loadLoginUser();
});


function loadLoginUser() {
	$.getJSON(serverRoot + "/json/auth/loginUser", (data) => {
		
		$("#nav-link-1").text("글쓰기");
		$("#nav-link-2").text("장바구니");
		$("#nav-link-3").text("알림");
		$("#nav-link-4").text("로그아웃");
		$("#nav-link-5").text(data.nickname);
		// 글쓰기 관련 이벤트 구현
		$("#nav-link-1").click(e => {
			e.preventDefault();
			location.href="#";
		});
		
		// 장바구니 관련 이벤트 구현
		$("#nav-link-2").click(e => {
			e.preventDefault();
			location.href = serverRoot + "/interia/html/works/sp_bascket.html";
		});
		
		// 알림 관련 기능 구현
		$("#nav-link-3").click(e => {
			e.preventDefault();
		});
		
		// 로그아웃 관련 기능 구현
		$("#nav-link-4").click((e) => { // 로그아웃 버튼
			e.preventDefault(); // 클릭했을 때 원래 하던 일이 있는데 그것을 하지 말라!
			$.get(serverRoot + "/json/auth/logout", () => {
				location.href = serverRoot + "/interia/html/auth/login.html";
			});
		});
		
		// 마이페이지 관련 기능 구현
		$("#nav-link-5").click(e => {
			e.preventDefault();
			location.href = serverRoot + "/interia/html/mypage/mp_mypage.html";
		});
	})
	// 이부분의 대해서는 조금 더 연구를 해 볼것이다. 여기서는 로그인 필요한 부분일 경우 수행하는 것인데 아직은 생각할 필요 있음
	/*.fail(() => {
		location.href = serverRoot + "/interia/html/auth/login.html";
	});*/ 
}


