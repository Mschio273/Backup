package br.com.estudos.multimodulo.service;

import br.com.estudos.multimodulo.Mapper;
import br.com.estudos.multimodulo.dto.ServiceRequestDTO;
import br.com.estudos.multimodulo.dto.ServiceResponseDTO;
import br.com.estudos.multimodulo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class UserFacadeImpl {

    final UserService userService;

    public List<ServiceResponseDTO> findAll() {
        return userService.findAll().stream()
                .map(Mapper.toServiceResponseDTO)
                .collect(Collectors.toList());
    }

    public List<ServiceResponseDTO> findById(Long id) {

        return userService.findById(id).stream()
                .map(Mapper.toServiceResponseDTO)
                .collect(Collectors.toList());
    }

    public ServiceResponseDTO save(ServiceRequestDTO requestDTO) {
        return Mapper.toServiceResponseDTO.apply(
                userService.save(Mapper.toUserSave.apply(requestDTO)));
    }

    public ServiceResponseDTO update(Long id, ServiceRequestDTO requestDTO) {
        return Mapper.toServiceResponseDTO.apply(
                userService.save(
                        Mapper.toUserUpdate.apply(id, requestDTO)));
    }

    public void deleteById(Long id) {
        userService.deleteById(id);
    }
}