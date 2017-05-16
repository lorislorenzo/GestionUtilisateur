<%@page import="web.UserModel"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!Doctype>
<html>
<head>
<%@include file="header.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>GestiondesUtilisateurs</title>
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet"></link>
</head>
<body>
	<div class="container col-md-8 col-md-offset-2 ">
		<div class="panel panel-primary">
			<div class="panel-heading">Confirmation</div>
			<div class="panel-body">
				<div class="form-group">
					<label>Nom :</label>
					<label> ${user.first_name}</label>
				</div>
				<div class="form-group">
					<label>prenom :</label>
					<label> ${user.last_name}</label>
				</div>
				<div class="form-group">
					<label>login :</label>
					<label> ${user.username}</label>
				</div>
			</div>
		</div>
	</div>
</body>
</html>