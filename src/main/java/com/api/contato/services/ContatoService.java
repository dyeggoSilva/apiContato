package com.api.contato.services;

import com.api.contato.dto.ContatoDTO;
import com.api.contato.entities.Contato;
import com.api.contato.exception.BlankFieldException;
import com.api.contato.repository.ContatoRepository;
import com.api.contato.services.emailService.EmailAdmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {
    @Autowired
    ContatoRepository contatoRepository;
    @Autowired
    private EmailAdmService emailAdmService;

    public String salvaContato(ContatoDTO data){
        Contato newContato = new Contato();

        if(data.nome().isBlank() == true || data.telefone().isBlank() == true || data.email().isBlank() == true || data.menssagem().isBlank() == true){
            throw new BlankFieldException();
        }

        newContato.setNome(data.nome());
        newContato.setEmail(data.email());
        newContato.setTelefone(data.telefone());
        newContato.setMenssagem(data.menssagem());
        contatoRepository.save(newContato);
        return emailAdmService.enviarEmailCliente(newContato.getEmail(), newContato.getNome());

    }
    public List<Contato> listAll(){
        return contatoRepository.findAll();
    }

}
