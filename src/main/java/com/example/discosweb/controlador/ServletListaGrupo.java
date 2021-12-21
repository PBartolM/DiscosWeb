package com.example.discosweb.controlador;

import com.example.discosweb.modelo.GestorConsultas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletListaGrupo", value = "/ServletListaGrupo")
public class ServletListaGrupo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        GestorConsultas gc = new GestorConsultas();

        String[] autores=gc.listaAutores();

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Discos Poppy</h1>");
        out.println("<ul>");
        for (int i =0; i<autores.length;i++) {
            out.println("<li>"+autores[i]+"</li>");
        }
        out.println("</ul>");
        out.println(" <a href=\"index.jsp\">Volver a inicio</a>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
