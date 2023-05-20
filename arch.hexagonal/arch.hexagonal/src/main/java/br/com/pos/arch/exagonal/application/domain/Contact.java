package br.com.pos.arch.exagonal.application.domain;

import br.com.pos.arch.exagonal.adapters.input.web.api.response.ContactResponse;
import br.com.pos.arch.exagonal.application.ports.output.IContactRepositoryPort;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Contact {
    private Long id;
    private String name;
    private String email;

    public Contact save(IContactRepositoryPort iContactRepositoryPort){
        return iContactRepositoryPort.createContact(this);
    }
}
