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
			<div class="panel-heading">Saisie nouveau utilisateur</div>
			<div class="panel-body">
				<form action="saveUser.do" method="post">

					<div class="form-group">
						<label class="control-label">Nom</label> <input type="text" required = "required"
							name="nom" class="form-control"> <span></span>
					</div>

					<div class="form-group">
						<label class="control-label">prenom</label> <input type="text" required = "required"
							name="prenom" class="form-control"> <span></span>
					</div>

					<div class="form-group">
						<label class="control-label">username</label> <input type="text" required = "required"
							name="username" class="form-control"> <span></span>
					</div>
					<div class="form-group">
						<label class="control-label">mot de passe</label> <input type="text" required = "required"
							name="password" class="form-control"> <span></span>
					</div>
					<div>
						<button class="btn btn-primary" type="submit">ajouter</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>