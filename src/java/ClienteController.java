/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Edwing
 */
@WebServlet(urlPatterns = {"/ClienteController"})
public class ClienteController extends HttpServlet {
    ClienteModell alumnos;
    
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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            alumnos= new ClienteModell();
            /*String pass =  request.getParameter("pass");*/
           /* String opcion =  request.getParameter("opcion");*/
            alumnos.setCodigo(request.getParameter("codigo"));
            alumnos.setNombre(request.getParameter("nombre"));
            alumnos.setApellido(request.getParameter("apellido"));
            alumnos.setCorreo(request.getParameter("correo"));
            alumnos.setDireccion(request.getParameter("direccion"));
            alumnos.setCorreo(request.getParameter("telefono"));
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ClienteController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Datos del alumno registrado, gracias por registrarse </h1>");
            out.println("<h2>C??digo del Alumno</h2>");
            out.println("<h2>" + alumnos.getCodigo() + "</h2>");
            out.println("<h2>Nombre/s del Alumno</h2>");
            out.println("<h2>" + alumnos.getNombre() + "</h2>");
            out.println("<h2>Apellidos del Alumno</h2>");
            out.println("<h2>" + alumnos.getApellido()+ "</h2>");
            out.println("<h2>Correo</h2>");
            out.println("<h2>" + alumnos.getCorreo() + "</h2>");
           /* out.println("<h2>Direcci??n</h2>");
            out.println("<h2>" + alumno.getDireccion() + "</h2>");
            out.println("<h2>Tel??fono</h2>");
            out.println("<h2>" + alumno.getTelefono() + "</h2>");*/
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
