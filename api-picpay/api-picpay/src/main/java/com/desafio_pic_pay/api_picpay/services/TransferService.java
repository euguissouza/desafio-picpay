package com.desafio_pic_pay.api_picpay.services;

import com.desafio_pic_pay.api_picpay.DTO.RequestTransfer;
import com.desafio_pic_pay.api_picpay.entities.Usuario;
import com.desafio_pic_pay.api_picpay.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransferService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Transactional
    public void transfer(RequestTransfer request){
        Usuario from = usuarioRepository.findById(request.getReciverId())
                .orElseThrow(()-> new RuntimeException("Conta nao encontrada"));

        Usuario to = usuarioRepository.findById(request.getPayerId())
                .orElseThrow(() -> new RuntimeException("Conta nao encontrada"));

        if(from.getSaldo() < request.getBalance()){
            throw new RuntimeException("Saldo insuficiente");
        }
        from.setSaldo(from.getSaldo() - request.getBalance());
        to.setSaldo(to.getSaldo() - request.getBalance());

        System.out.println("Batata");
        usuarioRepository.save(from);
        usuarioRepository.save(to);

    }
}
