<%@ page import="java.util.List,model.Dep,model.Student" %>
<html>

<head>
  <!-- jQuery cdn link -->
  <script src=
                  "https://code.jquery.com/jquery-3.5.1.min.js">
  </script>

  <style type="text/css">
        th {
          color:white;
        }
		.content {
			position: absolute;
			top: 50%;
			left: 50%;
			transform: translate(-50%, -50%);
			width: 500px;
			height: 200px;
			text-align: center;
			background-color: #e8eae6;
			box-sizing: border-box;
			padding: 10px;
			z-index: 100;
			display: none;
			/*to hide popup initially*/
		}

		.close-btn {
			position: absolute;
			right: 20px;
			top: 15px;
			background-color: black;
			color: white;
			border-radius: 50%;
			padding: 4px;
		}
	</style>
</head>

<body>
<h2>Welcome</h2>
<table border="1">
    <thead bgcolor="blue">
      <th>Department</th>
      <th>Student ID</th>
      <th>Marks</th>
      <th>Pass %</th>
    </thead>

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
<% if (i==1) { %><td rowspan="<%=dep.getSize()%>" align="center"><%=dep.name%></td><% } %>
<td><a onclick="togglePopup('<%=student.name%>')"><u><%=student.id%></u></a></td>
<td align="right"><%=student.mark%></td>
<% if (i==1) { %><td rowspan="<%=dep.getSize()%>" align="center"><%=dep.getPass()%></td><% } %>
</tr>
<% } } %>

</table>

<!-- div containing the popup -->
<div class="content">
  <div onclick="togglePopup()" class="close-btn">X</div>
  <h4>Name</h4>
  <div class="studentName">Popup</div>
</div>

<script type="text/javascript">

		// Function to show and hide the popup
		function togglePopup(name) {
			$('.studentName').html(name);
			$(".content").toggle();
		}
	</script>

</body>
</html>