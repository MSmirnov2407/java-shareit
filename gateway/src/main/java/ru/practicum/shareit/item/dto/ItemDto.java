package ru.practicum.shareit.item.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import ru.practicum.shareit.user.dto.UserDto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ItemDto {

    private int id; //id вещи
    private UserDto owner; //владелец вещи
    @NotBlank
    private String name; //наименование
    @NotBlank
    private String description; //описание
    @NotNull
    @JsonProperty("available")
    private Boolean isAvailable; //доступность вещи для аренды
    private int requestId; //запрос, по которому была создана вещь
}
