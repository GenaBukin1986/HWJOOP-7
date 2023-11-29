package ru.geekbrains.lesson7.observer;

public class Ingineer implements Observer{
    private String jobName = "Инженер";
    private String name;
    private int salary = 90000;



    public Ingineer(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (jobName.equals(vacancy.getVacancyName())) {
            if (salary <= vacancy.getVacancySalary()) {
                System.out.printf("%s %s: Мне нужна эта работа! (компания: %s; вакансия: %s; зарабоная плата: %d)\n"
                        ,jobName, name, vacancy.getCompanyName(), vacancy.getVacancyName(), vacancy.getVacancySalary());

            } else {
                System.out.printf("%s %s: Я найду работу получше! (компания: %s; вакансия: %s; зарабоная плата: %d)\n"
                        ,jobName, name, vacancy.getCompanyName(),vacancy.getVacancyName(), vacancy.getVacancySalary());

            }
        }
    }
}
