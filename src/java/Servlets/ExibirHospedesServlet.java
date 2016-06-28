/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Modelo.Hospede;
import Modelo.HospedeDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
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
@WebServlet("/ExibirDB")
public class ExibirHospedesServlet extends HttpServlet{
    @Override
    protected void service (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
       // PrintWriter out = response.getWriter();
       HttpSession session=request.getSession();
        try {
            List<Hospede> hospedes=(new HospedeDAO()).getLista();
            session.setAttribute("hospedes", hospedes);
         } catch (SQLException ex) {
            Logger.getLogger(ExibirHospedesServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.getRequestDispatcher("Exibir.jsp").forward(request, response);
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
