package Servlets;

import Modelo.HospedeDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gabriel Quadrado
 */
@WebServlet("/RemoverDB")
public class RemoverHospedesServlet extends HttpServlet{
    @Override
    protected void service (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        HospedeDAO hd = new HospedeDAO();
        try {
            hd.RemoverHospede(request.getParameter("txtNome"));
        } catch (SQLException ex) {
            Logger.getLogger(RemoverHospedesServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.sendRedirect("index.jsp");
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
          super.init(config);
          log("Iniciando a servlet");
      }

    @Override
      public void destroy() {
          super.destroy();
          log("Destruindo a servlet");
      }
}