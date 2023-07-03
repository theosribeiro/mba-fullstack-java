package br.com.acme.application.domain;

import br.com.acme.application.ports.out.ICreateFraudDomainRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FraudDomain {
    private Long id;
    private String document;
    private boolean active = true;
    private LocalDateTime created_at = LocalDateTime.now();
    private LocalDateTime updated_at = null;

    public FraudDomain save(ICreateFraudDomainRepository iCreateFraudDomainRepository) {
        return iCreateFraudDomainRepository.execute(this);
    }
    public FraudDomain checkActive(String document) {
        return null;
    }
    public boolean desableFraud(String document) {
        return false;
    }
}
