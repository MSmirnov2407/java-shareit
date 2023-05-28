package ru.practicum.shareit.request.dto;

import lombok.Getter;
import lombok.Setter;
import ru.practicum.shareit.item.dto.ItemDto;
import ru.practicum.shareit.user.dto.UserDto;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ItemRequestDtoWithAnswer {
    int id; //id запроса на вещь
    @NotBlank
    String description; //текст запроса
    private UserDto requestor; //пользователь, создавший запрос
    private LocalDateTime created = LocalDateTime.now(); //дата и время сохдания запроса
    List<ItemDto> items = new ArrayList<>(); //список ответов на запрос
}
