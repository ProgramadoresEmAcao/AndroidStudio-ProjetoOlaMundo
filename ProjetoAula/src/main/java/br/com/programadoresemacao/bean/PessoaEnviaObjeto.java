package br.com.programadoresemacao.bean;

import java.io.Serializable;

public class PessoaEnviaObjeto implements Serializable{
    private String nome;
    private String telefone;
    private String sexo;

    public PessoaEnviaObjeto(String nome, String telefone, String sexo) {
        this.nome = nome;
        this.telefone = telefone;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getSexo() {
        return sexo;
    }
}
