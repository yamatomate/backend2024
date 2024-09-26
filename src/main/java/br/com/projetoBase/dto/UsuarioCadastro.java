package br.com.projetoBase.dto;

import br.com.projetoBase.modelo.TipoUsuario;

public record UsuarioCadastro(String nome,
                              int matricula,
                              String pass,
                              TipoUsuario tipoUsuario) {
}
