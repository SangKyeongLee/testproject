$.getJSON(serverRoot + "/json/auth/loginUser", (data) => {
	
	// 핸들바 템플릿(전체 공방별 리스트용)
	var sourceWorkshopList = $('#basket-template').html()
	// 핸들바 템플릿 컴파일(전체 리스트용)
	var templateFnWorkshopList = Handlebars.compile(sourceWorkshopList);
	
	// 먼저 공방제목 찾기
	$.getJSON(serverRoot + "/json/works/buscketWorkshop/",
			(workshopData) => {
			
			// 다음으로 공방별 제품 찾기
			$.getJSON(serverRoot + "/json/works/buscketList/", (productData) => {
				
				// 먼저 공방의 대해 출력
				$("#basket-list").html(templateFnWorkshopList({bascket:workshopData}))
				
				// 핸들바 템플릿(제품용)
				var sourceProduct = $("#product-template").html()
				
				// 핸들바 템플리 컴파일(제품용)
				var templateFnProduct = Handlebars.compile(sourceProduct);
				
				// 각 공방별로 제품 리스트 담기
				for (var j = 0; j < workshopData.length; j++) {
					var workshopTitle = $("#studioName" + workshopData[j].workshopNumber).text();
					var products = new Array();
					
					var x = 0;
					for (var i = 0; i < productData.length; i++) {
						if (workshopTitle == productData[i].studioName) {
							products[x] = productData[i];
							
							// 택배비 여부 검사, 참이면 : 일반택배배송, 거짓이면 : 무료배송
							if (productData[i].deliveryPrice == "y" || productData[i].deliveryPrice == "Y") {
								products[x].resultDelivery ="일반택배배송";
							} else {
								products[x].resultDelivery ="무료배송";
							}
							console.log(products[x]);
							x++;
						}
					}
					$("#bascket-list-detail" + workshopData[j].workshopNumber).html(templateFnProduct({product:products}))
				}
				
				$("#submit-purchase").click(() => {
					
					location.href='sp_purchase.html';
				})
			});


		
	});
}).fail(() => {
	location.href = serverRoot + "/interia/html/auth/login.html";
}); 



