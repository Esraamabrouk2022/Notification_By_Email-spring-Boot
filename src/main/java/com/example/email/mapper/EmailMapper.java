package com.example.email.mapper;

import com.example.email.model.EmailModel;
import com.example.email.entity.Email;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EmailMapper {
      EmailMapper INSTANCE = Mappers.getMapper(EmailMapper.class);

      Email requestToEntity(EmailModel emailModel) ;
}
