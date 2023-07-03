package br.com.acme.adapters.output.database.h2.service;

import br.com.acme.adapters.output.database.h2.entity.Client;
import br.com.acme.adapters.output.database.h2.repository.ClientRepository;
import br.com.acme.application.domain.entity.ClientDomain;
import br.com.acme.application.mapper.ConverterDTO;
import br.com.acme.application.ports.out.IListClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ListClientRepositoryService implements IListClientRepository {
    private final ClientRepository clientRepository;
    private final ConverterDTO converterDTO;

    @Override
    public List<ClientDomain> execute() {
        return (List<ClientDomain>) converterDTO.convertListObject(this.clientRepository.findAll(), ClientDomain.class);
    }
}
