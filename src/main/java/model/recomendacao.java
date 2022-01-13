/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Cliente
 */
public class recomendacao {
    private String link;
    private String comentario;
    private int codigo;

    public recomendacao() {
    }

    public recomendacao(String link, String comentario, int codigo) {
        this.link = link;
        this.comentario = comentario;
        this.codigo = codigo;
    }
    

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
