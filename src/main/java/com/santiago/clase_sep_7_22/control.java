package com.santiago.clase_sep_7_22;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author administradorPC
 */
public class control extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet control</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet control at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        //processRequest(request, response);
        String n = request.getParameter("txt_nombres");
        String a = request.getParameter("txt_apellidos");
        String t = request.getParameter("telefono");
        String c = request.getParameter("txt_correo");
        String p = request.getParameter("txt_psw");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>respuesta 1</title>"
                    + "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" \n"
                    + "              rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" \n"
                    + "              crossorigin=\"anonymous\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"container-fluid\">"
                    + "<h1 class=\"text-center\">Bienvenido " + n + " " + a + " a mi página</h1>"
                    + "<h3 class=\"text-center\">Sus datos son:</h3>"
                    + "<div class=\"table-responsive\">"
                    + "<table class=\"table table-hover table-ligth table-striped table-bordered\">"
                    + "<thead>"
                    + "<tr>"
                    + "<th scope=\"col\">#</th>"
                    + "<th scope=\"col\">Nombre</th>"
                    + "<th scope=\"col\">Apellido</th>"
                    + "<th scope=\"col\">Telefono</th>"
                    + "<th scope=\"col\">Correo</th>"
                    + "</tr>"
                    + "</thead>"
                    + "<tbody>"
                    + "<tr>"
                    + "<td>1</td>"
                    + "<td>" + n + "</td>"
                    + "<td>" + a + "</td>"
                    + "<td>" + t + "</td>"
                    + "<td>" + c + "</td>"
                    + "</tr>"
                    + "</tbody>"
                    + "</table>"
                    + "</div>"
                    + "</div>");
            out.println("</body>");
            out.println("</html>");
        }
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
        String n = request.getParameter("txt_nombres");
        String a = request.getParameter("txt_apellidos");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>respuesta 1</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Esta es una respuesta desde el servlet" + request.getContextPath() + "</h1>");
            out.println("<h1>El domicilio llego: " + n + " " + a + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
