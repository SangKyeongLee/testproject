var addr;
var prdnm;
var i = 1;

$("#linkadd img").on("click", clickHandler);

function clickHandler(event) {
	
  console.log(event);
  console.log(event.clientX, event.clientY);
  console.log(event.offsetX, event.offsetY);
  x = event.offsetX;
  y = event.offsetY;
   /*alert('x좌표:' + x + ', y좌표:' + y + ', cy좌표: ' + cy + ', py좌표: ' + py + ', sy좌표: ' + sy);*/
  $("#linkadd").append("<div class='link_input"+ i +"'>"+
    "<div class='link_input_box link_input_wrap"+ i +"  link_zindex'>" +
      "<div class='link_input_tag'>" +
        "<input type='text' name='prdnm' id='prdnm"+ i +"' class='lk_ip' placeholder='상품명을 입력해주세요.'/>" +
        "<input type='text' name='addr' id='addr"+ i +"' class='lk_ip' placeholder='상품URL을 입력해주세요'/>" +
      "</div>" +
      "<div class='link_btn_tag'>" +
        "<button type='button' name='button' class='btn btn-warning btn-sm' onclick='input("+ i +")'>입력</button>" +
        "<button type='button' name='button' class='btn btn-secondary btn-sm' onclick='remove("+ i +")'>취소</button>" + "</div>" +
      "</div>"+
    "</div>");
  $(".link_input" + i).css({
    "display":"block",
    "position":"absolute",
    "top": y,
    "left": x
  });
  i++;
}

function input(i) {
  addr = $("#addr"+i).val();
  prdnm = $("#prdnm"+i).val();
  // alert("링크주소:" + addr);
  $(".link_input" + i).append(
    "<div class='link_atag' onclick='linkbox("+ i +")'></div>"+
    "<div class='link_atag_box"+ i +" link_view_box' style='display:none'>"+
      "<div id='new"+ i +"'>"+
        "<div class='link_view_span'>"+
          "<span style='font-weight:bold; font-size:14px'>상품명: </span>"+"<span>"+ prdnm +"</span>" +
        "</div>" +
        "<div class='link_view_a'>"+
          "<a href='"+ addr + "' class='new" + i +"'>상품 판매 주소로 이동하기 ></a>" +
        "</div>"+
        "<div class='link_view_btn'>"+
          "<button type='button' name='button' class='btn btn-secondary btn-sm' onclick='remove("+ i +")'>삭제</button>" +
          "<button type='button' name='button'class='btn btn-warning btn-sm' onclick='cancel("+ i +")'>닫기</button>" +
        "</div>"+
      "</div>"+
    "</div>");

  $(".link_input_wrap"+ i).css("display","none");
}

function cancel(i) {
  $(".link_atag_box"+i).hide();
}

function remove(i) {
  $(".link_input"+i).remove();
}

function linkbox(i) {
  $(".link_atag_box"+i).css({
    "display":"block",
  });
}
