package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Message;
import com.mycompany.myapp.service.dto.MessageDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Message} and its DTO {@link MessageDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface MessageMapper extends EntityMapper<MessageDTO, Message> {
    @Mapping(target = "previousMessage", source = "previousMessage", qualifiedByName = "id")
    MessageDTO toDto(Message s);

    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    MessageDTO toDtoId(Message message);
}
