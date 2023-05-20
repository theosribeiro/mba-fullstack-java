package br.com.pos.arch.exagonal.adapters.input.web.api.response;

import br.com.pos.arch.exagonal.application.domain.Contact;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactResponse {
    private Long id;
    private String name;
    private String email;

    public static ContactResponse toContactResponse(Contact contactDomain){
        return ContactResponse.builder()
                .id(contactDomain.getId())
                .name(contactDomain.getName())
                .email(contactDomain.getEmail())
                .build();
    }
}
