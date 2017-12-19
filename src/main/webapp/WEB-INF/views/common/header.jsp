<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<spring:url value="/resources/css/bootstrap.css"
	var="bootstrapCss" />
<spring:url value="/resources/js/jquery-3.2.1.min.js" var="jqueryUrl"/>
<spring:url value="/resources/js/jquery-migrate.1.4.1.min.js" var="jqueryMigrateUrl"/>
<spring:url value="/resources/js/boostrap.js" var="boostrapJs"/>
<spring:url value="/resources/js/angular.min.js" var="angularUrl"/>

<link href="${bootstrapCss}" rel="stylesheet" />
<script type="text/javascript" src="${jqueryUrl }"></script>
<script type="text/javascript" src="${jqueryMigrateUrl }"></script>
<script type="text/javascript" src="${boostrapJs }"></script>
<script type="text/javascript" src="${angualrUrl }"></script>
<title>Insert title here</title>
</head>
<body>

</body>
</html>