<%@ page language="java"  import="railway.Ticket,railway.Passenger,java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>preview page</title>
<h1>preview</h1>
</head>
<body>
<% Ticket tt=(Ticket)request.getAttribute("tic");
ArrayList<Passenger> p=tt.getTl();
%>
<p>Train name: <%=tt.getTname() %></p>
<p>from :<%=tt.getFrom() %></p>
<p>to :<%=tt.getTo() %></p>
<p>class :<%=tt.getClas() %></p>
<p>passenger details</p>
<table>
<tr>
<th>name</th><th>age</th><th>gender</th>
</tr>
<%for(Passenger pa:p){%>
<tr>
<td><%=pa.getName() %></td>
<td><%=pa.getAge()%></td>
<td><%=pa.getGender()%></td>
</tr>
<%} %>
</table>
<button onclick="confirm()">confirm</button>
<script>
function confirm(){
	var xhr=new XMLHttpRequest();
	xx.open("GET","LastBookSer",true);
	xx.onreadystatechange=function(){
		//console.log(xx.status+" "+xx.readyState);
		if(xhr.status===200 && xhr.readyState===4){
			console.log(xhr.responseText);
		}
	};
	xx.send();
}
</script>





</body>
</html>