/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import model.recomendacao;

/**
 *
 * @author Cliente
 */
public class cadastro_recomendacaoDao {

   public void inserirUsuario(){
         
     }
    
    public void inserirUsuario(recomendacao a){
        try {
            String SQL="INSERT INTO italo_nunes.recomendacao (link,comentario,codigo_questao)VALUES(?,?,?)";
            Connection minhaco=conexao.getConexao();
            PreparedStatement comando=minhaco.prepareStatement(SQL);
            comando.setString(1,a.getLink());
            comando.setString(2, a.getComentario());
            comando.setInt(3, a.getCodigo());
            int retorno=comando.executeUpdate();
            minhaco.close();
            if(retorno>0){
               JOptionPane.showMessageDialog(null,"recomendação " + a.getComentario() + " inserida com sucesso.");
            }else{
                JOptionPane.showMessageDialog(null,"erro no cadastro "+a.getComentario());
            }
        } catch (SQLException ex) {
            Logger.getLogger(cadastroUsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List <recomendacao> listaDeRecomendacao(){
        try {
            String SQL="SELECT link,comentario,codigo_questao FROM italo_nunes.recomendacao";
            List<recomendacao>listaDeRecomendacao=new ArrayList<recomendacao>();
            Connection c =conexao.getConexao();
            PreparedStatement ps=c.prepareStatement(SQL);
            ResultSet resultado = ps.executeQuery();
            while(resultado.next()){
                recomendacao atual=new recomendacao();
                atual = this.pegaDados(resultado);
                listaDeRecomendacao.add(atual);
            }
            
            return listaDeRecomendacao;
        } catch (SQLException ex) {
            Logger.getLogger(cadastro_questaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    private recomendacao pegaDados(ResultSet resultado){
        try {
            recomendacao atual=new recomendacao();
            atual.setLink(resultado.getString("link"));
            atual.setCodigo(resultado.getInt("codigo_questao"));
            atual.setComentario(resultado.getString("comentario"));
            return atual;
        } catch (SQLException ex) {
            Logger.getLogger(cadastro_questaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
