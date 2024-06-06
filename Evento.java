/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Felipe Atamanczuk
 */
public class Evento {
    
    private int codigo;
    private String nome;
    private String descricao;
    private Date dataInicio;
    private Date dataFim;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    
}
    
public void setNome(String nome) {
        this.nome = nome;
 }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }
    
    
    
    @Override //Annotation: Java 5+
    public String toString(){
        var sdf = new SimpleDateFormat("dd/MM/yy");
        return String.format(
            "Nome: %s, Descrição: %s, Data Início: %s",
            nome, descricao, sdf.format(dataInicio)
        );
    }

}