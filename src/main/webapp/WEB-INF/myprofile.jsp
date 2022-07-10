<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
            <!DOCTYPE html>
            <html>

            <head>
                <link href="/css/style.css" rel="stylesheet" />
                <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
                <meta charset="ISO-8859-1">
                <title>Insert title here</title>
            </head>
            <style>
                body {
                    background-color: #6495ED;
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

                <h1 class="textProperty">Your Name</h1>

                <div class="myDiv1">
                    <h2 class="nameHeader"> Summoner Name </h2>
                    <h4 class="regionHeader"> Region </h4>
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

                <h2 class="textProperty">Available Coaching Sessions </h2>
                // add table for scheduling
                <table width="400" cellpadding="10" cellspacing="5">
                </table>

                <h2 class="textProperty">Match History </h2>
                // add table match history
                <table width="400" cellpadding="10" cellspacing="5">
                </table>
            </body>

            </html>