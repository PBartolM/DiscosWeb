package com.example.discosweb.controlador;

import com.example.discosweb.modelo.GestorConsultas;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CompraDiscos", value = "/compra-discos")
public class CompraDisco extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        int eldisco=Integer.parseInt(request.getParameter("disco"));
        GestorConsultas gc = new GestorConsultas();
        String datos=gc.bajaDisco(eldisco);
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Discos Poppy</h1>");
        out.println("<p>"+datos+"</p>");
        out.println(" <a href=\"index.jsp\">Volver a inicio</a>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}