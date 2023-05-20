package br.com.pos.arch.exagonal.application.ports.output;

import br.com.pos.arch.exagonal.application.domain.Contact;

public interface IContactRepositoryPort {

    Contact createContact(Contact contactDomain);
}
