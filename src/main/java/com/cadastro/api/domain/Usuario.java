package com.cadastro.api.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "USUARIO")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID_USUARIO", nullable = false)
    private Long id;

    @Column(name = "NOME")
    @NotNull(message = "{campo.login.obrigatorio}")
    private String nome;

    @Column(name = "EMAIL")
    @NotNull(message = "{campo.email.obrigatorio}")
    private String email;

    @Column(name = "SENHA")
    @NotNull(message = "{campo.senha.obrigatorio}")
    private String senha;

    @Column(name = "VALIDADO_EM")
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    protected LocalDateTime validadoEm;

    @Column(name = "CREATED_AT", updatable = false)
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime createddAt;

   @Column(name = "DELETED_AT")
   @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
   protected LocalDateTime deletedAt;


//    @PrePersist
//    public void prePersist () {
//        setCreateddAt(LocalDateTime.now());
//    }

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "ID_PERFIL", referencedColumnName = "ID_PERFIL")
//    private Perfil idPerfil;

//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return null;
//    }
//
//    @Override
//    public String getPassword() {
//        return this.getSenha();
//    }
//
//    @Override
//    public String getUsername() {
//        return this.getEmail();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }

//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
}
