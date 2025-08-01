package com.desafio_pic_pay.api_picpay.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuario")
public class UsuarioComum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String nome;

    @Column(unique = true)
    private String email;
    private String senha;

    @Column(unique = true)
    private int cpf;

    public UsuarioComum usuarioComum(){
        return usuarioComum();
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

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
