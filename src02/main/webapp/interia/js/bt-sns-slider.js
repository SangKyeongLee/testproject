var bt_sns_slider = $('.bt-sns-slider'); 

var snslist = [
	{url:"#",img:"pot01.jpg", profile:"gg.jpg", name:"임현식이", content:"안녕하세요! 이번에 집 구조를 바꾸어 보았어요! 새로이 저의 집을 소개합니다."},
	{url:"#",img:"pot02.jpg", profile:"profile01.jpg", name:"식샤를합시다", content:"안녕하세요! 이번에 집 구조를 바꾸어 보았어요! 새로이 저의 집을 소개합니다."},
	{url:"#",img:"pot03.jpg", profile:"profile02.jpg", name:"성현동", content:"안녕하세요! 이번에 집 구조를 바꾸어 보았어요! 새로이 저의 집을 소개합니다."},
	{url:"#",img:"pot04.jpg", profile:"profile03.jpg", name:"서경", content:"안녕하세요! 이번에 집 구조를 바꾸어 보았어요! 새로이 저의 집을 소개합니다."},
	{url:"#",img:"pot05.jpg", profile:"profile04.jpg", name:"경명수", content:"안녕하세요! 이번에 집 구조를 바꾸어 보았어요! 새로이 저의 집을 소개합니다."},
	{url:"#",img:"pot06.jpg", profile:"profile05.jpg", name:"강동현", content:"안녕하세요! 이번에 집 구조를 바꾸어 보았어요! 새로이 저의 집을 소개합니다."},
	{url:"#",img:"pot07.jpg", profile:"profile06.jpg", name:"악동뮤지션", content:"안녕하세요! 이번에 집 구조를 바꾸어 보았어요! 새로이 저의 집을 소개합니다."},
	{url:"#",img:"pot08.jpg", profile:"salah.jpg", name:"이상경", content:"안녕하세요! 이번에 집 구조를 바꾸어 보았어요! 새로이 저의 집을 소개합니다."}
	]

for (var item of snslist) {
	$('<div class="bt-sns-slider-piece">'+
			'<a class="sns-img-piece" href="'+ item.url +'">' + 
			'<img src="../../images/main/keyword/pot/'+ item.img +'" alt="">'+
			'</a>' +
			'<div class="sns-cont-piece">' +
			'<div class="sns-cont-profile">' +
			'<div class="sns-cont-profile-img">' +
			'<img src="../../images/main/'+ item.profile +'" alt="">' +
			'</div>'+
			'<a href="#"><span class="bt-sns-userId">'+ item.name +'</span></a>' +
			'</div>' +
			'<span class="bt-sns-text">'+ item.content +'</span>' +
			'</div>'+
	'</div>').appendTo(bt_sns_slider);
}

$(bt_sns_slider).bxSlider({
	autoHover: true,
	auto: true,
	pager:false,
	minSlides: 5,
	maxSlides: 10,
	slideWidth: 240,
	slideMargin: 20,
	moveSlides: 1
});