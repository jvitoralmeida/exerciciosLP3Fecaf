<html>
<body>
<h2>Hello World!</h2>
<%
out.println("Este c�digo mostra a tabuada do n�mero 7");
for (int i = 1; i <= 10; i++ ) {
%>
<h4> 7 X <%=i%> = <%=(i * 7)%> </h4>
<%
}
%>
</body>
</html>