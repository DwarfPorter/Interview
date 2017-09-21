package ru.geekbrain;

public class Master implements Observer {
    String name;

    public Master(String name){
        this.name = name;
    }

    // Профессионалы выбирают хорошую работу
    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (salary < 80){
            System.out.println(String.format("Master %s: I'm waiting for the better job! (company, salary) = %s, %d", name, nameCompany, salary));
        }
        else{
            System.out.println(String.format("Master %s: Ok. I'm ready for this job! (company, salary) = %s, %d", name, nameCompany, salary));
        }
    }
}
