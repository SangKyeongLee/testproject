// 자랑하기 리스트
$(window).scroll(function(){
	let $window = $(this);
    let scrollTop = $window.scrollTop();
    let windowHeight = $window.height();
    let documentHeight = $(document).height();
    
    console.log("documentHeight:" + documentHeight + " | scrollTop:" +
            scrollTop + " | windowHeight: " + windowHeight );

    if( scrollTop >= documentHeight - windowHeight){
            console.log("끝!");
            snslist();
    }
});

$.getJSON("../../../json/board/list",{"pageNo":1, "pageSize":40},(data) => {
	for (var item of data) {
		var divs = $('<div class="grid-item">' +
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
				'</div>'+
		'</div>').appendTo(grid);
		i++;
		var $divs = $(divs);
		$grid.append($divs).masonry("appended", $divs);
		$(grid).imagesLoaded().progress( function() {
			$grid.masonry('layout');
		});
	}
});


var i = 1;
var grid = $(".grid");
var $grid = $(grid).masonry({
	itemSelector: '.grid-item',
	columnWidth: 224,
	gutter: 20
});


var addNo = 3;
var addPage = 20;
var isEnd = false;

function snslist() {
if(isEnd == true){
    return;
}
console.log("addNo: " + addNo);
$.getJSON("../../../json/board/list",{"pageNo":addNo, "pageSize":addPage},(data) => {
	for (var item of data) {
		var divs = $('<div class="grid-item">' +
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
				'</div>'+
		'</div>').appendTo(grid);
		i++;
		var $divs = $(divs);
		$grid.append($divs).masonry("appended", $divs);
		$(grid).imagesLoaded().progress( function() {
			$grid.masonry('layout');
		});
	}
	
	console.log("data.length: "+data.length);
	if( data.length == 0 ){
        isEnd = true;
	}
});

addNo++; 

}

function likeon(i) {
	$(".likeoff"+ i).css("display","none");
	$(".likeon"+i).css("display","flex");
}
function likeoff(i) {
	$(".likeon"+ i).css("display","none");
	$(".likeoff"+ i).css("display","flex");
}
























//
