<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pagina de inicio</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootswatch/3.3.6/cosmo/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<form:form action="yielRandomSolutionWorld" method="get"
		modelAttribute="">
		<span>nombre de la receta:</span>
		<input type="submit" value="Mandar letra" />
	</form:form>
	
	<br />
	<br />
	<br />
	<br />
	
	<form:form action="checkAnswer">
		<form:input type="text" path="userInput" name="answer" />
	</form:form>

	<br />
	<br />
	<br />
	<br />
	<br />

	<span> <c:out value="${feedback}"></c:out>
	</span>

</body>
</body>
</body>
</html>