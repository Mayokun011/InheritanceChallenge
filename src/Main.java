public class Main {

    public static void main(String[] args) {

        Employee ola = new Employee("Ola","14/10/2000", "14/03/2021");

        System.out.println(ola);
        System.out.println("Age = " + ola.getAge());
        System.out.println("Pay = " + ola.collectPay());

        SalariedEmployee lekan = new SalariedEmployee("Lekan", "03/11/1997", "11/11/2022", 35000 );
        System.out.println(lekan);
        System.out.println("Age = " + lekan.getAge());
        System.out.println("Pay = " + lekan.collectPay());
        System.out.println("Lekan's Paycheck = $" + lekan.collectPay());

        lekan.retire();
        System.out.println("Lekan's Pension check = $" + lekan.collectPay());

        SalariedEmployee chike = new SalariedEmployee ("Chike", "23/01/2000", "11/04/2021", 30000);
        System.out.println(chike);
        System.out.println("Chike's Paycheck = $" + chike.collectPay());

        HourlyEmployee sarah = new HourlyEmployee ("Sarah", "08/05/2001", "11/04/2021", 15);
        System.out.println(sarah);
        System.out.println("Sarah's Paycheck = $" + sarah.collectPay());
        System.out.println("Sarah's Holiday Pay = $" + sarah.getDoublePay());


    }

}
