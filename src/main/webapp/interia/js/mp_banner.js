$(document).ready(function() {
        $(".mp-pic-focus").click(function() {
            $(".mp-cover-popup").toggle();
        });
        $(".mp-popup-hidden").click(function() {
            $(".mp-cover-popup").css("display","none");
        });
    });