<html>
<body>
<h2>Hello World!</h2>
<%
out.println("Este código mostra a tabuada do número 7");
for (int i = 1; i <= 10; i++ ) {
%>
<h4> 7 X <%=i%> = <%=(i * 7)%> </h4>
<%
}
%>
</body>
</html>