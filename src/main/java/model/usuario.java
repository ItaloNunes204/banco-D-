package model;
public class usuario {
private String nome;
private String sobrenome;
private String senha;
private String e_mail;

    public usuario() {
        this.nome = null;
        this.sobrenome = null;
        this.senha = null;
        this.e_mail = null;
    }

    public usuario(String nome, String sobrenome, String senha, String e_mail) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.senha = senha;
        this.e_mail = e_mail;
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
}
