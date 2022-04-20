package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.passport = "4444 № 44444444";
        post.patronymic = "Александрович";
        post.subscription = true;

        FormDate birthday = new FormDate();
        birthday.day = 21;
        birthday.month = 12;
        birthday.year = 1997;
    }
}
