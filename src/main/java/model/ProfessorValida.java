package model;
    //classe para validar o codigo do profess

import java.util.Objects;

public class ProfessorValida {
    private String senheDeValidacao;
    private String Confimacao = "professorTotal";
   
    public ProfessorValida(String senheDeValidacao) {
        this.senheDeValidacao = senheDeValidacao;
    }
    public boolean valida (){
        System.out.println(senheDeValidacao);
        if(this.senheDeValidacao.equals(this.Confimacao) ){
            return true;
        }
          return false;
}

    public String getSenheDeValidacao() {
        return senheDeValidacao;
    }

    public String getConfimacao() {
        return Confimacao;
    } 
}
