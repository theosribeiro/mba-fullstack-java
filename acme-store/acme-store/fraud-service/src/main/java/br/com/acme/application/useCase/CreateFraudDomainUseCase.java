package br.com.acme.application.useCase;

import br.com.acme.application.domain.FraudDomain;
import br.com.acme.application.ports.in.ICreateFraudDomainUseCase;
import br.com.acme.application.ports.out.ICreateFraudDomainRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateFraudDomainUseCase implements ICreateFraudDomainUseCase {

    private final ICreateFraudDomainRepository iCreateClientRepository;
    @Override
    public FraudDomain execute(FraudDomain fraudDomain) {
        return fraudDomain.save(iCreateClientRepository);
    }
}
