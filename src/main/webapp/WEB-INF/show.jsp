<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link href="/css/style.css" rel="stylesheet" />
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="<c:url value="/tft" />" method="GET">
		<input type="submit" name="action" value="Home" />
	</form>


	<div class="myDiv">
		<p>
			<span style="border: 1px solid black">Home</span> <span
				style="border: 1px solid black">Like</span> <span
				style="border: 1px solid black">Block</span>
		</p>
	</div>

	<div class="myDiv">
		<p>
			<span style="border: 1px solid black">Icon</span> <span
				style="border: 1px solid black">Summoner Name</span>
		</p>
		<div class="match" style="border: 1px solid black">Match History</div>
	</div>

	<div class="myDiv">
		<p class="ranks">
			<span style="border: 1px solid black">All</span> <span
				style="border: 1px solid black">Ranked<span><span
					style="border: 1px solid black">Hyper Roll</span> <span
					style="border: 1px solid black">Double Up</span> <span
					style="border: 1px solid black">Normal</span>
		</p>

		<table class="historytable">
			<tr>
				<th>Rank</th>
				<th>Little Legend</th>
				<th>Role</th>
				<th>Augments</th>
				<th>Champions</th>
			</tr>
			<tr>
				<td>
					<p>8th</p>
					<p>Normal</p>
					<p>33:21</p>
					<p>1d ago</p>
				</td>
				<td>Maria Anders</td>
				<td><p>Ragewing</p>
					<p>Mage</p></td>
				<td><p>Richer get rich</p>
					<p>Tank</p></td>
				<td><span>Zed</span> <span>Nami</span><span> Sett</span> <span>Vlad</span>
					<span>Ryze</span></td>
			</tr>
			<tr>
				<td><p>8th</p>
					<p>Normal</p>
					<p>33:21</p>
					<p>1d ago</p></td>
				<td>Francisco Chang</td>
				<td><p>Ragewing</p>
					<p>Mage</p></td>
				<td><p>Richer get rich</p>
					<p>Tank</p></td>
				<td><span>Zed</span> <span>Nami</span><span> Sett</span> <span>Vlad</span>
					<span>Ryze</span></td>
			</tr>
			<tr>
				<td><p>8th</p>
					<p>Normal</p>
					<p>33:21</p>
					<p>1d ago</p></td>
				<td>Roland Mendel</td>
				<td><p>Ragewing</p>
					<p>Mage</p></td>
				<td><p>Richer get rich</p>
					<p>Tank</p></td>
				<td><span>Zed</span> <span>Nami</span><span> Sett</span> <span>Vlad</span>
					<span>Ryze</span></td>
			</tr>
			<tr>
				<td><p>8th</p>
					<p>Normal</p>
					<p>33:21</p>
					<p>1d ago</p></td>
				<td>Helen Bennett</td>
				<td><p>Ragewing</p>
					<p>Mage</p></td>
				<td><p>Richer get rich</p>
					<p>Tank</p></td>
				<td><span>Zed</span> <span>Nami</span><span> Sett</span> <span>Vlad</span>
					<span>Ryze</span></td>
			</tr>
			<tr>
				<td><p>8th</p>
					<p>Normal</p>
					<p>33:21</p>
					<p>1d ago</p></td>
				<td>Yoshi Tannamuri</td>
				<td><p>Ragewing</p>
					<p>Mage</p></td>
				<td><p>Richer get rich</p>
					<p>Tank</p></td>
				<td><span>Zed</span> <span>Nami</span><span> Sett</span> <span>Vlad</span>
					<span>Ryze</span></td>
			</tr>
			<tr>
				<td><p>8th</p>
					<p>Normal</p>
					<p>33:21</p>
					<p>1d ago</p></td>
				<td>Giovanni Rovelli</td>
				<td><p>Ragewing</p>
					<p>Mage</p></td>
				<td><p>Richer get rich</p>
					<p>Tank</p></td>
				<td><span>Zed</span> <span>Nami</span><span> Sett</span> <span>Vlad</span>
					<span>Ryze</span></td>
			</tr>
			<tr>
				<td><p>8th</p>
					<p>Normal</p>
					<p>33:21</p>
					<p>1d ago</p></td>
				<td>Giovanni Rovelli</td>
				<td><p>Ragewing</p>
					<p>Mage</p></td>
				<td><p>Richer get rich</p>
					<p>Tank</p></td>
				<td><span>Zed</span> <span>Nami</span><span> Sett</span> <span>Vlad</span>
					<span>Ryze</span></td>
			</tr>
			<tr>
				<td><p>8th</p>
					<p>Normal</p>
					<p>33:21</p>
					<p>1d ago</p></td>
				<td>Giovanni Rovelli</td>
				<td><p>Ragewing</p>
					<p>Mage</p></td>
				<td><p>Richer get rich</p>
					<p>Tank</p></td>
				<td><span>Zed</span> <span>Nami</span><span> Sett</span> <span>Vlad</span>
					<span>Ryze</span></td>
			</tr>
			<table>

				<h1>${searchSummoner.name}</h1>
				<h1>Level ${searchSummoner.summonerLevel}</h1>
				<img
					src="https://ddragon.poro.gg/12.11.1/img/profileicon/${searchSummoner.profileIconId}.png"
					alt="" />
				<p>This is ${getMatchById.metadata.match_id}</p>
				<p>matchPuid ${getMatchByPuuid}</p>
				
				<c:forEach var="match" items="${listOfMatches}">
					<tr>
						<td><c:out value="${match.metadata.match_id}"></c:out></td>
					</tr>
					<tr>
						<td><c:out value="${match.metadata.data_version}"></c:out></td>
					</tr>
					<div>
						<c:forEach var="participant" items="${match.info.participants}">
							<c:forEach var="trait" items="${participant.traits}">
								<c:out value="${trait.name}"></c:out>
							</c:forEach>

							<c:forEach var="augment" items="${participant.augments}">
								<c:out value="${augment}"></c:out>
							</c:forEach>
						</c:forEach>
					</div>
				</c:forEach>
</body>
</html>
