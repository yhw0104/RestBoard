$(document).ready(function () {
    $('#btn-save').click(function () {
        let data = {
            title: $("#title").val(),
            writer: $("#writer").val(),
            content: $("#content").val()
        };
        $.ajax({
            type: 'post',
            url: '/api/post',
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            success: function () {
                alert("작성완료");
                location.href = "/";
            }
        });
    });
});