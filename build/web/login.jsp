<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="App">
            <%@ include file="/Structure/header.jsp" %>
    <%
    Cookie[] cookies=request.getCookies();
    String email = "", password = "",rememberVal="";
    if (cookies.length != 0) {
         for (Cookie cookie : cookies) {
           if(cookie.getName().equals("cookemail")) {
             email = cookie.getValue();
           }
           if(cookie.getName().equals("cookpass")){
             password = cookie.getValue();
           }
           if(cookie.getName().equals("cookrem")){
             rememberVal = cookie.getValue();
           }
        }
    }
%>

    <fieldset style="width: 600px; margin: auto;">
        <legend>Login</legend>
        <div>
            <%=request.getAttribute("msg") != null ? request.getAttribute("msg") : ""%>
            <form name="loginForm" method="post"
                action="<%=request.getContextPath()%>/LoginServlet">
                <p>
                    <label>Email</label> <input type="text" name="email"
                        autocomplete="off" value="<%=email%>" />
                </p>
                <p>
                    <label>Password</label> <input type="password" name="password"
                        autocomplete="off" value="<%=password%>" />
                </p>
                <p>
                    <label>Remember</label> <input type="checkbox" name="remember"
                        value="1"
                        />
                </p>
                <p>
                    <input type="submit" name="login" value="Login" />
                </p>
            </form>
        </div>
    </fieldset>
        <%@ include file="/Structure/footer.jsp" %>
        </div>
</body>
</html>