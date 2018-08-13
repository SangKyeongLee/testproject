//Input을 버튼으로 클릭
$(document).ready(function() {
	var fileSelect = document.getElementById("fileSelect-post"),
		fileElem = document.getElementById("fileupload-post");
	
	fileSelect.addEventListener("click", function (e) {
	  if (fileElem) {
	    fileElem.click();
	  }
	}, false);
});


//textarea 자동 늘리기
function resize(obj) {
 obj.style.height = "1px";
 obj.style.height = (12+obj.scrollHeight)+"px";
}


// tag
$('#demo1').tagEditor({
    placeholder: '태그 입력',
    forceLowercase: false,
});



$('#fileupload-post').fileupload({
	  url: '../../../json/board/upload1',
	  dataType: 'json',
	  sequentialUploads: true,
	  singleFileUploads: false,
	  autoUpload: false,
	  disableImageResize: /Android(?!.*Chrome)|Opera/
	        .test(window.navigator && navigator.userAgent),
//	  previewMaxWidth: 440,
//	  previewMaxHeight: 350,
	  //previewCrop: true,      // 미리보기 이미지를 출력할 때 원본에서 지정된 크기로 자르기
	  processalways: function(e, data) {
	      console.log('fileuploadprocessalways()...');
	      console.log(data.files);
	      var imagesDiv = $('#fileSelect-post');
	      for (var i = 0; i < data.files.length; i++) {
			  try {
			    if (data.files[i].preview.toDataURL) {
			      $("<img>")
			      .attr('src', data.files[i].preview.toDataURL())
			      .css({'width': '440px','height': '350px'}).appendTo(imagesDiv);
			      $(".mp-inner-icon").css("display","none");
			      $(".mp-inner-icon>p").text("사진 바꾸기");
			    }
			  } catch (err) {}
	      };
	    
	      $('.mp-post-btn').click(function() {
	    	  var tags = $('#demo1').tagEditor('getTags')[0].tags;
	    	  console.log(tags);
	    	  data.formData = {
	    			  boardhashtag: tags,
	    			  content: $(".form-control").var(),
	    	  };
	          data.submit();
	      });
	  },
	  done: function (e, data) { // 서버에서 응답이 오면 호출된다. 각 파일 별로 호출된다.
	    console.log('done()...');
	    console.log(data.result);
	  }
});




