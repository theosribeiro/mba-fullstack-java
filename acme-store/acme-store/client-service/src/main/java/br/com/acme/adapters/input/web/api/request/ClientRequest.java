package br.com.acme.adapters.input.web.api.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mockito.NotExtensible;

import javax.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ClientRequest {
    @NotNull(message="name is not empty")
    private String name;
    @NotBlank(message = "e-mail is not blank")
    private String email;
    private String document;
    private String phone;
}
