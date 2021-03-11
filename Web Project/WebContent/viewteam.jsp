<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import ="java.util.*,com.ltts.WebProject.model.*,com.ltts.WebProject.dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
TeamDao pd=new TeamDao();
List<Team> li=pd.getAllTeam();
%>
<table>
<tr>
<th>Team Id</th>
<th>Team Name</th>
<th>Ownner Name</th>
<th>Coach name</th>
<%
for(Team t:li){
%>
<tr>
<td><%=t.getTeam_id() %></td>
<td><%=t.getTeamname() %></td>
<td><%=t.getOwnername() %></td>
<td><%=t.getCoachname() %></td>

<td><a href="editteam.jsp?id=<%=t.getTeam_id()%>">Update</a></td>
</tr>
<%} %>
</table>
</tr>
</body>
</html>