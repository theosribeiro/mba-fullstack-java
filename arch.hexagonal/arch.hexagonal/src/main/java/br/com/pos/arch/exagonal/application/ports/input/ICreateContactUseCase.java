package br.com.pos.arch.exagonal.application.ports.input;

import br.com.pos.arch.exagonal.application.domain.Contact;

public interface ICreateContactUseCase {

    Contact execute(Contact contactDomain);
}
