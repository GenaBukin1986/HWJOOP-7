package ru.geekbrains.lesson7.observer;

import java.util.ArrayList;
import java.util.Collection;

public class JobAgency implements Publisher {
    private Collection<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(Collection<Vacancy> vacancies) {
        for (Vacancy vacancy : vacancies) {
            for (Observer obsever : observers) {

                obsever.receiveOffer(vacancy);
            }
        }
    }
}
