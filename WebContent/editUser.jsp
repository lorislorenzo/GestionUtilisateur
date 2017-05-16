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
				<form action="updateUser.do" method="post">
					<div class="form-group">
						<label class="control-label">id</label> <input type="text" value ="${user.id}"required = "required"
							name="id" class="form-control"> <span></span>
					</div>

					<div class="form-group">
						<label class="control-label">Nom</label> <input type="text" value ="${user.first_name}"required = "required"
							name="nom" class="form-control"> <span></span>
					</div>

					<div class="form-group">
						<label class="control-label">prenom</label> <input type="text" value ="${user.last_name} " required = "required"
							name="prenom" class="form-control"> <span></span>
					</div>

					<div class="form-group">
						<label class="control-label">username</label> <input type="text" value ="${user.username}" required = "required"
							name="username" class="form-control"> <span></span>
					</div>
					<div class="form-group">
						<label class="control-label">password</label> <input type="text" value ="${user.password}" required = "required"
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