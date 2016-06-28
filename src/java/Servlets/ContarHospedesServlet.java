package Servlets;

import Modelo.HospedeDAO;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Gabriel Quadrado
 */
@WebServlet("/Contar")
public class ContarHospedesServlet extends HttpServlet{
    @Override
    protected void service (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, FileNotFoundException{
        HttpSession session=request.getSession();
        try {
            String quantidade=(new HospedeDAO()).getQuantidade();
            session.setAttribute("quantidade",quantidade);
        } catch (SQLException ex) {
            Logger.getLogger(ContarHospedesServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.getRequestDispatcher("Quantidade.jsp").forward(request, response);
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
