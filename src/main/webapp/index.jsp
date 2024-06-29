<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
	<h2>Consulta Cep do serviço SOAP dos correios</h2>
	<form id="cep-form">
		<label for="cep">Cep:</label> <input type="text" id="cep" name="cep" />
		<input type="submit" value="Enviar" />
	</form>
	<div id="resposta"></div>

	<script>
		// Quando o formulário for enviado
		$("#cep-form").submit(function(event) {
			// Evitar o comportamento padrão do formulário
			event.preventDefault();

			// limpa a div de resposta
			$("#resposta").html("");

			// Obter o valor do campo de entrada
			var cep = $("#cep").val();

			// Enviar uma requisição AJAX para o Servlet
			$.ajax({
				type : "POST", // Método de requisição
				url : "CorreiosControle", // URL do Servlet
				data : {
					cep : cep
				}, // Dados a serem enviados
				success : function(response) {
					// Exibir a resposta do Servlet na div de resposta
					$("#resposta").html(response);
					// limpa o input do cep
					$("#cep").val("");
				}
			});
		});
	</script>

</body>
</html>