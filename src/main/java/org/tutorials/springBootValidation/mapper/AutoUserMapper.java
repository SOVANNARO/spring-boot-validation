package org.tutorials.springBootValidation.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.tutorials.springBootValidation.dto.UserDto;
import org.tutorials.springBootValidation.entity.User;

@Mapper
public interface AutoUserMapper {
    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);
    UserDto mapToUserDto(User user);
    User mapToUser(UserDto userDto);
}
