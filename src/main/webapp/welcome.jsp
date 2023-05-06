<%@ page import="java.util.List,model.Student" %>
<html>
<body>
<h2>Example</h2>

<h2>Columns</h2>
<ul>

<% List<Student> students = (List<Student>)request.getAttribute("students");
   for (Student student : students) { %>
<li>${student}</li>
<% } %>

</ul>

</c:if>
</body>
</html>