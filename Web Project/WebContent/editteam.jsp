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
int team_id=Integer.parseInt(request.getParameter("team_id"));
TeamDao td=new TeamDao();
Team t1=td.getTeamById(team_id);
%>
<form action="./UpdateTeamServlet" method="post">
Team Id: <%=t1.getTeam_id() %> <br><br>
Team Name: <input type="text" value="<%=t1.getTeamname()%>" name="Team_Name"><br><br>
Coach Name: <input type="text" value="<%=t1.getOwnername()%>" name="Coach_Name"><br><br>
Owner Name: <input type="text" value="<%=t1.getCoachname()%>" name="Owner_Name"><br><br>

<input type="submit" value="Update Team">

</form>
</body>
</body>
</html>