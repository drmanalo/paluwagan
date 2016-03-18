<%@include file="../includes/header.jspf"%>
<div id="page-wrapper">
	<div class="row">
		<div class="col-lg-12">
			<h1 class="page-header">
				<spring:message code="dashboard" />
			</h1>
		</div>
	</div>
	<div class="row">
		<div class="col-lg-3 col-md-6">
			<div class="panel panel-yellow">
				<div class="panel-heading">
					<div class="row">
						<div class="col-xs-3">
							<i class="fa fa-calendar fa-5x"></i>
						</div>
						<div class="col-xs-9 text-right">
							<div class="huge">Nov</div>
							<div>
								<spring:message code="new.series" />
							</div>
						</div>
					</div>
				</div>
				<div class="panel-footer">
					<a href="#" class="btn pull-right"><spring:message
							code="view.details" /> <i class="fa fa-arrow-circle-right"></i></a>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
		<div class="col-lg-3 col-md-6">
			<div class="panel panel-green">
				<div class="panel-heading">
					<div class="row">
						<div class="col-xs-3">
							<i class="fa fa-gbp fa-5x"></i>
						</div>
						<div class="col-xs-9 text-right">
							<div class="huge">200</div>
							<div>
								<spring:message code="fund" />
							</div>
						</div>
					</div>
				</div>
				<div class="panel-footer">
					<a href="#" class="btn pull-right"><spring:message
							code="view.details" /> <i class="fa fa-arrow-circle-right"></i></a>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
		<div class="col-lg-3 col-md-6">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<div class="row">
						<div class="col-xs-3">
							<i class="fa fa-user fa-5x"></i>
						</div>
						<div class="col-xs-9 text-right">
							<div class="huge">12</div>
							<div>
								<spring:message code="members" />
							</div>
						</div>
					</div>
				</div>
				<div class="panel-footer">
					<a href="#" class="btn pull-right"><spring:message
							code="view.details" /> <i class="fa fa-arrow-circle-right"></i></a>

					<div class="clearfix"></div>
				</div>
			</div>
		</div>
	</div>
</div>
<%@include file="../includes/footer.jspf"%>
