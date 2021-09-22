package br.com.estudos.multimodulo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ControllerRequestDTO {
// TODO @NOTBLANK MINSIZE MAXSIZE SIZE
    private String name;
    private String cpf;
    private String login;
    private String password;
}
