<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: #adadad;
}
.navbar {
  height: 46px;
  background-color: #1b1b1b;
  border-radius: 10px;
}

.navbar a {
    float: left;
    font-size: 16px;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
    border-radius: 10px;
}

.dropdown {
    float: left;
    position: relative;
    min-width: 20%;
}

.dropdown .dropbtn {
    font-size: 16px;    
    border: none;
    outline: none;
    color: white;
    padding: 14px 16px;
    background-color: inherit;
    font-family: inherit;
    margin: 0;
    border-radius: 10px;
    text-align: center;
}

.navbar a:hover, .dropdown:hover .dropbtn {
    background-color: red;
}

.dropdown-one {
  cursor: pointer;
  display: none;
  position: absolute; 
  background-color: #f9f9f9;
  min-width: 100%;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  border-radius: 10px;
}

.dropdown-two {
  cursor: pointer;
  display: none;
  position: absolute;
  left: 100%;
  min-width: 100%;
  top: 0px;
  background-color: #f9f9f9;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  border-radius: 10px;
}

.dropdown:hover .dropdown-one, #link1:hover > .dropdown-two {
  display: block;
}

.dropdown-one .dItem {
    color: black;
    padding: 12px 16px;
    min-width: 20%;
    display: block;
    text-align: left;
    border-radius: 10px;
}

.dropdown-one .dItem:hover, .dropdown-two a:hover {
    background-color: #ddd;
}

.container {
  max-width: 800px;
  height: 800px;
  background-color: white;
  margin: 10px auto 0 auto;
}

.tabContent {
    display: none;
    padding: 6px 12px;
    border-top: none;
}

.imgstyle { 
width: 150px; 
height: 150px;
border-radius: 80px; 
 box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
margin-bottom: 5px;
}

</style>
<img src="/images/logo.jpg" class="imgstyle">
<!--   ****** NavBar ****** -->
    <div class="navbar">
      <div class="dropdown">
        <div class="dropbtn">Book Tickets</div>
<!--         Main Dropdown -->
        <div class="dropdown-one">
          <div id="link1" class="dItem" href="#">Link 1
<!--             Inside Dropdown -->
            <div class="dropdown-two">
              <div class="dItem" id="file" href="#">Import</div>
            </div>
          </div>
          <div class="dItem" href="#">Single Ticket</div>
          <div class="dItem" href="#">Multiple Tickets</div>
        </div>
      </div> 
      
      <div class="dropdown">
        <div class="dropbtn">My Bookings</div>
<!--         Main Dropdown -->
        <div class="dropdown-one">
          <div id="link1" class="dItem" href="#">Link 1
<!--             Inside Dropdown -->
            <div class="dropdown-two">
              <div class="dItem" id="file" href="#">Import</div>
            </div>
          </div>
          <div class="dItem" href="#">View Booked Tickets</div>
          <div class="dItem" href="#">Print Booked Tickets</div>
          <div class="dItem" href="#">Alter a Booked Ticket</div>
          <div class="dItem" href="#">Reschedule a Booked Ticket</div>
          <div class="dItem" href="#">Cancel a Booked Ticket</div>
          
        </div>
      </div> 
      
      <div class="dropdown">
        <div class="dropbtn">Flights</div>
<!--         Main Dropdown -->
        <div class="dropdown-one">
          <div id="link1" class="dItem" href="#">Link 1
<!--             Inside Dropdown -->
            <div class="dropdown-two">
              <div class="dItem" id="file" href="#">Import</div>
            </div>
          </div>
          <div class="dItem" href="#">Check Status</div>
          <div class="dItem" href="#">Link 3</div>
        </div>
      </div> 
      
      <div class="dropdown">
        <div class="dropbtn">Sky Miles</div>
<!--         Main Dropdown -->
        <div class="dropdown-one">
          <div id="link1" class="dItem" href="#">Link 1
<!--             Inside Dropdown -->
            <div class="dropdown-two">
              <div class="dItem" id="file" href="#">Import</div>
            </div>
          </div>
          <div class="dItem" href="#">View Stats</div>
          <div class="dItem" href="#">Offers</div>
        </div>
      </div> 
      
      <div class="dropdown">
        <div class="dropbtn">User</div>
<!--         Main Dropdown -->
        <div class="dropdown-one">
          <div class="dItem">Account settings</div>
          <a href = "exit" class="dItem">Exit</a>
        </div>
      </div> 
      
    </div>
    
<!--       ****** Container ****** -->
    <div id="divOne" class="container">
    <%@page import="ars.beans.*"%>
      Hello 
      <%User user = (User)request.getAttribute("data");
      		  out.print(user.getUsername());%>
      
    </div>

</body>
</html>