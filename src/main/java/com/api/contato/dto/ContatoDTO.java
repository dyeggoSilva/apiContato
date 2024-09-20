package com.api.contato.dto;

import jakarta.validation.constraints.NotBlank;

public record ContatoDTO(@NotBlank String nome,  @NotBlank String email, @NotBlank String telefone, @NotBlank String menssagem) {
}
