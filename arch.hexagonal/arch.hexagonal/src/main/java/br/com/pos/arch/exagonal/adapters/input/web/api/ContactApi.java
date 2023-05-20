package br.com.pos.arch.exagonal.adapters.input.web.api;

import br.com.pos.arch.exagonal.adapters.input.web.api.request.ContactRequest;
import br.com.pos.arch.exagonal.adapters.input.web.api.response.ContactResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/contact")
public interface ContactApi {

    @PostMapping
    public ContactResponse create(@RequestBody ContactRequest request);
}
