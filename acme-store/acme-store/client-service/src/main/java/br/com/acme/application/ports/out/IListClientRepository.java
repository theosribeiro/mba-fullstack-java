package br.com.acme.application.ports.out;

import br.com.acme.application.domain.entity.ClientDomain;

import java.util.List;

public interface IListClientRepository {
    List<ClientDomain> execute();
}
