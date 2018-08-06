// HOT KEYWORD

var eurolist = [
	{url: "#", img: "euro/euro01.jpg"},
	{url: "#", img: "euro/euro02.jpg"},
	{url: "#", img: "euro/euro03.jpg"},
	{url: "#", img: "euro/euro04.jpg"},
	{url: "#", img: "euro/euro05.jpg"},
	{url: "#", img: "euro/euro06.jpg"},
	{url: "#", img: "euro/euro07.jpg"},
	{url: "#", img: "euro/euro08.jpg"}
]

var euro = $(".bt-hashtag-euro");

for(var item of eurolist) {
	$('<li>' +
        '<a class="bt-tag-prod-box" href="'+ item.url +'">' +
          '<img src="../../images/main/keyword/'+ item.img +'">' +
          '<div class="bt-tag-prod-black bt-over">' +
            '<span>상세 보기 +</span>' +
          '</div>' +
        '</a>' +
      '</li>').appendTo(euro);
}

var summerlist = [
	{url: "#", img: "summer/summer01.jpg"},
	{url: "#", img: "summer/summer02.jpg"},
	{url: "#", img: "summer/summer03.jpg"},
	{url: "#", img: "summer/summer04.jpg"},
	{url: "#", img: "summer/summer05.jpg"},
	{url: "#", img: "summer/summer06.jpg"},
	{url: "#", img: "summer/summer07.jpg"},
	{url: "#", img: "summer/summer08.jpg"}
]

var summer = $(".bt-hashtag-summer");

for(var item of summerlist) {
	$('<li>' +
        '<a class="bt-tag-prod-box" href="'+ item.url +'">' +
          '<img src="../../images/main/keyword/'+ item.img +'">' +
          '<div class="bt-tag-prod-black bt-over">' +
            '<span>상세 보기 +</span>' +
          '</div>' +
        '</a>' +
      '</li>').appendTo(summer);
}

var modernlist = [
	{url: "#", img: "modern/modern01.jpg"},
	{url: "#", img: "modern/modern02.jpg"},
	{url: "#", img: "modern/modern03.jpg"},
	{url: "#", img: "modern/modern04.jpg"},
	{url: "#", img: "modern/modern05.jpg"},
	{url: "#", img: "modern/modern06.jpg"},
	{url: "#", img: "modern/modern07.jpg"},
	{url: "#", img: "modern/modern08.jpg"}
]

var modern = $(".bt-hashtag-modern");

for(var item of modernlist) {
	$('<li>' +
        '<a class="bt-tag-prod-box" href="'+ item.url +'">' +
          '<img src="../../images/main/keyword/'+ item.img +'">' +
          '<div class="bt-tag-prod-black bt-over">' +
            '<span>상세 보기 +</span>' +
          '</div>' +
        '</a>' +
      '</li>').appendTo(modern);
}

var potlist = [
	{url: "#", img: "pot/pot01.jpg"},
	{url: "#", img: "pot/pot02.jpg"},
	{url: "#", img: "pot/pot03.jpg"},
	{url: "#", img: "pot/pot04.jpg"},
	{url: "#", img: "pot/pot05.jpg"},
	{url: "#", img: "pot/pot06.jpg"},
	{url: "#", img: "pot/pot07.jpg"},
	{url: "#", img: "pot/pot08.jpg"}
]

var flowerpot = $(".bt-hashtag-flowerpot");

for(var item of potlist) {
	$('<li>' +
        '<a class="bt-tag-prod-box" href="'+ item.url +'">' +
          '<img src="../../images/main/keyword/'+ item.img +'">' +
          '<div class="bt-tag-prod-black bt-over">' +
            '<span>상세 보기 +</span>' +
          '</div>' +
        '</a>' +
      '</li>').appendTo(flowerpot);
}

var simplelist = [
	{url: "#", img: "simple/simple01.jpg"},
	{url: "#", img: "simple/simple02.jpg"},
	{url: "#", img: "simple/simple03.jpg"},
	{url: "#", img: "simple/simple04.jpg"},
	{url: "#", img: "simple/simple05.jpg"},
	{url: "#", img: "simple/simple06.jpg"},
	{url: "#", img: "simple/simple07.jpg"},
	{url: "#", img: "simple/simple08.jpg"}
]

var simple = $(".bt-hashtag-simple");

for(var item of simplelist) {
	$('<li>' +
        '<a class="bt-tag-prod-box" href="'+ item.url +'">' +
          '<img src="../../images/main/keyword/'+ item.img +'">' +
          '<div class="bt-tag-prod-black bt-over">' +
            '<span>상세 보기 +</span>' +
          '</div>' +
        '</a>' +
      '</li>').appendTo(simple);
}