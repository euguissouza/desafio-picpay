package com.desafio_pic_pay.api_picpay.repositories;

import com.desafio_pic_pay.api_picpay.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
