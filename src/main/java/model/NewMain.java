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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String senha;
        //boolean vv = false;
    ProfessorValida validacao=new ProfessorValida("professorTotal");
     boolean ww = validacao.valida();
    System.out.println(ww);
        for(int i=0;i<1;i++){
         int n=(int) ((Math.random()*5)+1);
        System.out.println(n);
    
    }
    }
}
