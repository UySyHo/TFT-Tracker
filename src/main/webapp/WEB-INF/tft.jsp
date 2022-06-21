<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<
<link href="/css/style.css" rel="stylesheet" />
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
	<nav aria-label="breadcrumb" class = "navbar">
		<ol class="breadcrumb">
			<li class="breadcrumb-item"><a href="/ideas/new">Register</a></li>
			<li class="breadcrumbs"><a href="/ideas/new">Sign in</a></li>
			<li class="breadcrumb-item"><a href="/logout">Logout</a></li>
		</ol>
	</nav>
	<div class="practice">
		<form:form action="/search" method="post" modelAttribute="search"
			class="col-5 my-5 text-dark searchform">
			<div class="search">
				<label>SummonerName:</label>
				<form:errors path="summonerName" class="text-danger" />
				<form:input path="summonerName" class="form-control searchinput" />
				<input type="submit" value="Search" class="fa fa-search searchbutton" />
			</div>
		</form:form>
	</div>
	<div>
	</div>
	<div class="leaderboard">
		<h3>Leaderboard</h3>
		<table class="table table-bordered border-primary">
			<thead class="table-light">
				<tr>
					<th>Rank:</th>
					<th>Name:</th>
					<th>Tier:</th>
					<th>LP:</th>
					<th>Wins:</th>
				</tr>
			</thead>
			<tbody class="leaderboardTable">
				<c:forEach var="player" items="${searchLeaderboard.players}">
					<tr>
						<td><c:out value="${player.previousUpdateLadderPosition}"></c:out></td>
						<td><c:out value="${player.summonerName}"></c:out></td>
						<td><img class = "challengerimg"
							src="https://cdn.lolchess.gg/images/lol/tier/challenger_1.png"
							alt="Challenger" /></td>
						<td><c:out value="${player.ratedRating}"></c:out></td>
						<td><c:out value="${player.wins}"></c:out></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>