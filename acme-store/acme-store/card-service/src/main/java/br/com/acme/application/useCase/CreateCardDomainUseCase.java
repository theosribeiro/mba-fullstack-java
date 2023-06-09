package br.com.acme.application.useCase;

import br.com.acme.application.domain.CardDomain;
import br.com.acme.application.ports.in.ICreateCardDomainUseCase;
import br.com.acme.application.ports.out.ICreateCardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateCardDomainUseCase implements ICreateCardDomainUseCase {
    private final ICreateCardRepository iCreateCardRepository;

    @Override
    public CardDomain execute(CardDomain cardDomain) {
        return cardDomain.save(iCreateCardRepository);
    }
}
