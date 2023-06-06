package ru.practicum.shareit.booking.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ru.practicum.shareit.booking.model.Status;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class BookingDtoWithoutBooker {
    private int id; //номер бронирования
    private LocalDateTime start; // дата начала аренды
    private LocalDateTime end; // дата окончания аренды
    private int itemId; // id вещи
    private int bookerId; // id пользоавтеля , который осуществляет бронирование
    private Status status = Status.WAITING; //статус,подтверждено ли бронирование владельцем
}
