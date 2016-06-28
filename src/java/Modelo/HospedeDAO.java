package Modelo;

import ConexaoMYSQL.ConexaoMySQL;
import java.awt.HeadlessException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServlet;

/**
 *
 * @author Gabriel Quadrado
 */
public class HospedeDAO extends HttpServlet {

    public HospedeDAO() {
    }
    
    public void CriarHospede(Hospede h) throws IOException{
        ConexaoMySQL banco = new ConexaoMySQL();
        try {
            Connection con = banco.AbrirBDConn();
            String sql = "insert into hospede " +
                    "(id, nome, idade, sexo, status) " +
                    "values (?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, null);
            stmt.setString(2, h.getNome());
            stmt.setString(3, Integer.toString(h.getIdade()));
            stmt.setString(4, h.getSexo());
            stmt.setString(5, h.getStatus());
            boolean res = stmt.execute();
            /*try (Statement stmt = ExConn.createStatement()) {
                String sSQL = "INSERT INTO HOSPEDE VALUES (null, '"
                        +h.getNome()+"',"
                        +Integer.toString(h.getIdade())+",'"
                        +h.getSexo()+"','"
                        +h.getStatus()+"');";
                boolean res = stmt.execute(sSQL);
                JOptionPane.showMessageDialog(null, (!res)?"Dados inseridos com sucesso!":""+
                        "Os dados não puderam ser inseridos");
            }
            banco.FecharBDConn();*/
        } catch (SQLException | HeadlessException e) {
        } finally {banco.FecharBDConn();}
    }
    public List<Hospede> getLista() throws IOException, SQLException{
        List<Hospede> hospedes = new ArrayList<Hospede>();
        ConexaoMySQL banco = new ConexaoMySQL();
        Statement stmt;
        ResultSet rs;
        try (Connection con = banco.AbrirBDConn()) {
            stmt = con.createStatement();
            String sSQL = "SELECT * FROM hospede;";
            rs = stmt.executeQuery(sSQL);
            while(rs.next()){
                Hospede h = new Hospede();
                h.setId(rs.getInt("id"));
                h.setNome(rs.getString("nome"));
                h.setIdade(rs.getInt("idade"));
                h.setSexo(rs.getString("sexo"));
                h.setStatus(rs.getString("status"));
                hospedes.add(h);
            }
            banco.FecharBDConn();
        }
        stmt.close();
        rs.close();
        return hospedes;
}
    public void RemoverHospede(String nome) throws IOException, SQLException{
        ConexaoMySQL banco = new ConexaoMySQL();
        Connection ExConn = banco.AbrirBDConn();
        Statement stmt = ExConn.createStatement();
        String sSQL = "DELETE FROM hospede WHERE nome='"+nome+"';";
        stmt.execute(sSQL);
        banco.FecharBDConn();
    }
    public String getQuantidade() throws IOException, SQLException{
        ConexaoMySQL banco = new ConexaoMySQL();
        Connection ExConn = banco.AbrirBDConn();
        Statement stmt = ExConn.createStatement();
        String sSQL = "SELECT COUNT(*) as qtdd FROM hospede;";
        ResultSet rs = stmt.executeQuery(sSQL);
        rs.next();
        String qtdd = rs.getString("qtdd");
        banco.FecharBDConn();
        return qtdd;
    }
}