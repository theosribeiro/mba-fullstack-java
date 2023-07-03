package br.com.acme.adapters.input.web.api.exception.errors;

public class ClientNotFoundException extends RuntimeException {
    public ClientNotFoundException(Long id) {
        super(String.format("Client with id [%d] not found", id));
    }
}
