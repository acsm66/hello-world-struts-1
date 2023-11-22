<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>

<html:html>
<head>
<html:base />
</head>

<body>
  <html:errors />
  <html:form action="/submitCustomerForm">
    <bean:message key="prompt.customer.firstname" />:
      <html:text property="firstName" size="16" maxlength="16" />
    <BR>
    <bean:message key="prompt.customer.lastname" />:
      <html:text property="lastName" size="16" maxlength="16" />
    <BR>
    <html:submit>
      <bean:message key="button.save" />
    </html:submit>
      &nbsp;
      <html:cancel>
      <bean:message key="button.cancel" />
    </html:cancel>
  </html:form>
</body>
</html:html>
