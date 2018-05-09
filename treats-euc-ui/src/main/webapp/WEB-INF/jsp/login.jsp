<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html lang="en-us" class="login-pf">
<head>
<title>Login - TREAST EUC</title>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!--  for iOS full screen -->
<meta name="apple-mobile-web-app-capable" content="yes">

<link rel="stylesheet" href="https://rawgit.com/patternfly/patternfly/master-dist/dist/css/patternfly.min.css">
<link rel="stylesheet" href="https://rawgit.com/patternfly/patternfly/master-dist/dist/css/patternfly-additions.min.css">
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.12.2/js/bootstrap-select.min.js"></script>
<script src="https://rawgit.com/patternfly/patternfly/master-dist/dist/js/patternfly.min.js"></script>
</head>


<body>
	<div class="login-pf-page">
		<div class="container-fluid">
			<div class="row">
				<div
					class="col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3 col-lg-6 col-lg-offset-3">
					<header class="login-pf-page-header">
						<p> ** Hackathon DEMO ** <br/>
						TREATS EUC Replacement</p>
					</header>
					<div class="row">
						<div
							class="col-sm-10 col-sm-offset-1 col-md-8 col-md-offset-2 col-lg-8 col-lg-offset-2">
							<div class="card-pf">
								<header class="login-pf-header">
									<select class="selectpicker">
										<option>English</option>
										<option>French</option>
										<option>Italian</option>
									</select>
									<h1>Log In to Your Account</h1>
								</header>
								<c:url var="loginUrl" value="/login" />
								<form action="${loginUrl}" method="post">
									<div class="form-group">
										<label class="sr-only" for="exampleInputEmail1">Email
											address</label> <input type="email" class="form-control  input-lg"
											id="userId" name="userId" placeholder="Email address">
									</div>
									<div class="form-group">
										<label class="sr-only" for="exampleInputPassword1">Password
										</label> <input type="password" class="form-control input-lg"
											id="password" name="password" placeholder="Password">
									</div>
									<div class="form-group login-pf-settings">
										<label class="checkbox-label"> <input type="checkbox">
											Keep me logged in for 30 days
										</label> <a href="#">Forgot password?</a>
									</div>
									<button type="submit" class="btn btn-primary btn-block btn-lg">Log
										In</button>
								</form>
								<p class="login-pf-signup">
									Need an account?<a href="#">Sign up</a>
								</p>
							</div>
							<!-- card -->
							<footer class="login-pf-page-footer">
								<ul class="login-pf-page-footer-links list-unstyled">
									<li><a class="login-pf-page-footer-link" href="#">Terms
											of Use</a></li>
									<li><a class="login-pf-page-footer-link" href="#">Help</a></li>
									<li><a class="login-pf-page-footer-link" href="#">Privacy
											Policy</a></li>
								</ul>
							</footer>
						</div>
						<!-- col -->
					</div>
					<!-- row -->
				</div>
				<!-- col -->
			</div>
			<!-- login-pf-page -->
		</div>
		<!--row-->
	</div>
	<!--container-->


</body>
</html>
