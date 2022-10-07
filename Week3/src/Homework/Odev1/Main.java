package Homework.Odev1;

public class Main {
    public static void main(String[] args) {
        /*

        CreditManager creditManager = new CreditManager();
        creditManager.Calculate();
        creditManager.Save();
        Customer customer = new Customer();
        customer.setId(2);
        customer.setCity("Adana");

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.Save();
        customerManager.Delete();

        Company company = new Company();
        company.setTaxNumber("537357");
        company.setCompanyName("Yildiz Holding");
        company.setId(1);

        CustomerManager customerManager2 = new CustomerManager(new Company());

        Person person = new Person();
        person.setNationalIdentity("98765");
        person.setId(3);
        person.setFirstName("Semih");
        person.setLastName("Yildiz");

         */


        CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
        customerManager.giveCredit();


    }
}
