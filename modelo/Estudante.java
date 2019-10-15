/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author marlo
 */
public class Estudante {
    private String nome;
    private String RA;
    private String celular;
    private ArrayList<String> disciplina;
    private ArrayList<Integer> nota;
    private ArrayList<Estudante> monitor;
    

    public Estudante() {
    }

    public Estudante(String nome, String RA, String celular, ArrayList<String> disciplina, ArrayList<Integer> nota) {
        this.nome = nome;
        this.RA = RA;
        this.celular = celular;
        this.disciplina = disciplina;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public ArrayList<String> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(ArrayList<String> disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Integer> getNota() {
        return nota;
    }

    public void setNota(ArrayList<Integer> nota) {
        this.nota = nota;
    }

    public ArrayList<Estudante> getMonitor() {
        return monitor;
    }

    public void setMonitor(ArrayList<Estudante> monitor) {
        this.monitor = monitor;
    }
    
    
    
    void addDisciplinaNotas(ArrayList<String>disciplina, ArrayList<Integer>notas){
        Scanner entrada = new Scanner(System.in);
        String dis;
        int not;
        System.out.println("***** Informe aqui as Disciplinas e Notas do aluno "+this.nome+" *****");
        for(int i = 0; i < 5; i++){
            System.out.println("Informe a "+(i+1)+"º Disciplina: ");
            dis = entrada.next();
            disciplina.add(dis);
            
            System.out.println("Informe a "+(i+1)+"º nota: ");
            not = entrada.nextInt();
            nota.add(not);
            
            System.out.println("\n");
        }
            
    }
    
    void listarNotasDisciplinas(){
        System.out.println("\n***** Lista das Notas das Disciplinas *****");
         for(int j = 0; j < 5; j++){
            System.out.println((j+1)+"º Disciplina: "+disciplina.get(j)+"\n"+(j+1)+"º Nota: "+nota.get(j));
            System.out.println("\n"); 
        }
    }
    
    void calcularMediaNotas(){
        double total =0;
        double calc = 0;
        System.out.println("\n***** Média das Disciplinas *****");
        for(int i = 0; i < 5; i++){
            calc = nota.get(i) + calc;
            total = calc / 5;
        }
        System.out.println("Média do "+ this.nome +" = "+total);
        System.out.println("\n");
    }
    
    void addEstudante(Estudante AddList){
        monitor.add(AddList);
    }
    
    void listarMonitor(){
        System.out.println("\n***** Lista dos Monitores *****");
         for(int j = 0; j < monitor.size(); j++){
            System.out.println(this.nome+" é monitor do(s) estudante(s): "+monitor.get(j).nome);
            System.out.println("\n"); 
        }
    }
}
