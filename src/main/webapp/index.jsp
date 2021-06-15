<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach items="${schedules}" var="s">
    <p>${s.maCa}</p>
</c:forEach>
