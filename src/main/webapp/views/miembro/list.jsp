<%@include file="../includes/header.jspf"%>
<div id="page-wrapper">
	<div class="row col-lg-12">
		<h1 class="page-header">
			<spring:message code="members" />
			<a href="addMember" class="btn btn-primary pull-right"> <spring:message
					code="new.member" /> <i class="glyphicon glyphicon-plus-sign"></i>
			</a>
		</h1>
	</div>
	<div class="row">
		<table class="table table-striped">
			<thead>
				<tr>
					<th></th>
					<th><spring:message code="firstname" /></th>
					<th><spring:message code="lastname" /></th>
					<th><spring:message code="username" /></th>
					<th><spring:message code="modified.date" /></th>
					<th><spring:message code="modified.by" /></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ members }" var="member">
					<tr>
						<td><button class="btn btn-xs btn-circle btn-success"
								title="<spring:message code="edit"/>">
								<i class="fa fa-pencil"></i>
							</button>
							<button class="btn btn-xs btn-circle btn-danger"
								title="<spring:message code="delete"/>">
								<i class="fa fa-trash"></i>
							</button>
						<td>${ member.pangalan }</td>
						<td>${ member.apelyido }</td>
						<td>${ member.username }</td>
						<td>${ member.modifiedBy }</td>
						<td>${ member.dateModified }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>
<%@include file="../includes/footer.jspf"%>