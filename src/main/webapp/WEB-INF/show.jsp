<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
            <!DOCTYPE html>
            <html>

            <head>
                <link href="/css/style2.css" rel="stylesheet" />
                <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
                <meta charset="ISO-8859-1">
                <title>Insert title here</title>
            </head>

            <body>


                <form action="<c:url value=" /tft " />" method="GET">
                    <input type="submit" name="action" value="Home" />
                </form>

                <nav>
                    <div class="nav_links">
                        <li class="sign_in"><a href="#">Sign in</a></li>
                    </div>
                </nav>

                <div class="myDiv1">


                    <div class="summonerbox">
                        <div class="summonerbox2">
                            <img src="https://i.redd.it/8vd8plmz83471.jpg" alt="Zed" class="zed" height="100" />
                            <h1 class="nameHeader"> Summoner Name </h1>
                            <div class="buttons">
                                <button class="update"> Update </button>
                            </div>
                        </div>

                        <div class="summonerbox3">
                            <img src="https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/764bbd9c-6d80-481d-8136-96848f01e843/ddx6pg1-730d879b-285c-4b93-921d-89635b5493de.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzc2NGJiZDljLTZkODAtNDgxZC04MTM2LTk2ODQ4ZjAxZTg0M1wvZGR4NnBnMS03MzBkODc5Yi0yODVjLTRiOTMtOTIxZC04OTYzNWI1NDkzZGUucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.3c7n9z03MpyvyiFErtNGxubutThBspS7nm9Tg1pemh0"
                                alt="Diamond" class="diamond" height="100" />
                            <div class="stuff"> Diamond4</div>
                            <div class="stuff">36LP</div>
                            <div class="stuff">WinRate 52%</div>

                        </div>
                    </div>
                </div>


                </div>


                <div class="history">
                    <h3>Match History</h3>
                    <div class="myDiv4">
                        <div class="type">
                            <button>Normal</button>
                            <button>Ranked</button>
                            <button>Double Up</button>
                            <button>Hyper Roll</button>
                        </div>
                    </div>
                    <table class="table table-bordered border-primary">
                        <thead class="traits">
                            <tr>
                                <th class="trait">
                                    <p>Trait</p>
                                </th>
                                <th class="play">Plays</th>
                                <th class="winner">Win%</th>
                                <th class="traittop">Top%</th>
                                <th class="traitchamp">Champion</th>
                                <th class="traitplay">Plays</th>
                                <th class="traitwin">Win%</th>
                                <th class="traittops">Top%</th>
                            </tr>
                </div>
                </thead>
                <tr>
                    <td class="trait">
                        <p>Ragewing</p>
                    </td>
                    <td class="play">
                        <p>Ragewing</p>
                    </td>
                    <td class="winner">
                        <p>Ragewing</p>
                    </td>
                    <td class="traittop">
                        <p>Ragewing</p>
                    </td>
                    <td class="traitchamp">
                        <p>Ragewing</p>
                    </td>
                    <td class="traitplay">
                        <p>Ragewing</p>
                    </td>
                    <td class="traitwin">
                        <p>Ragewing</p>
                    </td>
                    <td class="traittops">
                        <p>Ragewing</p>
                    </td>
                </tr>
                </table>
                </div>


                <h1>${searchSummoner.name}</h1>
                <h1>Level ${searchSummoner.summonerLevel}</h1>
                <img src="https://ddragon.poro.gg/12.11.1/img/profileicon/${searchSummoner.profileIconId}.png" alt="" />
                <p>This is ${getMatchById.metadata.match_id}</p>
                <p>matchPuid ${getMatchByPuuid}</p>
                <c:forEach var="match" items="${listOfMatches}">
                    <tr>
                        <td>
                            <c:out value="${match.metadata.match_id}"></c:out>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <c:out value="${match.metadata.data_version}"></c:out>
                        </td>
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