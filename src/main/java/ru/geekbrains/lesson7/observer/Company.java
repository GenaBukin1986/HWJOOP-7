package ru.geekbrains.lesson7.observer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Company {

    private Random random = new Random();
    private String name;
    private Publisher publisher;
    private int maxSalary;
    private Collection<Vacancy> vacancies = new ArrayList<>();

    public Company(String name, Publisher publisher, int maxSalary) {
        this.name = name;
        this.publisher = publisher;
        this.maxSalary = maxSalary;
    }

    public String getName() {
        return name;
    }
    public void addVacancy(String vacancyName){
        int salary = random.nextInt(maxSalary);
        vacancies.add(new Vacancy(name,vacancyName,salary));
    }

    public void needEmployee(){
        publisher.sendOffer(vacancies);

    }

    public void displayVacancy(){
        vacancies.forEach(System.out::println);
    }
}
