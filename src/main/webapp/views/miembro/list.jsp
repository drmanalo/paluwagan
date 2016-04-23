<%@include file="../includes/header.jspf"%>
<div id="page-wrapper">
	<div class="row col-lg-12">
		<h1 class="page-header">
			<spring:message code="members" />
		</h1>
	</div>
	<div class="row">
		<table id="miembros" class="table table-striped">
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
		</table>
	</div>
</div>
<spring:message code="email" var="email" />
<spring:message code="password" var="password" />
<spring:message code="firstname" var="firstname" />
<spring:message code="lastname" var="lastname" />
<spring:message code="modified.date" var="modifiedDate" />
<spring:message code="modified.by" var="modifiedBy" />

<script type="text/javascript">

    var editor;

    $(function() {

        editor = new $.fn.dataTable.Editor( {
                ajax    : "miembroDtoList",
                idSrc   : "id",
                table   : "#miembros",
                fields: [ {
                        label: "${firstname}:",
                        name : "pangalan"
                    }, {
                        label: "${lastname}:",
                        name : "apelyido"
                    }, {
                        label: "Username:",
                        name : "username"
                    }, {
                        label: "Password:",
                        name : "password",
                        type : "password"
                    }, {
                        label: "${modifiedDate}:",
                        name: "modified",
                        type: "datetime"
                    }, {
                        label: "${modifiedBy}:",
                        name: "modifiedBy"
                    }
                ]
            } );

         $('#miembros').on( 'click', 'tbody td:not(:first-child)', function (e) {
                editor.inline( this );
            } );

        $('#miembros').DataTable( {
                dom     : "Bfrtip",
                ajax    : "miembroDtoList",
                columns: [
                    {
                        data: null,
                        defaultContent: '',
                        className: 'select-checkbox',
                        orderable: false
                    },
                    { data: "pangalan" },
                    { data: "apelyido" },
                    { data: "username" },
                    { data: "modified" },
                    { data: "modifiedBy" }
                ],
                select: {
                    style:    'os',
                    selector: 'td:first-child'
                },
                buttons: [
                    { extend: "create", editor: editor },
                    { extend: "edit",   editor: editor },
                    { extend: "remove", editor: editor }
                ]
            } );

    } );
</script>
<%@include file="../includes/footer.jspf"%>