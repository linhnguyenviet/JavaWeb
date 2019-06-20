<%-- 
    Document   : productPage
    Created on : Jun 15, 2019, 11:25:49 AM
    Author     : HP
--%>

<%@page import="model.Flower"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./Style/product.css" type="text/css" rel="stylesheet" />
        <title>JSP Page</title>
    </head>
    <body>
        <%@ include file="/Structure/header.jsp" %>
        <div class="grid">
        <% 
            ArrayList<Flower> list = new ArrayList<Flower>();
            String index = (String) request.getAttribute("index");
            int indexx = Integer.parseInt(index);
            list = (ArrayList<Flower>) request.getAttribute("list");
            int id = 0+(indexx-1)*9;
            for( Flower b : list) {
                id++;
        %>
        <div class="product">  
            <div class="product__img">
                <img src ="<%=b.getImg()%>" alt="" </p>
            </div>
            <div class="product__name">
                <p> <a href="productDetail?id=<%=id%>"><%=b.getfName()%></a>  </p>
            </div>
            <div class="product__category">
                <p>  <%=b.getCategory()%> </p>
            </div>
            <div class="product__price">
                <p>  <%=Long.toString(b.getPrice())%> </p>
            </div>
        </div>
            <% } %>
        </div>
        <div class="pages">
            <ul>
                <%  
                    
                    int pages = (Integer) request.getAttribute("page");
                    int count = 0;
                    for(int i=0;i<=pages/9;i++) {
                        count++;
                %>
                <li><a href="productPage?index=<%=count%>"> <%out.write(Integer.toString(count));%></a></li>
                 <% } %>
                
            </ul>
        </div>
        <%@ include file="/Structure/footer.jsp" %>
    </body>
</html>
