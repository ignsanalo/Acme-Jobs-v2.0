<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="administrator.companyrecord.form.label.name" path="name"/>
	<acme:form-textbox code="administrator.companyrecord.form.label.sector" path="sector"/>
	<acme:form-textbox code="administrator.companyrecord.form.label.ceo" path="ceo"/>
	<acme:form-textbox code="administrator.companyrecord.form.label.description" path="description"/>
	<acme:form-url code="administrator.companyrecord.form.label.web" path="web"/>
	<acme:form-textbox code="administrator.companyrecord.form.label.phone" path="phone"/>
	<acme:form-textbox code="administrator.companyrecord.form.label.email" path="email"/>
	<acme:form-integer code="administrator.companyrecord.form.label.stars" path="stars"/>
	
	<acme:form-submit test="${command == 'show'}"
		code="administrator.companyrecord.form.button.update"
		action="/administrator/companyrecord/update"/>
	<acme:form-submit test="${command == 'show'}"
		code="administrator.companyrecord.form.button.delete"
		action="/administrator/companyrecord/delete"/>
	<acme:form-submit test="${command == 'create'}"
		code="administrator.companyrecord.form.button.create"
		action="/administrator/companyrecord/create"/>
	<acme:form-submit test="${command == 'update'}"
		code="administrator.companyrecord.form.button.update"
		action="/administrator/companyrecord/update"/>
	<acme:form-submit test="${command == 'delete'}"
		code="administrator.companyrecord.form.button.delete"
		action="/administrator/companyrecord/delete"/>
	<acme:form-return code="authenticated.companyrecord.form.button.return"/>
	
</acme:form>