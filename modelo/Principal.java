/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author marlo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudante objEstudante01 = new Estudante();
        
        objEstudante01.setNome("Marlon");
        objEstudante01.setRA("123456");
        objEstudante01.setCelular("(14)9 99666-6666");
        objEstudante01.setDisciplina(new ArrayList<String>());
        objEstudante01.setNota(new ArrayList<Integer>());
        objEstudante01.addDisciplinaNotas(objEstudante01.getDisciplina(), objEstudante01.getNota());
        objEstudante01.listarNotasDisciplinas();
        objEstudante01.calcularMediaNotas();
        
        
        Estudante objEstudante02 = new Estudante();
        
        objEstudante02.setNome("Thiago");
        objEstudante02.setRA("654321");
        objEstudante02.setCelular("(14)9 99999-9999");
        objEstudante02.setDisciplina(new ArrayList<String>());
        objEstudante02.setNota(new ArrayList<Integer>());
        objEstudante02.addDisciplinaNotas(objEstudante02.getDisciplina(), objEstudante02.getNota());
        objEstudante02.listarNotasDisciplinas();
        objEstudante02.calcularMediaNotas();
        objEstudante02.setMonitor(new ArrayList<Estudante>());
        objEstudante02.addEstudante(objEstudante01);
        objEstudante02.listarMonitor();
        
        
        
    }
    
}
