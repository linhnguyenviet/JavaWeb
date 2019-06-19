<%@page import="dao.FlowerDAO"%>
<%@page import="model.Flower"%>
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
            Flower flower = new Flower();
            FlowerDAO f = new FlowerDAO();
            flower = f.getFlowerDetail(request.getParameter("id"));
       %>
       <div>
           <div>
               <img src="<%=flower.getImg()%>">
           </div>
           <div>
               <p><%=flower.getfName()%></p>
           </div>
           <div>
               <p><%=flower.getPrice()%></p>
           </div>
           <div>
               <p><%=flower.getCategory()%></p>
           </div>
           <div>
               <p>Lorem Ipsum is simply dummy text of the printing and typesetting 
                   industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,
                   when an unknown printer took a galley of type and scrambled it to make a type specimen
                   book.</p>
           </div>
           <div>
               <button>Mua ngay</button>
               <button>Thêm vào giỏ hàng</button>
           </div>
           <div>
               <div><p>Số lượng</p></div>
               <div>
                   <button>-</button>
                   <input type="text">
                   <button>+</button>
               </div>
           </div>
       </div>
         <%@ include file="/Structure/footer.jsp" %>

    </body>
</html>