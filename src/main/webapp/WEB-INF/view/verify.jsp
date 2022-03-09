<%@page import="java.io.PrintWriter"%>
<%@page import="javax.persistence.Query"%>
<%@page import="javax.persistence.EntityTransaction"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@page import="javax.persistence.Persistence"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String email=request.getParameter("emailId");
String pwd = request.getParameter("passWord");
EntityManagerFactory emf = Persistence.createEntityManagerFactory("cricket");
EntityManager e = emf.createEntityManager();
EntityTransaction t = e.getTransaction();
t.begin();
Query createQuery =(Query)e.createQuery("select userName from Players where emailId=:id and passWord=:pwd ");
Query id =createQuery.setParameter("id",email);
Query pass =createQuery.setParameter("pwd",pwd);
PrintWriter p = response.getWriter();
Object c;
 try{
	 c = createQuery.getSingleResult();
 }
 catch(Exception ex){
	 throw new  RuntimeException("invalid");
 }
if(c==null){
	p.println("no");
}
else{
	p.println("forward:/welcome.jsp");
}

%>
</body>
</html>