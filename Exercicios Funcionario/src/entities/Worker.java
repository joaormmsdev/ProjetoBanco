package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities_enums.WorkerLevel;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;

    private Departament departament;

    private List<HourContact> contracts = new ArrayList<>();

    public Worker(){
    }

    public Worker(String name, WorkerLevel level, double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContact> getContracts() {
        return contracts;
    }
    
    public void addContract(HourContact contact){
        contracts.add(contact);
    }

    public void removeContract(HourContact contact){
        contracts.remove(contact);
    }

    public double income(int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        
        for (HourContact c : contracts){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
}