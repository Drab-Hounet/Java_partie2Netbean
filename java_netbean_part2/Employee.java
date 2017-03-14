
package java_netbean_part2;

/**
 *
 * @author jerome.lombard
 */
public class Employee extends Person implements Salary {
    protected int salary;
    protected int contractDuration;
    
    public Employee(){
    }

    public Employee(String pName, String pFirst_name, int pBirthYear, int pSalary, int pContractDuration){
        name = pName;
        first_name = pFirst_name;
        birthYear = pBirthYear;
        salary = pSalary;
        contractDuration = pContractDuration;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(int contractDuration) {
        this.contractDuration = contractDuration;
    }
    
    public String work(){
        return " travail en tant que ";
    }
    
    @Override
    public void paid(int payment){
        System.out.println("salaire de " + payment + " €" );
    }
    
    
   

    
}
