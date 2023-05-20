package br.com.pos.arch.exagonal.adapters.output.h2.service;

import br.com.pos.arch.exagonal.adapters.output.h2.entity.ContactEntity;
import br.com.pos.arch.exagonal.adapters.output.h2.repository.ContactRepository;
import br.com.pos.arch.exagonal.application.domain.Contact;
import br.com.pos.arch.exagonal.application.ports.output.IContactRepositoryPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ContactRepositoryService implements IContactRepositoryPort {
    private final ContactRepository contactRepository;

    @Override
    public Contact createContact(Contact contactDomain) {
        var entityToSave = ContactEntity.toContactEntity(contactDomain);
        var entity = contactRepository.save(entityToSave);
        return ContactEntity.toContactDomain(entity);
    }
}
