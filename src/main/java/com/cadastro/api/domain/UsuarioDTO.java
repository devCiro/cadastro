package com.cadastro.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {

    private Long id;
    private String nome;
    private String email;
    private LocalDateTime validadoEm;
    private LocalDateTime deletedAt;
}
