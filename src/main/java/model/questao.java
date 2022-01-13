/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
public class questao {
    private String resposta_1;
    private String resposta_2; 
    private String resposta_3; 
    private String resposta_4; 
    private String resposta_5;
    private String nome;
    private String enunciado;
    private int ano;
    private int codigo;

    public questao() {
        this.resposta_1 = "";
        this.resposta_2 = "";
        this.resposta_3 = "";
        this.resposta_4 = "";
        this.resposta_5 = "";
        this.nome = "";
        this.enunciado = "";
        this.ano = 0;
        this.codigo = 0;
    }

    public questao(String resposta_1, String resposta_2, String resposta_3, String resposta_4, String resposta_5, String nome, String enunciado, int ano, int codigo) {
        this.resposta_1 = resposta_1;
        this.resposta_2 = resposta_2;
        this.resposta_3 = resposta_3;
        this.resposta_4 = resposta_4;
        this.resposta_5 = resposta_5;
        this.nome = nome;
        this.enunciado = enunciado;
        this.ano = ano;
        this.codigo = codigo;
    }
    

    public String getResposta_1() {
        return resposta_1;
    }

    public void setResposta_1(String resposta_1) {
        this.resposta_1 = resposta_1;
    }

    public String getResposta_2() {
        return resposta_2;
    }

    public void setResposta_2(String resposta_2) {
        this.resposta_2 = resposta_2;
    }

    public String getResposta_3() {
        return resposta_3;
    }

    public void setResposta_3(String resposta_3) {
        this.resposta_3 = resposta_3;
    }

    public String getResposta_4() {
        return resposta_4;
    }

    public void setResposta_4(String resposta_4) {
        this.resposta_4 = resposta_4;
    }

    public String getResposta_5() {
        return resposta_5;
    }

    public void setResposta_5(String resposta_5) {
        this.resposta_5 = resposta_5;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}
