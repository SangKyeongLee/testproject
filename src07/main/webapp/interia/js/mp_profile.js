// 팝업
$(document).ready(function() {
	$(".mp-profile-div").click(function() {
	    $(".mp-cover-popup2").toggle();
	});
	$(".mp-popup-hidden2").click(function() {
	    $(".mp-cover-popup2").css("display","none");
	});
	$(window).mouseup(function (e) {
		var popup = $(".mp-cover-popup2");
		var div = $(".mp-profile-div");
		if (!popup.is(e.target) && popup.has(e.target).length === 0
				&&
			!div.is(e.target) && div.has(e.target).length === 0){
			popup.css("display","none");
		}
	});
});


//Input을 버튼으로 클릭
$(document).ready(function() {
	var fileSelect = document.getElementById("fileSelect2"),
		fileElem = document.getElementById("fileupload-profile");
	
	fileSelect.addEventListener("click", function (e) {
	  if (fileElem) {
	    fileElem.click();
	  }
	}, false);
});

// 파일 업로드
/*$('.fileupload-profile').fileupload({
    url: '../../../json/myfile/profile',        // 서버에 요청할 URL
    dataType: 'json',  "서버가 보낸 데이터가 JSON 문자열이다. 자바스크립트 객체로 바꿔라." 라는 의미
    sequentialUploads: true,  // 여러 개의 파일을 업로드 할 때 순서대로 요청하기.
    singleFileUploads: false, // 한 요청에 여러 개의 파일을 전송시키기.
    add: function (e, data) {
	    console.log('add()...');
	    
	    
	    
	    
	    $('').click(function() {
	        data.submit(); // submit()을 호출하면, 서버에 데이터를 보내기 전에 submit 이벤트가 발생한다.
	    });
  	},
    done: function (e, data) { // 서버에서 응답이 오면 호출된다. 각 파일 별로 호출된다.
	    console.log('done()...');
	    console.log(data.result);
	    console.log(data.result.originname);
	    // $('<img>').attr('src', '../../../files/mypage/review' + data.result.filename + "_200x200.jpg").css("width","100%").appendTo(imgBox);
	    // $('<img>').attr('src', '../../../files/' + data.result.filename + "_200x200.jpg").appendTo(imgBox);
	    location.href = "mp-purchase2.html";
    },
    submit: function (e, data) {
	    console.log('submit()...');
	    // data 객체의 formData 프로퍼티에 일반 파라미터 값을 설정한다.
	    data.formData = {
	        purchEpilo: $(revText).val(),
        	no: $(revNo).val()
	    };
  	}
});*/