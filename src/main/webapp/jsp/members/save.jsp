<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="hello.inflearnspringmvc1corebackend.domain.member.Member" %>
<%@ page import="hello.inflearnspringmvc1corebackend.domain.member.MemberRepository" %>
<%
    //request, response 사용가능
    MemberRepository memberRepository = MemberRepository.getInstance();

    System.out.println("MemberSaveServlet.service");
    final String username = request.getParameter("username");
    final int age = Integer.parseInt(request.getParameter("age"));

    Member member = new Member(username, age);
    memberRepository.save(member);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
성공
<li>id=<%=member.getId()%></li>
<li>username=<%=member.getUsername()%></li>
<li>age=<%=member.getAge()%></li>

<a href="/index.html">메인</a>
</body>
</html>