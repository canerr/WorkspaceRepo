<html>

<head>

<title>This is JSP file</title>

</head>

<body>

	<h1>Welcome to JSP page!</h1>


	<form action="SaveUser" method="get">
		<table>
			<thead>
				<tr>
					<th>Firstname</th>
					<th>Lastname</th>
					<th>Gender</th>
					<th>Salary</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th><input type="text" id="firstName" name="firstName" /></th>

					<th><input type="text" id="lastName" name="lastName" /></th>

					<th><input type="text" id="gender" name="gender" /></th>

					<th><input type="text" id="salary" name="salary" /></th>

				</tr>
			</tbody>
		</table>

		<input type="button" value="Save" id="btnSave" />
	</form>

</body>

</html>