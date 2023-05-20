package br.com.pos.arch.exagonal.adapters.output.h2.entity;

import br.com.pos.arch.exagonal.application.domain.Contact;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class ContactEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;

    public static ContactEntity toContactEntity(Contact contactDomain){
        return ContactEntity.builder()
                .name(contactDomain.getName())
                .email(contactDomain.getEmail())
                .build();
    }

    public static Contact toContactDomain(ContactEntity contactEntity){
        return Contact.builder()
                .id(contactEntity.getId())
                .name(contactEntity.getName())
                .email(contactEntity.getEmail())
                .build();
    }
}
