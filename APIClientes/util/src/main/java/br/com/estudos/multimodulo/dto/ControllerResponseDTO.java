package br.com.estudos.multimodulo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ControllerResponseDTO {

    @ApiModelProperty(value = "id", example = "1")
    private Long id;
    private String name;
    private String cpf;
}
