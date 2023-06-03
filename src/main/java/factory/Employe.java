package factory;

import java.text.DecimalFormat;


public class Employe {

    String name;
    int age;
    double salary = 0;
    int workHours = 0;
    int hireYear = 0;

    Employe() { };

    Employe(String name, int workHours, int hireYear, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.age = age;
    }
        DecimalFormat df=new DecimalFormat("###,###.00");
    public double tax() {
        double result=0;
        if (salary > 1000) {
            result=(salary*1.03)-salary;
            return result;
        } else {
            return 0;
        }
    }

    public int bonus() {
    int result=0;
        if (workHours > 40) {
           result= workHours-40;
           result*= 30;
            return result;
        }

        return result;
    }

    public double raiseSalary() {

        double result=0;
        result = 2021- hireYear;
        if (result < 10) {
            result = (salary * 1.05)-salary;
            return result;
        } else if (result > 9 && result < 20) {
            result = (salary * 1.10)-salary;
            return result;
        } else if (result > 19) {
            result = (salary * 1.15)-salary;
            return result;
        }
        return result;
    }

    public void ToString() {
        System.out.println("**************************************************************"
                + "\nName                        \t:" + this.name
                + "\nSalary                      \t:" + df.format(this.salary)
                + "\nWork hours                  \t:" + this.workHours
                + "\nThe year of starting work   \t:" + this.hireYear
                + "\nTax                         \t:" + df.format(this.tax())
                + "\nBonus                       \t:" + this.bonus()
                + "\nSalary increase             \t:" + df.format(this.raiseSalary())
                + "\nSalary with taxes and bonus \t:" + df.format(this.raiseSalary()+bonus()-tax())
                + "\nTotal Salary                \t:" + df.format(this.raiseSalary()+bonus()-tax()+salary)
                +"\n**************************************************************");
    }


}