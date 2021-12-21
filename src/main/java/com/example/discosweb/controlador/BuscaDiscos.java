package com.example.discosweb.controlador;

import com.example.discosweb.modelo.GestorConsultas;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "BuscaDiscos", value = "/busca-discos")
public class BuscaDiscos extends HttpServlet {
    private String message;

    public void init() {

        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String elautor=request.getParameter("autor");
        GestorConsultas gc = new GestorConsultas();
        String[] datos=gc.buscaAutor(elautor);
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Discos Poppy</h1>");

        for (int i =0; i<datos.length;i++) {
            out.println("<p>"+datos[i]+"</p><br>");
        }
        out.println(" <a href=\"index.jsp\">Volver a inicio</a>");

        out.println("</body></html>");
    }

    public void destroy() {
    }
}