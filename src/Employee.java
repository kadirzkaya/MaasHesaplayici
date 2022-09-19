public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary,int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    double tax(){
        double tax=salary*0.03;
        return salary>1000?tax:0.0;
    }

    double bonus(){
        double bonus=0.0;
        if (workHours>40){
            bonus=(workHours-40)*30.0;
        }
        return bonus;
    }

    double raiseSalary(){
        short nowYear=2021;
        short workYear=(short) (nowYear-hireYear);
        double raiseSalary;
        if (workYear<10){
            raiseSalary=salary*0.05;
        } else if (workYear<20) {
            raiseSalary=salary*0.1;
        }else {
            raiseSalary=salary*0.15;
        }
        return raiseSalary;
    }

    @Override
    public String toString() {
        return  "Adı : " + name +
                "\nMaaşı : " + salary +
                "\nÇalışma saati : " + workHours +
                "\nBaşlangıç yılı : " + hireYear +
                "\nVergi : " + tax() +
                "\nBonus : " + bonus() +
                "\nMaaş artışı : " + raiseSalary() +
                "\nVergi ve bonuslar ile birlikte maaş : " + (salary +bonus() - tax()) +
                "\nToplam maaş : " + (salary+raiseSalary());
    }
}
