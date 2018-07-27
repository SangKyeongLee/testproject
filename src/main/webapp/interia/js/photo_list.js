// 자랑하기 리스트

$.getJSON("../../../json/board/list", (data) => {
	var i = 1;
	var grid = $(".grid");
	
	console.log(data);
	console.log(data[i].no);

	for (var item of data) {
		let divs = $('<div class="grid-item">' +
				/*'<input type="hidden" value="' + item.no + '">' +*/
				'<a  class="grid-photo-a" onclick="mkmodal('+ item.no +')" href="#myModal" data-toggle="modal">'+
				'<div class="grid-photo">'+
				'<img  src="../../images/sns/'+ item.path +'" alt="">'+
				'</div>'+
				'</a>'+
				'<div class="grid-photo-cont">'+
				'<a class="grid-photo-like likeoff'+ i +'" id="like_off" onclick=\"likeon('+ i +')\">'+ 
				'<i class="material-icons">favorite_border</i>'+
				'<span>'+ item.count +'</span>'+
				'</a>' +
				'<a class="grid-photo-like likeon'+ i +'" id="like_on" onclick=\"likeoff('+ i +')\" style="display:none">'+ 
				'<i class="material-icons" >favorite</i>'+
				'<span>'+ item.count +'</span>'+
				'</a>' +
				'<div class="grid-photo-view">'+
				'<span class="grid-photo-view-count">조회수</span><span>0</span>'+
				'</div>'+
				'</div>'+
		'</div>').appendTo(grid);
		i++;
		
		/*$(".no"+item.no).click(function(event) {
			let no = event.currentTarget.parentNode.childNodes[0].value;
			
			console.log(no);
			
			$.getJSON("../../../json/board/" + no, (data) => {
				console.log("req:",no);
				$('<div class="modal fade multi-step" id="myModal" role="dialog">'+
					'<div class="photo-detail modal-dialog">'+
						'<div class="modal-body photo-modal-body step-1" data-step="1">'+
							'<div class="photo-img-box">'+
								'<img src="../../images/sns/'+ data.path +'" alt="">'+
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
									'<a class="material-icons border-like" id="like_off" href="#">favorite_border</a>'+
									'<a class="material-icons border-like" id="like_on" href="#" style="display:none">favorite</a>'+
									'<a class="material-icons border-bookmark" id="bookmark_off" href="#">bookmark_border</a>'+
									'<a class="material-icons border-bookmark" id="bookmark_on" href="#" style="display:none">bookmark</a>'+
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
									'<a href="#" class="prod-link-cancel" onclick="sendEvent(\'#myModal\', 1)">취소하기</a>'+ 
									'<a href="#" class="prod-link-ok" onclick="sendEvent(\'#myModal\', 1)">등록하기</a>'+
								'</div>'+
							'</div>'+
						'</div>'+
						'<div class="modal-footer photo-prod-link-box">'+
							'<button type="button" class="photo-prod-link btn step step-1" data-step="1" onclick="sendEvent(\'#myModal\', 2)">제품 링크 등록</button>'+
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
				
				sendEvent = function(sel, step) { 
					$(sel).trigger("next.m." + step);
				}
				
				$(".modal").on("click",function(e){
				    if(e.target == this) {
				    	$("#myModal").remove();
				    } else {
				    	
				    }
				});

				$.getScript('../../js/multi-step-modal.js');
				$.getScript('../../js/link_add_modal.js');
				});
			
		})*/
	}
	
	
	
	$(grid).masonry({
	    itemSelector: '.grid-item',
	    columnWidth: 224,
	    horizontalOrder: true,
	    gutter: 20
	});
});

function click_item(no) {	
}

function likeon(i) {
	$(".likeoff"+ i).css("display","none");
	$(".likeon"+i).css("display","flex");
}
function likeoff(i) {
	$(".likeon"+ i).css("display","none");
	$(".likeoff"+ i).css("display","flex");
}



/*
var phtlist = [
	{img:"sns01.PNG", like:18, bookmark: 4, view: 28},
	{img:"sns02.PNG", like:18, bookmark: 4, view: 28},
	{img:"sns03.PNG", like:18, bookmark: 4, view: 28},
	{img:"sns04.PNG", like:18, bookmark: 4, view: 28},
	{img:"sns05.PNG", like:18, bookmark: 4, view: 28},
	{img:"sns06.PNG", like:18, bookmark: 4, view: 28},
	{img:"sns07.PNG", like:18, bookmark: 4, view: 28},
	{img:"sns08.PNG", like:18, bookmark: 4, view: 28},
	{img:"sns09.PNG", like:18, bookmark: 4, view: 28},
	{img:"sns10.PNG", like:18, bookmark: 4, view: 28},
	{img:"sns11.jpg", like:18, bookmark: 4, view: 28},
	{img:"sns12.jpg", like:18, bookmark: 4, view: 28},
	{img:"sns13.jpg", like:18, bookmark: 4, view: 28},
	{img:"sns14.jpg", like:18, bookmark: 4, view: 28},
	{img:"sns15.jpg", like:18, bookmark: 4, view: 28},
	{img:"sns16.jpg", like:18, bookmark: 4, view: 28},
	{img:"sns17.jpg", like:18, bookmark: 4, view: 28},
	{img:"sns18.jpg", like:18, bookmark: 4, view: 28},
	{img:"sns19.jpg", like:18, bookmark: 4, view: 28},
	{img:"sns20.jpg", like:18, bookmark: 4, view: 28},
	]*/
//
