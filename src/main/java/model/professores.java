package model;
public class professores{
private String nome;
private String sobrenome;
private String senha;
private String e_mail;
private boolean validacao;

    public professores() {
    
    }

    public professores(String nome, String sobrenome, String senha, String e_mail) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.senha = senha;
        this.e_mail = e_mail;
        this.validacao = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public boolean getValidacao() {
        return validacao;
    }
    public void setValidacao(boolean validacao){
        this.validacao = validacao;
    }
}
