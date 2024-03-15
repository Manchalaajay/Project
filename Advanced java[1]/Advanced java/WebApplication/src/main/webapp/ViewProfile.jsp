<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
    import="test.*, java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product Information</title>
</head>
<body>
    <%
    WebBean ab = (WebBean) session.getAttribute("abean");
    ArrayList<WebBean> al = (ArrayList<WebBean>) session.getAttribute("alist");
    
    if (al.size() == 0) {
        out.println("No products available...<br>");
    } else {
    %>
        <table border="2">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Age</th>
                    <th>Date of Birth</th>
                </tr>
            </thead>
            <tbody>
                <% Iterator<WebBean> it = al.iterator();
                while (it.hasNext()) {
                    WebBean pb = (WebBean) it.next();
                %>
                    <tr>
                        <td><%= pb.getId() %></td>
                        <td><%= pb.getName() %></td>
                        <td><%= pb.getMail() %></td>
                        <td><%= pb.getAge() %></td>
                        <td><%= pb.getDob() %></td>
                    </tr>
                <% } %>
            </tbody>
        </table>
    <% } %><br><br>

    <%@include file="input.html" %>
</body>
</html>