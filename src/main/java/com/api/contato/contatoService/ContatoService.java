package com.api.contato.contatoService;

import com.api.contato.Dto.ContatoDTO;
import com.api.contato.Entities.Contato;
import com.api.contato.contatoRepository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {
    @Autowired
    ContatoRepository contatoRepository;
    public Contato salvaContato(ContatoDTO data){
        Contato newContato = new Contato();

        newContato.setNome(data.nome());
        newContato.setEmail(data.email());
        newContato.setTelefone(data.telefone());
        newContato.setMenssagem(data.menssagem());

        return contatoRepository.save(newContato);

    }
    public List<Contato> listAll(){
        return contatoRepository.findAll();
    }

}
