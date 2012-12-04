<%--http://rioperfil-nhhk9ghuhu.elasticbeanstalk.com 
	http://rioperfil-nhhk9ghuhu.elasticbeanstalk.com/
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!-- saved from url=(0014)about:internet -->
<html>
<!-- 
    Smart developers always View Source. 
    
    This application was built using Adobe Flex, an open source framework
    for building rich Internet applications that get delivered via the
    Flash Player or to desktops via Adobe AIR. 
    
    Learn more about Flex at http://flex.org 
    // -->
<head>
<title></title>
<meta name="google" value="notranslate" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<!-- Include CSS to eliminate any default margins/padding and set the height of the html element and 
             the body element to 100%, because Firefox, or any Gecko based browser, interprets percentage as 
             the percentage of the height of its parent container, which has to be set explicitly.  Fix for
             Firefox 3.6 focus border issues.  Initially, don't display flashContent div so it won't show 
             if JavaScript disabled.
        -->
<style type="text/css" media="screen">
html,body {
	height: 100%;
}

body {
	margin: 0;
	padding: 0;
	overflow: auto;
	text-align: center;
	background-color: #eff0f1;
}

object:focus {
	outline: none;
}

#flashContent {
	display: none;
}
</style>

<!-- Enable Browser History by replacing useBrowserHistory tokens with two hyphens -->
<!-- BEGIN Browser History required section -->
<link rel="stylesheet" type="text/css" href="flex/history/history.css" />
<script type="text/javascript" src="flex/history/history.js"></script>
<!-- END Browser History required section -->

<script type="text/javascript" src="flex/swfobject.js"></script>
<script type="text/javascript">
	// For version detection, set to min. required Flash Player version, or 0 (or 0.0.0), for no version detection. 
	var swfVersionStr = "11.1.0";
	// To use express install, set to playerProductInstall.swf, otherwise the empty string. 
	var xiSwfUrlStr = "playerProductInstall.swf";
	var flashvars = {};
	var params = {};
	params.quality = "high";
	params.bgcolor = "#eff0f1";
	params.allowscriptaccess = "sameDomain";
	params.allowfullscreen = "true";
	var attributes = {};
	attributes.id = "RioPerfil";
	attributes.name = "RioPerfil";
	attributes.align = "middle";
	swfobject.embedSWF("http://rioperfil-nhhk9ghuhu.elasticbeanstalk.com/flex/RioPerfil.swf",
			"flashContent", "100%", "100%", swfVersionStr, xiSwfUrlStr,
			flashvars, params, attributes); 
	// JavaScript enabled so display the flashContent div in case it is not replaced with a swf object.
	swfobject.createCSS("#flashContent", "display:block;text-align:left;");
</script>
</head>
<body>
	
	<!-- SWFObject's dynamic embed method replaces this alternative HTML content with Flash content when enough 
             JavaScript and Flash plug-in support is available. The div is initially hidden so that it doesn't show
             when JavaScript is disabled.
        -->
	<div id="flashContent">
		<p>To view this page ensure that Adobe Flash Player version 11.1.0
			or greater is installed.</p>
		<script type="text/javascript">
			var pageHost = ((document.location.protocol == "https:") ? "https://"
					: "http://");
			document
					.write("<a href='http://www.adobe.com/go/getflashplayer'><img src='" 
                                + pageHost + "www.adobe.com/images/shared/download_buttons/get_flash_player.gif' alt='Get Adobe Flash player' /></a>");
		</script>
	</div>

	<noscript>
		<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000"
			width="100%" height="100%" id="RioPerfil">
			<param name="movie"
				value="http://rioperfil-nhhk9ghuhu.elasticbeanstalk.com/flex/RioPerfil.swf" />
			<param name="quality" value="high" />
			<param name="bgcolor" value="#eff0f1" />
			<param name="allowScriptAccess" value="sameDomain" />
			<param name="allowFullScreen" value="true" />
			<!--[if !IE]>-->
			<object type="application/x-shockwave-flash"
				data="http://rioperfil-nhhk9ghuhu.elasticbeanstalk.com/flex/RioPerfil.swf" width="100%"
				height="100%">
				<param name="quality" value="high" />
				<param name="bgcolor" value="#eff0f1" />
				<param name="allowScriptAccess" value="sameDomain" />
				<param name="allowFullScreen" value="true" />
				<!--<![endif]-->
				<!--[if gte IE 6]>-->
				<p>Either scripts and active content are not permitted to run or
					Adobe Flash Player version 11.1.0 or greater is not installed.</p>
				<!--<![endif]-->
				<a href="http://www.adobe.com/go/getflashplayer"> <img
					src="http://www.adobe.com/images/shared/download_buttons/get_flash_player.gif"
					alt="Get Adobe Flash Player" />
				</a>
				<!--[if !IE]>-->
			</object>
			<!--<![endif]-->
		</object>
	</noscript>

	<div id="fb-root"></div>
      <script type="text/javascript">
        window.fbAsyncInit = function() {
          FB.init({
            appId      : '256197484464186',
            status     : true, 
            cookie     : true,
            xfbml      : true,
            oauth      : true,
          });
        };
        (function(d){
           var js, id = 'facebook-jssdk'; if (d.getElementById(id)) {return;}
           js = d.createElement('script'); js.id = id; js.async = true;
           js.src = "//connect.facebook.net/en_US/all.js";
           d.getElementsByTagName('head')[0].appendChild(js);
         }(document));
      </script>

	<script type="text/javascript">
	
		function compartilharLinkTweeter(){
			window.open ("https://twitter.com/intent/tweet?url=http://www.rioperfil.com.br&via=rioperfil&text=Conheça%20Rio%20Perfil%20,aplicação%20para%20localização%20e%20classificação%20de%20serviços%20da%20cidade%20do%20Rio%20de%20Janeiro.&hashtags=#rioperfil,#rioapps");
		}
		
		function tweet(texto){
			var url = "https://twitter.com/intent/tweet?via=rioperfil&text="+texto;
			window.open (url);
		}
		
		function compartilharLinkFacebook(){
			FB.getLoginStatus(
					function(response) {
						  console.log(response);
						  if (response.status == 'connected') {
							  postarLinkNoFacebook();
						  } else if (response.status == 'not_authorized') {
								  FB.login(function(response) {
									   if (response.authResponse) {
									      postarLinkNoFacebook();
									   } else {
									     	alert("O usuårio não autorizou acesso ao Facebook para a operação de compartilhar link.");
									   }
								},{scope: 'user_about_me,publish_actions,publish_stream,publish_checkins'});
								  
							  }else{
								  if(confirm("O usuårio não autorizou acesso ao Facebook para a operação de compartilhar link. Deseja tentar novamente o login?")){
									  FB.login(function(response) {
										   if (response.authResponse) {
										      postarLinkNoFacebook();
										   } else {
										     	alert("O usuårio não autorizou acesso ao Facebook para a operação de compartilhar link.");
										   }
									},{scope: 'user_about_me,publish_actions,publish_stream,publish_checkins'});
								  }
								  else {
								     	alert("O usuårio não autorizou acesso ao Facebook para a operação de compartilhar link.");
								   }
							  } 
			}); 
		}
		
		function postarLinkNoFacebook(){
			FB.ui({
		          method: 'send',
		          name: 'Acesse o Rio Perfil!',
		          link: 'http://www.rioperfil.com.br',
		          picture: 'http://rioperfil-nhhk9ghuhu.elasticbeanstalk.com/imagens/ico72.png',
		          description: 'Rio Perfil - Aplicação Web e Mobile para localização e classificação de serviços públicos e privados da cidade do Rio de Janeiro.'
		          },
		          function(response) {
		        	    if (!response || response.error) {
			        	      alert('O usuário cancelou a publicação do link no Facebook.');
		        	    } else {
			        	      alert('Link postado com sucesso no Facebook!');	
		        	    }
		        	  });
		}
		
		function escreverComentarioMuralFacebook(texto) {
				FB.getLoginStatus(
						function(response) {
							  if (response.status == 'connected') {
								  comentarNoFacebook(texto);
							  } else if (response.status == 'not_authorized') {
								  if(confirm("Deseja tentar novamente autenticar no Facebook?")){
									  loginFacebook(texto);
								  }else{
									  alert("O usuårio não autorizou acesso ao Facebook para a operação de comentário.");
								  }
							  } else {
								  loginFacebook(texto);
							  } 
				});
		}
		
		function loginFacebook(textoComentario){
			FB.login(function(response) {
				   if (response.authResponse) {
				      console.log('Bem vindo ao Rio Perfil!  Fetching your information.... ');
				      comentarNoFacebook(textoComentario);
				   } else {
				     	console.log('User cancelled login or did not fully authorize.');
				     	alert("O usuårio não autorizou acesso ao Facebook para a operação de comentário.");
				   }
			},{scope: 'user_about_me,publish_actions,publish_stream,publish_checkins'});
		}
		
		function comentarNoFacebook(texto){
			 FB.api('/me/feed', 'post', { message: texto,
				  link:'http://www.rioperfil.com.br',
				  name: 'Acesse o Rio Perfil!',
				  picture: 'http://rioperfil-nhhk9ghuhu.elasticbeanstalk.com/imagens/ico72.png' ,
				  caption: 'Rio Perfil, contribua para construir uma cidade melhor.',
				  description: 'Rio Perfil - Aplicação Web e Mobile para localização e classificação de serviços públicos e privados da cidade do Rio de Janeiro.'}, 
				function(response) {
					if (!response || response.error) {
						alert('Aconteceu erro na postagem do comentário no Facebook. ->'+response.error);
					} else {
						alert("Comentário publicado no Facebook com sucesso.");
					}
				});
			 
		}
		
		

	</script>

	
</body>
</html>
