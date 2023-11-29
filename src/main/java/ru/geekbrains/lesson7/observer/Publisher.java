package ru.geekbrains.lesson7.observer;

import java.util.Collection;

public interface Publisher {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

    void sendOffer(Collection<Vacancy> vacancies);


}
