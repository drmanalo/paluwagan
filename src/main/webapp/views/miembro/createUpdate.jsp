<%@include file="../includes/header.jspf"%>
<div id="page-wrapper">
	<div class="row col-lg-12">
		<h1 class="page-header">
			<spring:message code="new.member" />
		</h1>
	</div>
	<div class="row col-lg-4">
		<form:form modelAttribute="miembro" method="post" action="saveMember">
			<spring:message code="email" var="email" />
			<spring:message code="password" var="password" />
			<spring:message code="firstname" var="firstname" />
			<spring:message code="lastname" var="lastname" />
			<div class="form-group input-group">
				<span class="input-group-addon">@</span>
				<form:input path="username" class="form-control"
					placeholder="${ email }" />
				<form:errors path="username" cssClass="text-danger" />
			</div>
			<div class="form-group input-group">
				<span class="input-group-addon"><i class="fa fa-key"></i></span>
				<form:password path="password" class="form-control"
					placeholder="${ password }" />
				<form:errors path="password" cssClass="text-danger" />
			</div>
			<div class="form-group input-group">
				<span class="input-group-addon"><i class="fa fa-asterisk"></i></span>
				<form:input path="pangalan" class="form-control"
					placeholder="${ firstname }" />
				<form:errors path="pangalan" cssClass="text-danger" />
			</div>
			<div class="form-group input-group">
				<span class="input-group-addon"><i class="fa fa-asterisk"></i></span>
				<form:input path="apelyido" class="form-control"
					placeholder="${ lastname }" />
				<form:errors path="apelyido" cssClass="text-danger" />
			</div>
			<button class="btn btn-warning" type="submit">
				<i class="fa fa-arrow-left"></i> <spring:message code="cancel" />
			</button>
			<button class="btn btn-success" type="submit">
				<spring:message code="submit" /> <i class="fa fa-arrow-right"></i>
			</button>
		</form:form>
	</div>
</div>
<%@include file="../includes/footer.jspf"%>
