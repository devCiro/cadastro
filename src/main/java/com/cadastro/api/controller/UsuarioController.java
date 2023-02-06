package com.cadastro.api.controller;

import com.cadastro.api.domain.Usuario;
import com.cadastro.api.mapper.UsuarioMapper;
import com.cadastro.api.service.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Usuario", description = "Controller responsável por registrar um usuário")
@RestController
@RequiredArgsConstructor
@EnableJpaRepositories
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;
    private final UsuarioMapper usuarioMapper;

    @Operation(summary = "Buscar usuário pelo id")
    @GetMapping("/{id}")
    public ResponseEntity<Long> usuarioById(@PathVariable Long id) {
        Usuario usuario = usuarioService.findByIdUsuario(id);
        return ResponseEntity.ok(usuarioMapper.entityToUsuarioDTO(usuario).getId());
    }

//    @Operation(summary = "Listar todos os usuários ativos")
//    @GetMapping("/")
//    public ResponseEntity<List<UsuarioDTO>> listarUsuario(){
//        List<UsuarioDTO> usuarioDTOS = usuarioService.findAll(usuarioMapper::entityToUsuarioDTO);
//        return ResponseEntity.status(HttpStatus.OK).body(usuarioDTOS);
//    }

//    @Operation(summary = "Exclusão lógica do usuário, alterando para inativo e mostrando quando e quem excluiu")
//    @DeleteMapping("/excluir/{id}")
//    public ResponseEntity<UsuarioDTO> deleteLogic(@PathVariable Long id){
//        Usuario result = usuarioService.exclusaoLogica(id);
//        return ResponseEntity.status(HttpStatus.OK).body(usuarioMapper.entityToUsuarioDTO(result));
//    }

//    @PutMapping("validar/{token}")
//    public ResponseEntity<Usuario> validarUsuario(@PathVariable String token){
//        Usuario retorno = usuarioService.validarUsuario(token);
//        return ResponseEntity.ok(retorno);
//    }
}
