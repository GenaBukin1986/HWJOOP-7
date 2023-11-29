package ru.geekbrains.lesson7.observer;

public class Vacancy {

    private static int count = 0;
    private int id;
    private String vacancyName;
    private int vacancySalary;

    public String getVacancyName() {
        return vacancyName;
    }

    public int getVacancySalary() {
        return vacancySalary;
    }

    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public int getId() {
        return id;
    }

    public Vacancy(String companyName, String vacancyName, int vacancySalary) {
        this.vacancyName = vacancyName;
        this.vacancySalary = vacancySalary;
        this.companyName = companyName;
        id = ++count;
    }

    @Override
    public String toString() {
        return String.format("Вакансия: %d; Тип вакансии: %s; Заработная плата: %d",id,this.vacancyName,this.vacancySalary);
    }
}
