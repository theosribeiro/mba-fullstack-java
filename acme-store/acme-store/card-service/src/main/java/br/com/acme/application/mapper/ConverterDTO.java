package br.com.acme.application.mapper;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public final class ConverterDTO<T> {
    private final ModelMapperConfig modelMapperConfig;

    public T convertObject(T object, Class<T> type){
        return modelMapperConfig.modelMapper().map(object, type);
    }
}
