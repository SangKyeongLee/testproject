var bt_sns_slider = $('.bt-sns-slider'); 

$.getJSON("../../../json/main/listmain", (data) => {
	
for (var item of data) {
	$('<div class="bt-sns-slider-piece">'+
			'<a class="sns-img-piece" href="#">' + 
			'<img src="../../images/sns/'+ item.path +'" alt="">'+
			'</a>' +
			'<div class="sns-cont-piece">' +
			'<div class="sns-cont-profile">' +
			'<div class="sns-cont-profile-img">' +
			'<img src="../../images/sns/hy.jpg" alt="">' +
			'</div>'+
			'<a href="#"><span class="bt-sns-userId">'+ item.nickname +'</span></a>' +
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
});