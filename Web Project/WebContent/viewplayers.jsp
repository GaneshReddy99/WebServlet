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
PlayerDao pd=new PlayerDao();
List<Player> li=pd.getAllPlayers();
%>
<table>
<tr>
<th>Player Id</th>
<th>Player Name</th>
<th>dateOfbirth</th>
<th>Nationality</th>
<th>skills</th>
<th>runs</th>
<th>wickets</th>
<th>Number of Matches</th>
<th>team id</th>
<th></th>
</tr>
<%
for(Player p:li){
%>
<tr>
<td><%=p.getPlayer_id() %></td>
<td><%=p.getName() %></td>
<td><%=p.getDateOfBirth() %></td>
<td><%=p.getNationality() %></td>
<td><%=p.getSkills() %></td>
<td><%=p.getRuns() %></td>
<td><%=p.getWickets() %></td>
<td><%=p.getNumber_of_matches() %></td>
<td><a href="editplayer.jsp?id=<%=p.getPlayer_id()%>">Update</a></td>
</tr>
<%} %>
</table>

</body>
</html>