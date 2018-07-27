// 인기 스토어

var strlist = [
	{url: "./workshop_sellerSite.html", img: "gb01.jpg", name: "스타 벅스"},
	{url: "./workshop_sellerSite.html", img: "gb02.jpg", name: "밝은 세상"},
	{url: "./workshop_sellerSite.html", img: "gb03.jpg", name: "좋은 인테리어"},
	{url: "./workshop_sellerSite.html", img: "gb04.jpg", name: "행복한 집"},
	{url: "./workshop_sellerSite.html", img: "gb05.jpg", name: "공감하는 방"},
	{url: "./workshop_sellerSite.html", img: "gb06.jpg", name: "인테리어 공방"},
	{url: "./workshop_sellerSite.html", img: "gb07.jpg", name: "기분좋은 하루"},
	{url: "./workshop_sellerSite.html", img: "gb08.jpg", name: "괜찮은 집"},
]

var best_store = $(".main_bestStore_images");

for(var item of strlist) {
	$('<div class="main_bestStore_img01">' +
			'<a href="./workshop_sellerSite.html">' +
			    '<img src="../../images/main/store_sample/'+ item.img +'">' +
			    '<div class="bt-tag-prod-black bt-over">' +
                    '<span>구경하기 +</span>' +
                '</div>' +
			'</a>' +
			'<p>'+ item.name +'</p>' +
		'</div>').appendTo(best_store);
}