package ru.geekbrain;

public class Main {

    public static void main(String[] args) {
        Observable jobAgency = new JobAgency();
        Company google = new Company(jobAgency, "Google", 50);
        Company geekBrains = new Company(jobAgency, "GeekBrains", 100);
        Student petrov = new Student("Petrov");
        Master ivanov = new Master("Ivanov");
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(ivanov);

        for(int i = 0; i< 10; i++){
            google.needEmpoyee();
            geekBrains.needEmpoyee();
        }
    }
}
