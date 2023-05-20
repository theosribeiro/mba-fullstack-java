package br.com.pos.arch.exagonal.application.useCase;

import br.com.pos.arch.exagonal.application.domain.Contact;
import br.com.pos.arch.exagonal.application.ports.input.ICreateContactUseCase;
import br.com.pos.arch.exagonal.application.ports.output.IContactRepositoryPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CreateContactUseCase implements ICreateContactUseCase {


    private final IContactRepositoryPort iContactRepositoryPort;
    public Contact execute(Contact contactDomain) {
        return contactDomain.save(iContactRepositoryPort);
    }
}
