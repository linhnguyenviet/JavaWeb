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
        <link href="./Style/App.css" type="text/css" rel="stylesheet" />    




    </head>
    <body>
        <div class="App">
            <%@ include file="/Structure/header.jsp" %> 
                   WELCOME LOGIN 
            <a
                href="<%=request.getContextPath()%>/LogoutServlet">Logout
            </a>
            
            <%  
            String a = ( String ) request.getAttribute("sessCustomer");
            out.write(a);
            %>
            <%@ include file="/Structure/footer.jsp" %>
        </div>
        
    </body>
</html>
