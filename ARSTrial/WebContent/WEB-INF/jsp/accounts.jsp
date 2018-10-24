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

html, body {
	font-size: 20px;
    height: 100%;
    background-color: grey;
}
.outer-container {
    display: table;
    width: 100%;
    height: 100%;
    margin: 0 auto;
  border: none;
    outline: none;
}

.inner-container {
    display: table-cell;
    vertical-align: middle;
    text-align: center;
}

.centered-content {
    display: inline-block;
    text-align: center;
     background-color: #f9f9f9;
    padding: 5px;
    border-radius: 10px;
    box-shadow: 5px 5px 5px 0px grey;
   
}

.button2 {
    background-color: white;
    color: black;
    border: 2px solid #4CAF50; /* Green */
}

.button {
    -webkit-transition-duration: 0.4s; /* Safari */
    transition-duration: 0.4s;
    box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);
    background-color: red;
    color: white;
    border-radius: 8px;
}

.button:hover {
    background-color: #4CAF50; /* Green */
    color: white;
}

.button1 {
  display: inline-block;
  border-radius: 4px;
  background-color: red;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 15px;
  padding: 5px;
  width: 100px;
  transition: all 0.5s;
  cursor: pointer;
  margin: 5px;
}

.button1 span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.button1 span:after {
  content: '\00bb';
  position: absolute;
  opacity: 0;
  top: 0;
  right: -8px;
  transition: 0.5s;
}

.button1:hover span {
  padding-right: 5px;
}

.button1:hover span:after {
  opacity: 1;
  right: 0;
}

.txtbx {
 font-family: Arial, Helvetica, sans-serif;
  font-size: 20px;
  text-align:center;
	 border: none;
	 width: 80%;
    background: transparent;
    border-bottom: 2px solid grey;
}

.imgstyle { 
width: 150px; 
height: 150px;
 box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
border-radius: 80px; 
margin-bottom: 5px;
margin-top: 10px;
}
</style>

<div class="outer-container">
   <div class="inner-container">
     <div class="centered-content">

<c:if test="${message=='exists'}">
        <p>SORRY!</p>
    </c:if>
 <%@page import="ars.models.*"%>
<script type="text/javascript">
					function makeDate()
					{
						var yy = document.getElementsByName("yyyy")[0].value;
						var mm = document.getElementsByName("mm")[0].value;
						var dd = document.getElementsByName("dd")[0].value;
						document.getElementsByName('expiryDate')[0].value = yy+"-"+mm+"-"+dd+" 00:00:00.000";
					}
</script>
<form:form method="POST" action="accounts">

             <table>
                <tr>
                	<td>Bank : </td>
                	 <td> 
                	 <form:radiobutton path="bank" value="IOB" label="IOB" /> 
            		 <form:radiobutton path="bank" value="SBI" label="SBI" />
            		 </td>
                </tr>
                
                <tr>
                   <td>NetBanking ID No. : </td>
                    <td><form:input path="netID"/></td>
                </tr>
                
                <tr>
                   <td>Netbanking Password : </td>
                    <td><form:input path="netPass"/></td>
                </tr>
                <tr>
                	<td>Payment Platform : </td>
                	 <td> 
                	 <form:radiobutton path="paymentPlatform" value="Visa" label="Visa" /> 
            		 <form:radiobutton path="paymentPlatform" value="Rupay" label="Rupay" />
      
                	</td>
                </tr>
                
                 <tr>
                	<td>Card Type : </td>
                	 <td> 
                	 <form:radiobutton path="cardType" value="Debit" label="Debit" /> 
            		 <form:radiobutton path="cardType" value="Credit" label="Credit" />
      				</td>
                </tr>
                
                <tr>
                   <td>Card No : </td>
                    <td><form:input path="cardNo"/></td>
                </tr>
                <tr>
                   <td>CVV : </td>
                    <td><form:input path="cvv"/></td>
                </tr>
               
                <tr>
                <td>Card Expiry Date : </td>
                	<td><input type="text" name="yyyy" maxlength ="4"/>
                	/<input type="text" name="mm" maxlength ="2"/>
                	/<input type="text" name="dd" maxlength ="2"/></td>
                	<td><input type = "hidden" name ="expiryDate"/></td>
                </tr>
                <td><form:hidden  path="userLinkID" /></td>
                <tr>
                   <td>Current Balance : </td>
                    <td><form:input path="balance"/></td>
                </tr> 
                 <tr>
                    <td></td>
                    <td align ="left"><input type="submit" value="Create" class="button1" onclick="makeDate();"/></td>
                </tr>
                
            </table>
        </form:form>

</div>
   </div>
</div>
</body>
</html>