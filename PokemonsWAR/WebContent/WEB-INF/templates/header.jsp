<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="vendor/bulma-0.8.2/css/bulma.min.css" rel="stylesheet" />
<link  rel='stylesheet' href="vendor/fontawesome-free-5.13.0-web/css/all.min.css" />
<link href="css/style.css" rel="stylesheet" />
</head>
<body>
	<header class="has-background-warning">
		<div class="columns is-centered">
			<div class="column is-4">
				<img class="logo" src="img/pokemon.png" />
			</div>
		</div>
		<div class="columns">
			<div class="column is-12">
				<nav class="navbar" role="navigation" aria-label="main navigation">
					<div class="navbar-brand">
						<a role="button" class="navbar-burger burger" aria-label="menu"
							aria-expanded="false" data-target="navbarBasicExample"> <span
							aria-hidden="true"></span> <span aria-hidden="true"></span> <span
							aria-hidden="true"></span>
						</a>
					</div>

					<div id="navbarBasicExample" class="navbar-menu">
						<div class="navbar-start">
							<a href="AgregarPokemonesController.do"
								class='navbar-item ${param.pagina eq "agregar"? "is-active" : "" }'> Agregar </a>
							<a href="VerPokemonesController.do"
								class='navbar-item ${param.pagina eq "ver"? "is-active": "" }'> Ver </a>
						</div>
					</div>
				</nav>
			</div>
		</div>
	</header>
	<main class="mt-10">