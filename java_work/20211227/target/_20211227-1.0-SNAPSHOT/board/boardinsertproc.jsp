<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.Board.BoardDao" %>
<%@ page import="com.example.Board.BoardDto" %>
<%@ page import="java.util.List" %>

<jsp:useBean id="dto" class="com.example.Board.BoardDto"></jsp:useBean>
<jsp:setProperty name="dto" property="*"></jsp:setProperty>
<%
    //    BoardDto dto = new BoardDto();
//    dto.setContent(request.getParameter("content"));
//    dto.setTitle(request.getParameter("title"));
//    dto.setName(request.getParameter("name"));

    BoardDao bd = new BoardDao();
    String ret = bd.insert(dto);
%>
<%=ret%>
