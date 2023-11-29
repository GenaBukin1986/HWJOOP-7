package ru.geekbrains.lesson7.observer;

import java.util.ArrayList;
import java.util.Collection;

public class Program {

    /**
     *  TODO: Доработать приложение, которое разрабатывалось на семинаре,
     *  поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например,
     *  добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {
        Publisher publisher = new JobAgency();

        Company google = new Company("Google",publisher,120000);
        Company yandex = new Company("Yandex",publisher,95000);
        Company geekbrains = new Company("Geekbrains",publisher,98000);

        Observer student1 = new Student("Студент#1");
        Observer simpleworker1 = new SimpleWorker("Разнорабочий#1");
        Observer master1 = new Master("Веб-мастер#1");
        Observer ingineer1 = new Ingineer("Инженер#1");

        publisher.registerObserver(student1);
        publisher.registerObserver(ingineer1);
        publisher.registerObserver(master1);
        publisher.registerObserver(simpleworker1);

        google.addVacancy("Рабочий");
        google.addVacancy("Программист");
        google.addVacancy("Инженер");
        google.displayVacancy();
        System.out.println();

        yandex.addVacancy("Рабочий");
        yandex.addVacancy("Программист");
        yandex.addVacancy("Инженер");
        yandex.displayVacancy();
        System.out.println();

        Collection<Company> companies = new ArrayList<>();
        companies.add(yandex);
        companies.add(google);

        for (Company company:companies){
            company.needEmployee();
        }

    }

}
