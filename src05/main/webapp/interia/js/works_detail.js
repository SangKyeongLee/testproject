// 제품 판매 관련 값 변경하기
var no = location.href.split("?")[1];


// 1. 이미지 부분은 나중에 건들겠음

// 밑에서부터 시작!
$.getJSON(serverRoot + "/json/works/" + no, (result) => {
	var title = result.title;
	var price = result.price;
	
	$("#fTitle").text(title);
	$("#fPrice").text(price);
	$("#fDeliveryPrice").text("2500");
	
	// 배송비 저장
	var deliveryPrice = 2500;
	$("#fTitle2").text(result.title);
	
	// 재고 설정
	var maxCapacity = result.capacity;
	$("#seller-value").text(1);
	$("#seller-value").val(1);
	var sellerValue = $("#seller-value").text();
	
	// 재고의 따른 가격
	$("#price-value").text(price * $("#seller-value").text());
	
	// 총 상품 금액
	$("#All-Price").text((sellerValue * price) + deliveryPrice);
	$("#All-Price").val((sellerValue * price) + deliveryPrice);
	
	// 구매 갯수 증가 이벤트
	$("#plus-value").click(() => {
		if (sellerValue == maxCapacity) {
			window.alert("더이상의 재고 수량이 존재하지 않습니다.");
		} else {
			$("#seller-value").text(sellerValue++);
			$("#price-value").text(price * $("#seller-value").text());
			$("#All-Price").text((sellerValue * price) + deliveryPrice);
			$("#All-Price").val((sellerValue * price) + deliveryPrice);
		}
	});
	
	// 구매 갯수 감소 이벤트
	$("#minus-value").click(() => {
		if (sellerValue == 1) {
			window.alert("최소 1개 이상을 지정해야합니다.");
		} else {
			$("#seller-value").text(sellerValue--);
			$("#price-value").text(price * $("#seller-value").text());
			$("#All-Price").text((sellerValue * price) + deliveryPrice);
			$("#All-Price").val((sellerValue * price) + deliveryPrice);
		}
	});
	
	//console.log(result);
	
	// 메인만 이미지 표시 (임시로 테스트용으로 둔 것!)
	$("#main-image").attr("src","../../images/works/works_list/" + result.photo.path);
	
	
	
	// 핸들러 제어
    var trTemplateSrc=$('#tr-template').html();
    
    // 위에서 준비한 템플릿 데이터를 가지고 HTML을 생성할 템플릿 엔진 준비
    var templateFn = Handlebars.compile(trTemplateSrc)
    
    $.getJSON("../../../json/works/option/" + no , (data) => {
        console.log(data);
        $(fAttributeValue).html(templateFn({select:data}))
    });
});
