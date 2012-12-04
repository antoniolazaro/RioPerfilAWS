<html>
	<head>

	</head>
	
	<body>
		<%-- a href="https://www.facebook.com/dialog/oauth?client_id=256197484464186&redirect_uri=http://186.233.149.48:8081/appRio/testeFacebook&scope=publish_stream,read_stream,user_about_me,user_likes,user_status">Conectar Facebook</a--%>
	    <br>
	    <form action="https://www.facebook.com/dialog/oauth?client_id=256197484464186&redirect_uri=http://186.233.149.48:8081/appRio/testeFacebook&scope=publish_stream,read_stream,user_about_me,user_likes,user_status">
		     <input id="tokenFacebook" type="text" value='<%= request.getParameter("access_token") %>' size="150">
		     <br>
		     <a target="_blank" href="/facebookService?serviceName=obterNome">Exibir Nome Perfil</a>
	     </form>
	</body>
</html>