package dao;
import conexao.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.professores;
import java.util.List;

public class cadastroProfessorDao {

    public void inserirProfessor(){
        
    } 
    public void inserirProfessor(professores pro){
            try {
            String SQL="INSERT INTO italo_nunes.professor (nome,sobrenome,senha,e_mail,validacao)VALUES(?,?,?,?,?)";
            Connection minhacone=conexao.getConexao();
            PreparedStatement comando = minhacone.prepareStatement(SQL);
            comando.setString(1, pro.getNome());
            comando.setString(2, pro.getSobrenome());
            comando.setString(3, pro.getSenha());
            comando.setString(4, pro.getE_mail());
            comando.setBoolean(5,true);
            int retorno = comando.executeUpdate();
            minhacone.close();
            if(retorno>0){
               JOptionPane.showMessageDialog(null,"professor "+pro.getNome()+" inserido com sucesso.");
            }else{
                JOptionPane.showMessageDialog(null,"erro no cadastro "+pro.getNome());
            }
        } catch (SQLException ex) {
            Logger.getLogger(cadastroUsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List <professores> listaDeprofessores(){
        try {
            String SQL="SELECT nome,sobrenome,senha,e_mail,validacao FROM italo_nunes.professor";
            List <professores>listaDeProfessores=new ArrayList<professores>();
            Connection c =conexao.getConexao();
            PreparedStatement ps=c.prepareStatement(SQL);
            ResultSet resultado = ps.executeQuery();
            while(resultado.next()){
                professores atual = new professores();
                atual = this.pegaDados(resultado);
                listaDeProfessores.add(atual);
            }
            
            return listaDeProfessores;
        } catch (SQLException ex) {
            Logger.getLogger(cadastro_questaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    private professores pegaDados(ResultSet resultado){
        try {
            professores atual=new professores();
            atual.setNome(resultado.getString("nome"));
            atual.setSobrenome(resultado.getString("sobrenome"));
            atual.setSenha(resultado.getString("senha"));
            atual.setE_mail(resultado.getString("e_mail"));
            atual.setValidacao(resultado.getBoolean("validacao"));
            return atual;
        } catch (SQLException ex) {
            Logger.getLogger(cadastro_questaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
