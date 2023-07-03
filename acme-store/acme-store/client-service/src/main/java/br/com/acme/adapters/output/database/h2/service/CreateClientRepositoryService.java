package br.com.acme.adapters.output.database.h2.service;

import br.com.acme.adapters.output.database.h2.entity.Client;
import br.com.acme.adapters.output.database.h2.repository.ClientRepository;
import br.com.acme.application.domain.entity.ClientDomain;
import br.com.acme.application.mapper.ConverterDTO;
import br.com.acme.application.ports.out.ICreateClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateClientRepositoryService implements ICreateClientRepository {

    private final ClientRepository clientRepository;
    private final ConverterDTO converterDTO;

    @Override
    public ClientDomain execute(ClientDomain clientDomain) {

//        var entitySave = Client.builder()
//                .nome(clientDomain.getNome())
//                .email(clientDomain.getEmail())
//                .document(clientDomain.getDocument())
//                .phone(clientDomain.getPhone())
//                .build();
//        var entity = clientRepository.save(entitySave);
//        var domain = ClientDomain.builder()
//                .id(entity.getId())
//                .nome(entity.getNome())
//                .email(entity.getEmail())
//                .document(entity.getDocument())
//                .build();

        var entity = (Client) converterDTO.convertObject(clientDomain, Client.class); //salvar
        var domain = (ClientDomain) converterDTO.convertObject(this.clientRepository.save(entity), ClientDomain.class); //retornar

        return domain;

    }
}
