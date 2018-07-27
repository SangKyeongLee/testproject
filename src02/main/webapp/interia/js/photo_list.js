// 자랑하기 리스트
var grid = $(".grid");

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
	]
var i = 1;
for (var item of phtlist) {
	$('<div class="grid-item">' +
			'<a class="grid-photo-a" href="#myModal"  data-toggle="modal">'+
			'<div class="grid-photo">'+
			'<img src="../../images/sns/'+ item.img +'" alt="">'+
			'</div>'+
			'</a>'+
			'<div class="grid-photo-cont">'+
			'<a class="grid-photo-like likeoff'+ i +'" id="like_off" onclick=\"likeon('+ i +')\">'+ 
			'<i class="material-icons">favorite_border</i>'+
			'<span>'+ item.like +'</span>'+
			'</a>' +
			'<a class="grid-photo-like likeon'+ i +'" id="like_on" onclick=\"likeoff('+ i +')\" style="display:none">'+ 
			'<i class="material-icons" >favorite</i>'+
			'<span>'+ item.like +'</span>'+
			'</a>' +
			'<a class="grid-photo-bookmark bookoff'+ i +'" id="bookmark_off" onclick=\"bookon('+ i +')\" >'+ 
			'<i class="material-icons">bookmark_border</i>'+
			'<span>'+ item.bookmark +'</span>'+
			'</a>'+
			'<a class="grid-photo-bookmark bookon'+ i +'" id="bookmark_on=" onclick=\"bookoff('+ i +')\" style="display:none">'+ 
			'<i class="material-icons">bookmark</i>'+
			'<span>'+ item.bookmark +'</span>'+
			'</a>'+
			'<div class="grid-photo-view">'+
			'<span class="grid-photo-view-count">조회수</span><span>'+ item.view +'</span>'+
			'</div>'+
			'</div>'+
	'</div>').appendTo(grid);
	i++;
}

$(grid).masonry({
    itemSelector: '.grid-item',
    columnWidth: 224,
    horizontalOrder: true,
    gutter: 20
});

$("#like_off").on("click", likeon);
$("#like_on").on("click", likeoff);
$("#bookmark_off").on("click", bookon);
$("#bookmark_on").on("click", bookoff);

function likeon(i) {
	$(".likeoff"+ i).css("display","none");
	$(".likeon"+ i).css("display","flex");
}
function likeoff(i) {
	$(".likeon"+ i).css("display","none");
	$(".likeoff"+ i).css("display","flex");
}
function bookon(i) {
	$(".bookoff"+ i).css("display","none");
	$(".bookon"+ i).css("display","flex");
}
function bookoff(i) {
	$(".bookon"+ i).css("display","none");
	$(".bookoff"+ i).css("display","flex");
}

//
