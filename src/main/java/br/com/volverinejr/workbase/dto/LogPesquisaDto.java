package br.com.volverinejr.workbase.dto;

import java.io.Serializable;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LogPesquisaDto implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotNull
	private String servico;

	@NotNull
	private String usuario;

	@NotNull
	private String className;

	@NotNull
	private String metodo;

	@NotNull
	private String argumento;

	@NotNull
	private String resultado;
}
