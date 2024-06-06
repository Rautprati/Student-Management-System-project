<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<style type="text/css">
.card-registration .select-input.form-control[readonly]:not([disabled])
	{
	font-size: 1rem;
	line-height: 2.15;
	padding-left: .75em;
	padding-right: .75em;
}

.card-registration .select-arrow {
	top: 13px;
}
</style>
</head>
<body>
	<section class="h-100 bg-dark">
		<div class="container py-5 h-100">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col">
					<div class="card card-registration my-4">
						<div class="row g-0">
							<div class="col-xl-6 d-none d-xl-block">
								<img
									src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/img4.webp"
									alt="Sample photo" class="img-fluid"
									style="border-top-left-radius: .25rem; border-bottom-left-radius: .25rem;" />
							</div>
							<div class="col-xl-6">
								<div class="card-body p-md-5 text-black">
									<h3 class="mb-5 text-uppercase">Student registration form</h3>
									<form action="register_student">
										<div class="row">
											<div class="form-outline mb-4">
												<input type="text" id="form3Example8"
													class="form-control form-control-lg" name="studentFullName" />
												<label class="form-label" for="form3Example8">Full
													Name</label>
											</div>

										</div>
										<div class="form-outline mb-4">
											<input type="text" id="form3Example8"
												class="form-control form-control-lg" name="studentAddress" />
											<label class="form-label" for="form3Example8">Address</label>
										</div>

										<div class="form-outline mb-4">
											<input type="text" id="form3Example97"
												class="form-control form-control-lg" name="studentEmailId" />
											<label class="form-label" for="form3Example97">Email
												ID</label>
										</div>

										<div
											class="d-md-flex justify-content-start align-items-center mb-4 py-2">

											<h6 class="mb-0 me-4">Gender:</h6>

											<div class="form-check form-check-inline mb-0 me-4">
												<input class="form-check-input" type="radio"
													id="femaleGender" value="female" name="studentGender" /> <label
													class="form-check-label" for="femaleGender">Female</label>
											</div>

											<div class="form-check form-check-inline mb-0 me-4">
												<input class="form-check-input" type="radio" id="maleGender"
													value="male" name="studentGender" /> <label
													class="form-check-label" for="maleGender">Male</label>
											</div>

											<div class="form-check form-check-inline mb-0">
												<input class="form-check-input" type="radio"
													id="otherGender" value="option3" name="studentGender" /> <label
													class="form-check-label" for="otherGender">Other</label>
											</div>

										</div>

										<div class="row">
											<div class="col-md-6 mb-4">
												<div class="row">

													<div class="col">
														<select class="select form-control-sm" name="studentBatchNumber">
															<option value="#" disabled>Select Batch Number</option>
															<option value="FDJ-160">FDJ-160</option>
															<option value="REG-160">REG-160</option>
															<option value="FDJ-161">FDJ-161</option>
															<option value="REG-161">REG-162</option>
															<option value="FDJ-162">FDJ-162</option>
															<option value="REG-162">REG-162</option>
															<option value="FDJ-163">FDJ-163</option>
															<option value="REG-163">REG-163</option>
															<option value="FDJ-164">FDJ-164</option>
															<option value="REG-164">REG-164</option>
															<option value="FDJ-165">FDJ-165</option>
															<option value="REG-165">REG-165</option>
														</select> <label class="form-label select-label">Batch
															Number</label>
													</div>
												</div>
											</div>
											<div class="col-md-6 mb-4">
												<div class="col">
													<select class="select form-control-sm" name="studentBatchMode">
														<option value="#" disabled>Select Batch Mode</option>
														<option value="Online">Online</option>
														<option value="Offline">Offline</option>

													</select> <label class="form-label select-label">Batch Mode</label>
												</div>
											</div>
										</div>


										<div class="form-outline mb-4">
											<input type="text" id="form3Example99"
												class="form-control form-control-lg" name="studentCourse" />
											<label class="form-label" for="form3Example99">Course</label>
										</div>
										
										<div class="form-outline mb-4">
											<input type="text" id="form3Example99"
												class="form-control form-control-lg" name="studentFeesPaid" />
											<label class="form-label" for="form3Example99">Fees Paid</label>
										</div>

										<div class="d-flex justify-content-end pt-3">
											<a href="reset_reg">
												<button type="button" class="btn btn-light btn-lg">Reset
													all</button>
											</a>
											<button type="submit" class="btn btn-warning btn-lg ms-2">Submit
												form</button>
										</div>
									</form>
								</div>
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

</body>
</html>