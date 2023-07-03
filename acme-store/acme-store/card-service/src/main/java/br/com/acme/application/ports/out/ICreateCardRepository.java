package br.com.acme.application.ports.out;

import br.com.acme.application.domain.CardDomain;

public interface ICreateCardRepository {
    CardDomain execute(CardDomain cardDomain);
}
