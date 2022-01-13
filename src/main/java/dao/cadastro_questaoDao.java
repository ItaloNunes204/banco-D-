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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.questao;
import java.util.List;

/**
 *
 * @author Cliente
 */
public class cadastro_questaoDao {
    public void inserirUsuario(){
         
     }
    public void inserirUsuario(questao a) {
        try {
            String SQL="INSERT INTO italo_nunes.questões (resposta_a,resposta_b,resposta_c,resposta_d,resposta_5,nome_prova,ano_prova,enunciado,numero_questao)VALUES(?,?,?,?,?,?,?,?,?)";
            Connection minhaco=conexao.getConexao();
            PreparedStatement comando=minhaco.prepareStatement(SQL);
            comando.setString(1, a.getResposta_1());
            comando.setString(2, a.getResposta_2());
            comando.setString(3, a.getResposta_3());
            comando.setString(4, a.getResposta_4());
            comando.setString(5, a.getResposta_5());
            comando.setString(6, a.getNome());
            comando.setInt(7, a.getAno());
            comando.setString(8, a.getEnunciado());
            comando.setInt(9, a.getCodigo());
            int retorno=comando.executeUpdate();
            //minhaco.close();
            if(retorno>0){
               JOptionPane.showMessageDialog(null,"questão " + a.getCodigo() + " inserida com sucesso.");
            }else{
                JOptionPane.showMessageDialog(null,"erro no cadastro " + a.getCodigo());
            }
        } catch (SQLException ex) {
            Logger.getLogger(cadastroUsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List <questao> listaDeQuestoes(){
        try {
            String SQL="SELECT resposta_a,resposta_b,resposta_c,resposta_d,resposta_5,nome_prova,ano_prova,enunciado,numero_questao  FROM italo_nunes.questões";
            List <questao>listaDeQuestoes=new ArrayList<questao>();
            Connection c =conexao.getConexao();
            PreparedStatement ps=c.prepareStatement(SQL);
            ResultSet resultado = ps.executeQuery();
            while(resultado.next()){
                questao atual=new questao();
                atual=this.pegaDados(resultado);
                listaDeQuestoes.add(atual);
            }
            
            return listaDeQuestoes;
        } catch (SQLException ex) {
            Logger.getLogger(cadastro_questaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    private questao pegaDados(ResultSet resultado){
        try {
            questao atual=new questao();
            atual.setAno(resultado.getInt("ano_prova"));
            atual.setCodigo(resultado.getInt("numero_questao"));
            atual.setEnunciado(resultado.getString("enunciado"));
            atual.setNome(resultado.getString("nome_prova"));
            atual.setResposta_1(resultado.getString("resposta_a"));
            atual.setResposta_2(resultado.getString("resposta_b"));
            atual.setResposta_3(resultado.getString("resposta_c"));
            atual.setResposta_4(resultado.getString("resposta_d"));
            atual.setResposta_5(resultado.getString("resposta_5"));
            return atual;
        } catch (SQLException ex) {
            Logger.getLogger(cadastro_questaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
