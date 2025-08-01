package com.desafio_pic_pay.api_picpay.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "UsuarioPJ")
public class UsuarioPJ {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String nome;

    @Column(unique = true)
    private String email;
    private String senha;

    @Column(unique = true)
    private int cnpj;

    public UsuarioPJ usuarioPJ(){
        return usuarioPJ();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
}
