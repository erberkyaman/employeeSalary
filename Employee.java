public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        double taxAmount;
        if(this.salary>=0 && this.salary<=1000){
            return 0;
        } else if (this.salary>1000) {
            return taxAmount = salary *0.03;
        }else {
            System.out.print("Maaş tutarı hatalı girilmiştir!");
            return 0;
        }
    }
    public double bonus(){
        double bonusAmount;
        if(this.workHours>40){
          return bonusAmount = (this.workHours-40)*30;
        }else {
            return 0;
        }
    }

    public double raiseSalary(){
        double raiseSalaryAmount;
        double yearDifference =  2021 - this.hireYear;
        if (yearDifference < 10 ){
            return  raiseSalaryAmount = this.salary * 0.05;
        } else if (yearDifference > 9 && yearDifference < 20) {
            return  raiseSalaryAmount = this.salary * 0.10;
        } else if (yearDifference > 19 ) {
            return  raiseSalaryAmount = this.salary * 0.15;
        }else {
            return 0;
        }
    }
    public void employeeInformations(){
        System.out.println("Adı : "+ this.name);
        System.out.println("Maaşı : "+ this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : "+ this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş artışı : "+ raiseSalary() );
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+ (this.salary+(bonus()-tax())));
        System.out.println("Toplam Maaş : "+(this.salary+raiseSalary()));

    }
}
