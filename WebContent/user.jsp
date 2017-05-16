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
	<div class="container col-md-10 col-md-offset-1 ">
		<div class="panel panel-primary">
			<div class="panel-heading">Recherche</div>
			<div class="panel-body">
				<form action="chercher.do" method="get">
					<label>Nom</label> <input type="text" name="motCle">
					<button type="submit" class="btn btn-primary">Chercher</button>
				</form>
				<table class="table">
					<tr>
						<th>Nom</th>
						<th>Prenom</th>
						<th>login</th>
						<th>id</th>
						
					</tr>
					<c:forEach items="${model.user}" var="u">
						<tr>
							<td>${u.first_name}</td>
							<td>${u.last_name}</td>
							<td>${u.username}</td>
							<td>${u.id }</td>
							<td><a onclick="return confirm('Etes vous sur de vouloir supprimer ?')" href="supprimer.do?id=${u.id}">Suppimer</a></td>
							<td><a href="edit.do?id=${u.id}">Editer</a></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
</body>
</html>