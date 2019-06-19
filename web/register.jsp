<%-- 
    Document   : index
    Created on : Jun 13, 2019, 12:49:11 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="manifest" href="%PUBLIC_URL%/manifest.json" />
        <link rel="stylesheet" href="%PUBLIC_URL%/reset.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
        <link href="./Style/NavBar.css" type="text/css" rel="stylesheet" /><!--
-->     <link href="./Style/HeaderImg.css" type="text/css" rel="stylesheet" /><!--
-->     <link href="./Style/TopHeader.css" type="text/css" rel="stylesheet" /><!--
-->     <link href="./Style/App.css" type="text/css" rel="stylesheet" /><!--
-->     <link href="./Style/BottomFooter.css" type="text/css" rel="stylesheet" /><!--<!--
-->     <link href="./Style/TopFooter.css" type="text/css" rel="stylesheet" /><!--
                                                                         
-->
    
    </head>
    
    <body>
        <%@ include file="/Structure/header.jsp" %>
       <h1>Register Form</h1>
        <form action="register" method="post">
            <table style="with: 50%">
                    <tr>
                            <td>Name</td>
                            <td><input type="text" name="name" /></td>
                    </tr>
                    <tr>
                            <td>Email</td>
                            <td><input type="email" name="email"/></td>
                    </tr>
                    <tr>
                            <td>Password</td>
                            <td><input type="password" name="password" /></td>
                    </tr>
                    <tr>
                            <td>Confirm Password</td>
                            <td><input type="password" name="cpassword" /></td>
                    </tr>
                    <tr>
                            <td>Address</td>
                            <td><input type="text" name="address" /></td>
                    </tr>
                    <tr>
                            <td>Contact No</td>
                            <td><input type="text" name="contact" /></td>
                    </tr></table>
            <input type="submit" value="Submit" /></form>
    <%@ include file="/Structure/footer.jsp" %>

    </body>
</html>