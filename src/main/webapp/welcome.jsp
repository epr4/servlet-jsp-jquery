<%@ page import="java.util.List,model.Dep,model.Student" %>
<html>
<body>
<h2>Welcome</h2>
<table>

<%
//List<Student> students = (List<Student>)request.getAttribute("students");
//   for (Student student : students) {
List<Dep> deps = (List<Dep>)request.getAttribute("deps");
   for (Dep dep : deps) {
     List<Student> students = dep.getStudents();
     int i=0;
     for (Student student : students) {
       i++;
%>
<tr>
<% if (i==1) { %><td rowspan="4"><%=dep.name%></td><% } %>
<td><%=student.id%></td>
<td><%=student.mark%></td>
</tr>
<% } } %>

</table>

</body>
</html>