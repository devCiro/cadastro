package com.cadastro.api.mapper;

import com.cadastro.api.domain.Usuario;
import com.cadastro.api.domain.UsuarioDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

      //      @Mapping(source = "password", target = "senha")

    Usuario entityUsuarioDTO(Long usuarioDto);
    UsuarioDTO entityToUsuarioDTO(Usuario usuario);

}
