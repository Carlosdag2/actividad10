/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.empresa.mavenj2ee;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Campus FP
 */
public class ServletInfo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String busqueda = request.getParameter("busqueda");

        out.println("<html><head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        out.println("<title>Información - MavenJ2EE</title>");
        out.println("<link href=\"https://stackpath.bootstrapcdn.com/bootstrap/5.3.3/css/bootstrap.min.css\" rel=\"stylesheet\">");
        out.println("</head><body>");

        if ("roma".equalsIgnoreCase(busqueda)) {
            out.println("<div class=\"container\">");
        out.println("<h1 class=\"mt-3\">Información sobre Roma</h1>");
        out.println("<p>Roma es la capital de Italia y una de las ciudades más antiguas y fascinantes del mundo.</p>");
        out.println("<p>Es famosa por sus impresionantes monumentos históricos como el Coliseo, el Foro Romano y el Panteón.</p>");
        out.println("<p>Roma también es conocida por su rica cultura, arte y gastronomía.</p>");
        out.println("</div>");
        } else if ("grecia".equalsIgnoreCase(busqueda)) {
            out.println("<div class=\"container\">");
        out.println("<h1 class=\"mt-3\">Información sobre Grecia</h1>");
        out.println("<p>Grecia es un país ubicado en el sureste de Europa, conocido por su importancia histórica y cultural.</p>");
        out.println("<p>Es la cuna de la civilización occidental y hogar de antiguas ciudades como Atenas, Esparta y Corinto.</p>");
        out.println("<p>Grecia es famosa por sus impresionantes paisajes, playas, islas y su rica herencia arquitectónica y artística.</p>");
        out.println("</div>");
        } else {
            out.println("<div class=\"container\">");
            out.println("<div class=\"alert alert-danger\" role=\"alert\">");
            out.println("<h4 class=\"alert-heading\">¡Oops!</h4>");
            out.println("<p class=\"mb-0\">No se encontró información para la búsqueda: " + busqueda + "</p>");
            out.println("</div>");
            out.println("</div>");
        }

        out.println("</body></html>");
    }

    } // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
