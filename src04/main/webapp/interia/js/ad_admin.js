"use strict"

$(document).ready(function(){
	$('#chk_all').click(function(){
		if($('#chk_all').prop('checked')) {
			$('.frt_tbl_type input[type=checkbox]').prop('checked',true);
		} else {
			$('.frt_tbl_type input[type=checkbox]').prop('checked',false);
		}
	});

});

/*모달 초기화*/
$(document).ready(function(){
	$('.modal').on('hidden.bs.modal', function (e) { 
		$(this).find('form')[0].reset() 
		/*첨부파일 및 체크박스 옵션, 에디터 초기화 코드 삽입하기*/
	});
});


/* works modal chk option */
function openOption(className, obj) {
    var $input = $(obj);
    if ($input.prop('checked')) $(className).show();
    else $(className).hide();
}

function writable(className, obj) {
	var $input = $(obj);
	if($input.prop('checked')) $(className).attr('readonly',false);
	else $(className).attr('readonly',true);
}






