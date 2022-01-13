package dao;
import conexao.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.usuario;
public class cadastroUsuarioDao {
     public void inserirUsuario(){
         
     }
    public void inserirUsuario(usuario a){
        try {
            String SQL="INSERT INTO italo_nunes.usuário (nome,sobrenome,senha,e_mail)VALUES(?,?,?,?)";
            Connection minhaco=conexao.getConexao();
            PreparedStatement comando=minhaco.prepareStatement(SQL);
            comando.setString(1,a.getNome());
            comando.setString(2, a.getSobrenome());
            comando.setString(3, a.getSenha());
            comando.setString(4, a.getE_mail());
            int retorno=comando.executeUpdate();
            minhaco.close();
            if(retorno>0){
               JOptionPane.showMessageDialog(null,"usuario "+a.getNome()+" inserido com sucesso.");
            }else{
                JOptionPane.showMessageDialog(null,"erro no cadastro "+a.getNome());
            }
        } catch (SQLException ex) {
            Logger.getLogger(cadastroUsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public List <usuario> listaDeUsuarios(){
        try {
            String SQL="SELECT nome,sobrenome,senha,e_mail FROM italo_nunes.usuário";
            List <usuario>listaDeusUario=new ArrayList<usuario>();
            Connection c =conexao.getConexao();
            PreparedStatement ps=c.prepareStatement(SQL);
            ResultSet resultado = ps.executeQuery();
            while(resultado.next()){
                usuario atual = new usuario();
                atual = this.pegaDados(resultado);
                listaDeusUario.add(atual);
            }
            
            return listaDeusUario;
        } catch (SQLException ex) {
            Logger.getLogger(cadastro_questaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    private usuario pegaDados(ResultSet resultado){
        try {
            usuario atual=new usuario();
            atual.setNome(resultado.getString("nome"));
            atual.setSobrenome(resultado.getString("sobrenome"));
            atual.setSenha(resultado.getString("senha"));
            atual.setE_mail(resultado.getString("e_mail"));
            return atual;
        } catch (SQLException ex) {
            Logger.getLogger(cadastro_questaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
