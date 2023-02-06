package com.cadastro.api.service;

import com.cadastro.api.domain.Usuario;
import com.cadastro.api.exception.UsuarioException;
import com.cadastro.api.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioService{

    private final UsuarioRepository usuarioRepository;

    public Usuario findByIdUsuario(Long id) {
        Optional<Usuario> obj = usuarioRepository.findById(id);
        return obj.orElseThrow(UsuarioException::new);
    }

    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }

    public Usuario exclusaoLogica(Long id){
        Usuario result = findByIdUsuario(id);
        result.setDeletedAt(LocalDateTime.now());
        return usuarioRepository.save(result);
    }

}
