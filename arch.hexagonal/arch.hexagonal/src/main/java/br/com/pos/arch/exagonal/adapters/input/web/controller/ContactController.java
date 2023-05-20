package br.com.pos.arch.exagonal.adapters.input.web.controller;

import br.com.pos.arch.exagonal.adapters.input.web.api.ContactApi;
import br.com.pos.arch.exagonal.adapters.input.web.api.request.ContactRequest;
import br.com.pos.arch.exagonal.adapters.input.web.api.response.ContactResponse;
import br.com.pos.arch.exagonal.application.ports.input.ICreateContactUseCase;
import lombok.AllArgsConstructor;

@AllArgsConstructor

public class ContactController implements ContactApi {

    private final ICreateContactUseCase iCreateContactUseCase;

    @Override
    public ContactResponse create(ContactRequest request) {
        var domain = iCreateContactUseCase.execute(request.toContactDomain(request));
        return ContactResponse.toContactResponse(domain);
    }
}
