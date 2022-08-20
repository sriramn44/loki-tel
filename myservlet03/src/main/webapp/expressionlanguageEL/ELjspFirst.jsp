<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 ${param.email} 
 ${header.accept}
 <h6>hi</h6>
 ${header.host}
 <h6>hi</h6>
 ${headerValues.host[0]}
<h6>hi</h6>
 ${paramValues.qualification[0]}
<h6>hi</h6>
 ${cookie.JSESSIONID.name}
 <h6>hi</h6>
 ${cookie.JSESSIONID.value}
 <h6>hi</h6>
 ${initParam.name}
 <h6>hi</h6>
 ${initParam.phone}
 <h6>hi</h6>
 ${pageContext.request.method}
 <h6>hi</h6>
 ${pageContext.session.id}
 <h6>hi</h6>
 ${request.Student.id}
 
 
</body>
</html>