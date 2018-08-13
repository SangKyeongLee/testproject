$.getJSON(serverRoot + "/json/works/listSellerSite", (data) => {
	console.log(data);
	for (var i = 0; i < data.length; i++) {
		$("<a href='./product.html'>" +
				"<img src='../../images/workshop/" + data[i].path + "'>" +
				"</a>"
		).appendTo(".sellerSite_product_img_00");
		if (i == 11) {
        	break;
        }
	}
});
