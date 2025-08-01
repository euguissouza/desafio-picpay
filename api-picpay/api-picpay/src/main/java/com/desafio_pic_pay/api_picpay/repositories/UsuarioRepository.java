package com.desafio_pic_pay.api_picpay.repositories;

import com.desafio_pic_pay.api_picpay.entities.UsuarioComum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioComum, Long> {
}
