var grid_item = $(".grid-item");

var comments = [
	{userid: "소박한식탁", content: "너무 아름다운거 같아요. 딱 제 스타일이에요!"},
	{userid: "푸짐한식탁", content: "깔끔하니 좋은데요!"},
	{userid: "오늘의집", content: "정말 오늘하루 보내고 싶은 곳이네요!"},
	{userid: "위르겐클롭", content: "너무 비어보인다는 것과 심플하다고 하는건 보는 사람의 시각차이일뿐이에요."},
	{userid: "스티븐제라드", content: "정말 만들기 힘드셨을것 같아요! 정말 멋지네요!"},
	{userid: "스펀지밥", content: "아쉽긴 뭐가 아쉬워요! 이런걸 보고 심플하다 하는거에요!"},
	{userid: "깐깐징어", content: "뭔가 아쉬운거같아요.."},
	{userid: "뚱이", content: "아쉬운거 없이 완벽해요!"},
	{userid: "브루노마스", content: "wow!! so beautiful place!!"},
	{userid: "저녁이있는삶", content: "하루를 마무리하고 쉬기 좋은 집 같아요~!"}
]

$(grid_item).on("click",function() {
	alert("클릭!!");
	$('<div class="modal fade multi-step" id="myModal" role="dialog">'+
		'<div class="photo-detail modal-dialog">'+
			'<div class="modal-body photo-modal-body step-1" data-step="1">'+
				'<div class="photo-img-box">'+
					'<img src="../../images/sns/sns07.PNG" alt="">'+
				'</div>'+
				'<div class="photo-container-box">'+
					'<div class="photo-detail-header">'+
						'<div class="photo-header-profile">'+
							'<img src="../../images/sns/hy.jpg" alt="">'+
						'</div>'+
						'<div class="photo-header-userId">'+
							'<a href="#"><span>nickwooster</span></a>'+
						'</div>'+
					'</div>'+
					'<div class="photo-box-content">'+
						'<div class="photo-content">'+
							'<div class="pt-content">'+
								'<pre class="pt-content-pre">'+
								'안녕하세요. 반가워요. Hello. Bonjour.'+
								'오늘하루도 즐거운 하루가 되었으면 좋겠어요.'+
								'화이팅!'+
								'*^ㅁ^*'+
								'</pre>'+
							'</div>'+
							'<div class="pt-hashtag">'+
								'<a href="#">#해시태그</a>'+
							'</div>'+
						'</div>'+
						'<div class="photo-comment"></div>'+
					'</div>'+
					'<div class="photo-box-like">'+
						'<a class="material-icons" href="#">favorite_border</a>'+
						'<a class="material-icons" href="#">bookmark_border</a>'+
					'</div>'+
					'<div class="photo-box-likecount">'+
						'<span>좋아요 486개</span>'+
					'</div>'+
					'<div class="photo-box-date">'+
						'<span>07월 03일</span>'+
					'</div>'+
					'<div class="photo-box-write">'+
						'<form class="photo-write-form" action="" method="">'+
							'<textarea class="photo-write-textarea" aria-label="댓글 달기..."'+
								'placeholder="댓글 달기..." autocorrect="off" autocomplete="off"></textarea>'+
						'</form>'+
					'</div>'+
				'</div>'+
			'</div>'+

			'<div class="modal-body photo-modal-body step-2" data-step="2">'+
				'<div class="photo-img-box">'+
				    '<div id="linkadd">'+
					   '<img src="../../images/sns/sns07.PNG" alt="">'+
					'</div>'+
				'</div>'+
				'<div class="photo-container-box">'+
					'<div class="photo-detail-header">'+
						'<div class="photo-header-profile">'+
							'<img src="../../images/sns/hy.jpg" alt="">'+
						'</div>'+
						'<div class="photo-header-userId">'+
							'<a href="#"> <span>nickwooster</span>'+
							'</a>'+
						'</div>'+
					'</div>'+
					'<div class="photo-box-content photo-link-box">'+
						'<div class="photo-content">'+
							'<span class="prod-link-titl">제품 링크 등록</span> '+
							'<span>사진 속의 제품을 클릭하여 제품 판매 링크를 달아보세요.</span>'+
						'</div>'+
					'</div>'+
					'<div class="prod-link-btn">'+
						'<a href="#" class="prod-link-cancel" onclick="sendEvent("#myModal", 1)">취소하기</a>'+ 
						'<a href="#" class="prod-link-ok" onclick="sendEvent("#myModal", 1)">등록하기</a>'+
					'</div>'+
				'</div>'+
			'</div>'+
			'<div class="modal-footer photo-prod-link-box">'+
				'<button type="button" class="photo-prod-link btn step step-1" data-step="1" onclick="sendEvent("#myModal", 2)">제품 링크 등록</button>'+
			'</div>'+
		'</div>'+
	   '</div>').appendTo(".modal_box");
	var photo_comment = $(".photo-comment");
	for (var item of comments) {
	$('<div class="photo-comments-piece">'+
		'<span class="comment-userId">'+ item.userid +'</span>'+ 
		'<span class="comment-content">'+ item.content +'</span>'+
	'</div>').appendTo(photo_comment);
	}
	$("textarea.photo-write-textarea").on('keydown keyup', function() {
	    $(this).height(1).height($(this).prop('scrollHeight'));
	});	
	$.getScript('../../js/multi-step-modal.js');
	
	sendEvent = function(sel, step) {
		alert("sendEvent");
	    $(sel).trigger("next.m." + step);
	}
});



















//

