package br.com.acme.application.domain.entity;

import br.com.acme.application.domain.CardDomain;
import br.com.acme.application.ports.out.ICreateClientRepository;
import br.com.acme.application.ports.out.IDeleteClientDomainByIdRepository;
import br.com.acme.application.ports.out.IGetClientDomainGetByIdRepository;
import br.com.acme.application.ports.out.IListClientRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDomain {
    private Long id;
    private String name;
    private String email;
    private String document;
    private String phone;
    private List<CardDomain> cardDomain;

    public ClientDomain save(ICreateClientRepository iCreateClientRepository) {
        return iCreateClientRepository.execute(this);
    }

    public List<ClientDomain> list(IListClientRepository iListClientRepository) {
        return iListClientRepository.execute();
    }

    public ClientDomain getById(IGetClientDomainGetByIdRepository iGetClientDomainGetByIdRepository) { //interace de saida para o banco de dados
        return iGetClientDomainGetByIdRepository.execute(this.id);
    }

    public void deleteClientDomainById(IDeleteClientDomainByIdRepository iDeleteClientDomainByIdRepository) {
        iDeleteClientDomainByIdRepository.execute(this.id);
    }
}
