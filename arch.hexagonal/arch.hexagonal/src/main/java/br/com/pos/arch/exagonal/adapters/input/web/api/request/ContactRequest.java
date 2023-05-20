package br.com.pos.arch.exagonal.adapters.input.web.api.request;

import br.com.pos.arch.exagonal.application.domain.Contact;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContactRequest {
    private String nome;
    private String email;

    public Contact toContactDomain(ContactRequest contactRequest){
        return Contact.builder()
                .name(contactRequest.nome)
                .email(contactRequest.email)
                .build();
    }
}
