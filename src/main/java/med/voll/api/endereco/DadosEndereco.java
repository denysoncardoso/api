package med.voll.api.endereco;

import jakarta.validation.constraints.NotBlank;

public record DadosEndereco(
        @NotBlank
        String logradouro,
        @NotBlank
        String bairro,
        @NotBlank
        String uf,
        @NotBlank
        String cep,
        @NotBlank
        String cidade,

        String complemento,
        String numero) {
}
