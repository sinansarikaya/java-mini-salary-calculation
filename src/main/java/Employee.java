public class Employee {

    String name;
    double salary;
    int workHours, hireYear;

    public Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public static double tax(double salary){
        double tax;
        if(salary >= 1000){
            tax = (salary / 100) * 3;
            return tax;
        } else {
            return 0;
        }
    }

    public static int bonus(int workHours){
        int totalBonus = 0;
        if(workHours > 40){
            totalBonus = (workHours-40) * 30;
        }
        return totalBonus;
    }

    public static double raiseSalary(int hireYear, double salary){
        int thisYear = 2021;
        int yearDifference = thisYear - hireYear;
        double totalRaise;
        if(yearDifference < 10){
            totalRaise = (salary/100) * 5;

        } else if(yearDifference > 9 && yearDifference < 20){
            totalRaise = (salary/100) * 10;
        }else{
            totalRaise = (salary/100) * 15;
        }
        return totalRaise;
    }
    public void count(){
        double taxBonusSalary, totalSalary;
        taxBonusSalary = this.salary - tax(this.salary) + bonus(this.workHours);
        totalSalary = this.salary + raiseSalary(this.hireYear, this.salary);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + taxBonusSalary);
        System.out.println("Toplam Maaş : " + totalSalary);

    }

    public void printEmployee(){

        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax(this.salary));
        System.out.println("Bonus : " + bonus(this.workHours));
        count();


    }


}
