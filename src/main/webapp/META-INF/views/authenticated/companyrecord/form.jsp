<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form readonly="true">
	<acme:form-textbox code="authenticated.companyrecord.form.label.name" path="name"/>
	<acme:form-textbox code="authenticated.companyrecord.form.label.sector" path="sector"/>
	<acme:form-textbox code="authenticated.companyrecord.form.label.ceo" path="ceo"/>
	<acme:form-textarea code="authenticated.companyrecord.form.label.description" path="description"/>
	<acme:form-url code="authenticated.companyrecord.form.label.web" path="web"/>
	<acme:form-textbox code="authenticated.companyrecord.form.label.phone" path="phone"/>
	<acme:form-textbox code="authenticated.companyrecord.form.label.email" path="email"/>
	<acme:form-integer code="authenticated.companyrecord.form.label.stars" path="stars"/>
	
	
	
	<acme:form-return code="authenticated.companyrecord.form.button.return"/>
</acme:form>