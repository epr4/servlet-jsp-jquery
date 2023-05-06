<%@ page import="java.util.List,model.Student" %>
<html>
<body>
<h2>Welcome</h2>
<table>

<%
List<Student> students = (List<Student>)request.getAttribute("students");
   for (Student student : students) {
//List<String> students = (List<String>)request.getAttribute("students");
//   for (String student : students) {
%>
<tr>
<td><%=student.id%></td>
<td><%=student.mark%></td>
</tr>
<% } %>

</table>

</body>
</html>