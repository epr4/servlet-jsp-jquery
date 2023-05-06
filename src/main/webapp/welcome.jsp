<%@ page import="java.util.List,model.Dep,model.Student" %>
<html>
<body>
<h2>Welcome</h2>
<table border="1">

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
<% if (i==1) { %><td rowspan="<%=dep.getSize()%>"><%=dep.name%></td><% } %>
<td><%=student.id%></td>
<td><%=student.mark%></td>
<% if (i==1) { %><td rowspan="<%=dep.getSize()%>"><%=dep.getPass()%></td><% } %>
</tr>
<% } } %>

</table>

</body>
</html>