<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="/WEB-INF/include/headerInclude.jsp"/>

<script type="text/javascript">
	function test() {
		$.ajax({
			url : "/main.ajax",
			type : "POST",
			dataType : "json",
			async : false,
			data : {
				"test1" : 1,
				"test2" : 2,
				"test3" : 3,
				"test4" : 4,
				"test5" : 5
			},
			success : function(data) {
				alert(data.resultCode);				
			}
		});
	};
</script>

<c:forEach items="${detailList}" var="list" varStatus="i">
	${list.no}, ${list.userid}, ${list.siteid}, ${list.userkind}, ${list.cust_no}
</c:forEach>

<button type="button" onclick="test();">asdf</button>

<jsp:include page="/WEB-INF/include/footerInclude.jsp"/>