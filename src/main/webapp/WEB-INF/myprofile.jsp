<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
            <!DOCTYPE html>
            <html>

            <head>
                <link href="/css/style.css" rel="stylesheet" />
                <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
                <meta charset="ISO-8859-1">
                <title>Insert title here</title>
            </head>
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <style>
                .content {
                    max-width: 500px;
                    margin: auto;
                    background: white;
                    padding: 10px;
                }
            </style>
            <style>
                body {
                    background-color: #238EDB;
                    height: 400px;
                    background-position: center;
                    background-repeat: no-repeat;
                    background-size: cover;
                    position: relative;
                }
            </style>
            <style>
                .textProperty {
                    color: white;
                }
                
                .textPropertyTable {
                    color: black;
                }
                
                .myDiv1 {
                    border: 1px outset white;
                    background-color: whitesmoke;
                    text-align: center;
                }
                
                .myDiv2 {
                    border: 1px outset white;
                    background-color: Gainsboro;
                    text-align: center;
                }
                
                .myDiv3 {
                    border: 1px outset white;
                    background-color: grey;
                    text-align: center;
                }
                
                .myDiv4 {
                    background-color: #535AFF;
                    color: white;
                }
                
                .myDiv5 {
                    background-color: #535AFF;
                    color: white;
                }
                
                .nameHeader {
                    display: inline;
                }
                
                .regionHeader {
                    display: inline;
                }
                
                .updateHeader {
                    display: block;
                }
                
                .spacer {
                    height: 50px;
                    background-color: white;
                }
                
                table {
                    font-family: arial, sans-serif;
                    border-collapse: collapse;
                    width: 100%;
                }
                
                td,
                th {
                    text-align: left;
                    padding: 8px;
                }
                
                tr:first-child {
                    background-color: #030083;
                }
                
                tr {
                    background-color: #D9D9D9;
                }
            </style>
            <style>
                footer {
                    background-color: black;
                }
            </style>

            <body>
                <nav aria-label="breadcrumb" class="navbar">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="/ideas/new">Register</a></li>
                        <li class="breadcrumbs"><a href="/ideas/new">Sign in</a></li>
                        <li class="breadcrumb-item"><a href="/logout">Logout</a></li>
                    </ol>
                </nav>
                <div class="spacer"> </div>

                <h1 class="textProperty">A Coaches Profile</h1>

                <div class="container">
                    <img src="../resources/static/images/penguin.png">
                </div>

                <div class="myDiv1">
                    <h2 class="nameHeader"> Dress (Summoner Name) </h2>
                    <h4 class="regionHeader"> NA </h4>
                    <h4 class="updateHeader"> Update </h4>
                </div>

                <div class="myDiv2">
                    <h2 class="nameHeader"> Rank Overview </h2>
                    <h2 class="nameHeader"> Coach Profile </h2>
                </div>

                <div class="myDiv3">
                    <p>Tier</p>
                    <p>UP</p>
                    <p>Wins</p>
                </div>

                <div class="myDiv4">
                    <h2 class="nameHeader"> My Weekly Schedule </h2>
                    // add table for scheduling
                    <table width="300" cellpadding="10" cellspacing="5">
                    </table>
                </div>

                <div class="myDiv5">
                    <h2 class="nameHeader">Match History </h2>
                    <table width="10" cellpadding="10" cellspacing="5">
                        <tr class="textProperty">
                            <th>Rank</th>
                            <th>Summoner Name</th>
                            <th>Tier</th>
                            <th>LP</th>
                            <th>Wins</th>
                            <th>WinRate</th>
                        </tr>
                        <tr class="textPropertyTable">
                            <td>1</td>
                            <td>Dress</td>
                            <td>Some image</td>
                            <td>100</td>
                            <td>500</td>
                            <td>55%</td>
                        </tr>
                        <tr class="textPropertyTable">
                            <td>1</td>
                            <td>Dress</td>
                            <td>Some image</td>
                            <td>100</td>
                            <td>500</td>
                            <td>55%</td>
                        </tr>
                        <tr class="textPropertyTable">
                            <td>1</td>
                            <td>Dress</td>
                            <td>Some image</td>
                            <td>100</td>
                            <td>500</td>
                            <td>55%</td>
                        </tr>
                        <tr class="textPropertyTable">
                            <td>1</td>
                            <td>Dress</td>
                            <td>Some image</td>
                            <td>100</td>
                            <td>500</td>
                            <td>55%</td>
                        </tr>
                        <tr class="textPropertyTable">
                            <td>1</td>
                            <td>Dress</td>
                            <td>Some image</td>
                            <td>100</td>
                            <td>500</td>
                            <td>55%</td>
                        </tr>
                        <tr class="textPropertyTable">
                            <td>1</td>
                            <td>Dress</td>
                            <td>Some image</td>
                            <td>100</td>
                            <td>500</td>
                            <td>55%</td>
                        </tr>
                    </table>
                </div>

                <div class="spacer"> </div>
                <footer>
                    display: block;
                </footer>

            </body>

            </html>