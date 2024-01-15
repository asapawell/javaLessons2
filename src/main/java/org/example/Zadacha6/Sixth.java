package org.example.Zadacha6;
// Создать список, из нескольких объектов User и вывести на экран.
// Используя stream и его функции, найти средний и максимальный возраст пользователей. Вывести найденные значения на экран.

import java.util.Optional;
import java.util.stream.Stream;

public class Sixth {
    public static void main(String[] args) {
        //Optional - может быть, а может не быть
        Optional<User> maybeUser = Stream.of(
                        new User(new Name("Pavel"), new Age(27)),
                        new User(new Name("Anton"), new Age(29)),
                        new User(new Name("Alex"), new Age(33)),
                        new User(new Name("Andrey"), new Age(30)),
                        new User(new Name("Vadim"), new Age(21)),
                        new User(new Name("Max"), new Age(29))
                )
                //Получить юзера с максимальным возрастом:
                //Принимается два параметра user, после -> происходит сравнение, если возраст первого юзера больше возраста второго,
                //то (?) возвращаем первого студента : иначе возвращаем второго студента
                .reduce((user1, user2) -> user1.getAge().getAge() > user2.getAge().getAge() ? user1 : user2);

        maybeUser.ifPresent(System.out::println);
    }
}

