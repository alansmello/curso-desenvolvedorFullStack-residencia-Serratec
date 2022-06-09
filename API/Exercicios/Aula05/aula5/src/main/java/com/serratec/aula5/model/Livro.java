package com.serratec.aula5.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Livro")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Size(min=5, max =30)
    private String titulo;

    @NotNull
    @Size(min=3, max =20)
    private String tipo;

    @NotNull
    @Size(min=10, max =40)
    private String autor;

    @Temporal(TemporalType.DATE)
    @Past
    private Date dataPublicacao;



    public Livro() {
    }


    public Livro(String titulo, String tipo, String autor, Date dataPublicacao) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
    }
    
    

    public Integer getId() {
        return this.id;
    }


    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getDataPublicacao() {
        return this.dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }


}
