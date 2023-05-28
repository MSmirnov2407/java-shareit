package ru.practicum.shareit.request.dto;

import lombok.Getter;
import lombok.Setter;
import ru.practicum.shareit.user.dto.UserDto;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter
public class ItemRequestDto {
    int id; //id запроса на вещь
    @NotBlank
    String description; //текст запроса
    private UserDto requestor; //пользователь, создавший запрос
    private LocalDateTime created = LocalDateTime.now(); //дата и время сохдания запроса
}
