package Servlets;

import Modelo.Hospede;
import Modelo.HospedeDAO;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet("/CadastrarDB")
public class CadastrarHospedeServlet extends HttpServlet {
    @Override
    protected void service (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        PrintWriter out = response.getWriter();
        HospedeDAO hd = new HospedeDAO();
        Hospede h = new Hospede();
        h.setNome(request.getParameter("txtNome"));
        h.setIdade(Integer.parseInt(request.getParameter("txtIdade")));
        h.setSexo(request.getParameter("radSexo"));
        h.setStatus(request.getParameter("cmbStatus"));
        hd.CriarHospede(h);
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