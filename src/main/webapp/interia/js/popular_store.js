// 인기 스토어
$.getJSON("../../../json/main/popular", (data) => {

console.log(data);
var best_store = $(".main_bestStore_images");

for(var item of data) {
	$('<div class="main_bestStore_img01">' +
			'<a href="./workshop_sellerSite.html">' +
			    '<img src="../../images/main/store_sample/'+ item.PATH +'">' +
			    '<div class="bt-tag-prod-black bt-over">' +
                    '<span>구경하기 +</span>' +
                '</div>' +
			'</a>' +
			'<p>'+ item.MUTUA +'</p>' +
		'</div>').appendTo(best_store);
}

});