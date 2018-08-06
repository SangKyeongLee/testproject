$("#btnSearchPassword").click(() => {
	var data = {
		id : $("#fId").val()
	}
	$.get(serverRoot + "/json/auth/searchPassword", data, (result) => {
		if (result == "success") {
			location.href = "./pwdsearchChange.html?id=" + data.id;
		} else {
			window.alert("아이디를 다시 입력하세요!");
		}
	})
})