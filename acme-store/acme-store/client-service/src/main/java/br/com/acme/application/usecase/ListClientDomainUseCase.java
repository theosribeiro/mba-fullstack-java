package br.com.acme.application.usecase;

import br.com.acme.application.domain.entity.ClientDomain;
import br.com.acme.application.ports.in.IListClientDomainUseCase;
import br.com.acme.application.ports.out.ICreateClientRepository;
import br.com.acme.application.ports.out.IListClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ListClientDomainUseCase implements IListClientDomainUseCase { //recebe dados de entrada do IListClientDomainUseCase
    private final IListClientRepository iListClientRepository;

    @Override
    public List<ClientDomain> execute() {
        return ClientDomain.builder().build().list(iListClientRepository);
    }
}
