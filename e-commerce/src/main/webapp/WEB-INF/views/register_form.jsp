<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>User Details Form</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="css/form.css">
</head>
<body>

	<div id="form-container">
		<form id="myForm" method="post" action="${pageContext.request.contextPath }/register_form" >
		<input type="hidden" name="${_csrf.parameterName}"
										value="${_csrf.token }" }/>
			<label for="name">Name:</label> 
			<input type="text" id="name" name="user_name" placeholder="Enter your name" maxlength="20" required>

			<label for="address">Address:</label>
			 <input type="text" id="address" name="user_address" placeholder="Enter your address" required>
			 
			  <label for="dob">Date of Birth:</label> 
			  <input type="date" id="dob" name="user_dob" required> 
			  
			  <label for="username">Username:</label>
			<input type="text" id="username" name="user_username" placeholder="Enter your username" required> 
			
			<label for="email">Email:</label>
			 <input type="email" id="email" name="user_email" placeholder="Enter your email" required> 
			 
			 <label for="password">Password:</label> 
			 <input type="password" id="password" name="user_password" placeholder="Enter your password"required>
			 <span class="show-password" onclick="togglePassword()"><i class="fa fa-eye"></i></span> 
			 
			 <label for="role">Role:</label>
			  <select id="role" name="role" required>
				<option value="user">User</option>
				<option value="admin">Admin</option>
				<option value="admin">Staff</option>
			</select>

			<button id="submit-btn" type="submit">Submit</button>
			<button id="reset-btn" type="reset">Reset</button>
		</form>
	</div>

	<div id="formSubmitted" class="popup">
		<p>Form Submitted!!!!</p>
		<button onclick="closePopup()">OK</button>
	</div>

	<script>
		function togglePassword() {
			const passwordInput = document.getElementById('password');
			passwordInput.type = (passwordInput.type === 'password') ? 'text'
					: 'password';
		}

		function submitForm() {
			const formSubmittedPopup = document.getElementById('formSubmitted');
			formSubmittedPopup.style.display = 'block';
		}

		function closePopup() {
			const formSubmittedPopup = document.getElementById('formSubmitted');
			formSubmittedPopup.style.display = 'none';
			document.getElementById('myForm').reset();
		}
	</script>

</body>
</html>
