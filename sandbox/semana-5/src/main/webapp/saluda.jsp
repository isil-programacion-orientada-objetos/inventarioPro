<!DOCTYPE html>
<html>
    <head>
        <title>Bienvenido querido profesor</title>
    </head>

    <%
        String nombre = request.getParameter("nombre");

        if( nombre== null || nombre.trim().equals("")){
            nombre = "Invitado";
        }
    %>

    <h2>Hola querido profesor: <%= nombre %> !Bienvenido a tu primera pagina en JSP. </h2>
    <a href="index.jsp">Volver </a>
</html>