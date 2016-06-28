package Servlets;
import Modelo.Hospede;
import Modelo.HospedeDAO;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gabriel Quadrado
 */
@WebServlet("/Controle")
public class ControleHospedeServlet extends HttpServlet {
        public void Cadastrar(Hospede h) throws IOException, ClassNotFoundException, SQLException{
            HospedeDAO hd = new HospedeDAO();
            hd.CriarHospede(h);
        }
        public List<Hospede> Exibir() throws IOException, FileNotFoundException, SQLException{
            HospedeDAO hd = new HospedeDAO();
            List<Hospede> allHosp=hd.getLista();
            return allHosp;
        }
        public void Remover(String nome) throws IOException, SQLException{
            HospedeDAO hd = new HospedeDAO();
            hd.RemoverHospede(nome);
        }
        public String Contar() throws IOException, FileNotFoundException, SQLException {
            HospedeDAO hd = new HospedeDAO();
            return hd.getQuantidade();
        }
    }