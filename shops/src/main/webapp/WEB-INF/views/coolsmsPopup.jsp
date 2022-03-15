<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, 
                                   minimum-scale=1.0, user-scalable=no">
<title>Window Popup</title>
<meta name="description" content="">
<meta name="keywords" content="">
<script type="text/javascript" src="../js/jquery.min.js"></script>
<style>
* {
	padding: 0;
	margin: 0;
}

#pop_container {
	font-family: 'NotoSans', '맑은 고딕', 'Malgun Gothic', "돋움", dotum, arial,
		sans-serif;
	text-align: center;
	position: relative;
}

.top {
	position: relative;
	display: flex;
	justify-content: space-between;
	padding: 0.5rem 1.4rem;
	background-color: #fdd000;
	vertical-align: middle;
}

h1.infoTit {
	font-size: 20px;
	color: #ffffff;
}

main.textBox {
	padding-top: 3.4em;
	text-align: center;
}

h2.tit {
	font-size: 1.6em;
	letter-spacing: -2px;
	font-weight: bold;
	line-height: 1.5em;
}

p {
	line-height: 1.8em;
}

p.textContents {
	margin: 1.5em 1.8em;
	font-size: 1.1em;
	font-weight: 200;
}

footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	background-color: #dddddd;
}

footer.btnBox_todayClose {
	padding: 0.5rem 0 0.7rem;
	display: flex;
	justify-content: flex-end;
}

form {
	padding-right: 2rem;
}

input#chkday {
	width: 17px;
	height: 17px;
	vertical-align: middle;
}

label {
	vertical-align: middle;
}
</style>
<script>
$(document).ready(function() {
	//휴대폰 번호 인증 
	var code2 = ""; 
	$("#phoneChk").click(function(){ 
		alert("인증번호 발송이 완료되었습니다.\n휴대폰에서 인증번호 확인을 해주십시오."); 
		var phone = $("#phone").val(); 
	$.ajax({ 
		type:"GET", 
		url:"phoneCheck?phone=" + phone, 
		cache : false, 
		success:function(data){ 
			if(data == "error"){ 
				alert("휴대폰 번호가 올바르지 않습니다.") 
				$(".successPhoneChk").text("유효한 번호를 입력해주세요."); 
				$(".successPhoneChk").css("color","red"); 
				$("#phone").attr("autofocus",true); 
			}else{ 
				$("#phone2").attr("disabled",false); 
				$("#phoneChk2").css("display","inline-block");
				$(".successPhoneChk").text("인증번호를 입력한 뒤 본인인증을 눌러주십시오.");
				$(".successPhoneChk").css("color","green");
				$("#phone").attr("readonly",true); 
				code2 = data; 
				} 
			} 
		});
	});
	
	//휴대폰 인증번호 대조 
	$("#phoneChk2").click(function(){ 
		if($("#phone2").val() == code2){ 
			$(".successPhoneChk").text("인증번호가 일치합니다.");
			$(".successPhoneChk").css("color","green"); 
			$("#phoneDoubleChk").val("true"); 
			$("#phone2").attr("disabled",true);
			location.href="/step02";
		}else{ 
			$(".successPhoneChk").text("인증번호가 일치하지 않습니다. 확인해주시기 바랍니다.");
			$(".successPhoneChk").css("color","red"); 
			$("#phoneDoubleChk").val("false"); 
			$(this).attr("autofocus",true); 
			} 
		});
});
</script>
</head>
<body>
	<div id="popup">
		<header class="top">
			<h1 class="infoTit">coolsms api인증</h1>
		</header>
		<main class="textBox">
			<h2 class="tit">휴대폰인증</h2>
			<tr class="mobileNo">
				<th><label for="phone">휴대폰 번호</label></th>
				<td>
					<p>
						<input id="phone" type="text" name="phone" title="전화번호 입력" required /> 
						<span id="phoneChk" class="doubleChk">인증번호 보내기</span>
						<br />
						<input id="phone2" type="text" name="phone2" title="인증번호 입력" disabled required />
						<span id="phoneChk2" class="doubleChk">본인인증</span>
						<span class="point successPhoneChk">휴대폰 번호 입력후 인증번호 보내기를 해주십시오.
						</span>
						<input type="hidden" id="phoneDoubleChk" />
					</p>
					<p class="tip">최초 가입 시에만 사용하고 있습니다. 따로 저장되지 않습니다.(번호만 입력해주세요.)</p>
				</td>
			</tr>

		</main>

	</div>
	<footer class="btnBox_todayClose">
		<form method="post" action="" name="pop_form">
			<span id="check"><input type="checkbox" value="checkbox"
				name="chkbox" id="chkday" /> <label for="chkday">오늘 하루동안 보지
					않기</label> </span>
		</form>
	</footer>

</body>
</html>


