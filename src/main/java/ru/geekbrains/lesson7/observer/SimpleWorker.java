package ru.geekbrains.lesson7.observer;

public class SimpleWorker implements Observer{
    private String jobName = "Разнорабочий";

    private String name;

    private int salary = 50000;

    public SimpleWorker(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (jobName.equals(vacancy.getVacancyName())){
            if(jobName.equals(vacancy.getVacancyName())){
                if (this.salary <= vacancy.getVacancySalary()) {
                    System.out.printf("%s %s: Мне нужна эта работа! (компания: %s; вакансия: %s; зарабоная плата: %d)\n"
                            , jobName, name, vacancy.getCompanyName(), vacancy.getVacancyName(), vacancy.getVacancySalary());
                } else {
                    System.out.printf("%s %s: Я найду работу получше! (компания: %s; вакансия: %s; зарабоная плата: %d)\n"
                            , jobName, name, vacancy.getCompanyName(), vacancy.getVacancyName(), vacancy.getVacancySalary());
                }
            }
        }
    }
}
