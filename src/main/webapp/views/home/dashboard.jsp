<%@include file="../includes/header.jspf"%>
		<div class="content-wrapper">
			<section class="content-header">
				<h1>
					<spring:message code="dashboard" />
				</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
					<li class="active"><spring:message code="dashboard" /></li>
				</ol>
			</section>
			<section class="content">
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
			</section>
		</div>
<%@include file="../includes/footer.jspf"%>
