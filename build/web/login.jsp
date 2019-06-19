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

        <%
            Cookie[] cookies=request.getCookies();
            String email = "", password = "",rememberVal="";
            if (cookies != null) {
                 for (Cookie cookie : cookies) {
                   if(cookie.getName().equals("cEmail")) {
                     email = cookie.getValue();
                   }
                   if(cookie.getName().equals("cPass")){
                     password = cookie.getValue();
                   }
                   if(cookie.getName().equals("cRemember")){
                     rememberVal = cookie.getValue();
                   }
                }
            }
        %>
        <form action="LoginServlet" method="post">  
        Email:<input type="text" name="email"><br>  
        Password:<input type="password" name="password"> <br>
        <label>Remember</label> <input type="checkbox" name="remember" value="1"
        />
        <input type="submit" value="login" >  
        </form>
         <%@ include file="/Structure/footer.jsp" %>

    </body>
</html>