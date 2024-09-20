package com.api.contato.services;

import com.api.contato.dto.ContatoDTO;
import com.api.contato.entities.Contato;
import com.api.contato.exception.BlankFieldException;
import com.api.contato.repository.ContatoRepository;
import com.api.contato.services.emailService.EmailAdmService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class ContatoServiceTest {
    @InjectMocks
    private ContatoService contatoService;
    @Mock
    private EmailAdmService emailAdmService;
    @Mock
    private ContatoRepository contatoRepository;
    @Test
    @DisplayName("Deve retornar apenas um usuário")
    public void deveRetornarUmaListaDeContatos() {
        Contato contato = new Contato(1,"dyeggo","Dyeggo@mail.com","12345678","test");

        Mockito.when(contatoRepository.findAll()).thenReturn(Collections.singletonList(contato));
        List<Contato> contatos = contatoService.listAll();
        Assertions.assertEquals(1,contatos.size());
    }

    @Test
    @DisplayName("Deve lançar uma exceção quando faltar um dado ")
    public void deveLancarExcecaoQuandoFaltarUmDado(){

        ContatoDTO contato = new ContatoDTO("dyeggo","dyeggo@mail.com","","test");
        Assertions.assertThrows(BlankFieldException.class,() -> contatoService.salvaContato(contato));

    }


}