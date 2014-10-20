package com.practice.programs.collection.treeMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;



/**
 *
 * @author choudhuryb
 */
public class TreeMapComparatorExample {

    public static void main(String[] arg) {

        Map<Employee, String> map = new HashMap<Employee, String>();
        map.put(new Employee(1, 100), "SuperMan");
        map.put(new Employee(2, 200), "BatMan");
        map.put(new Employee(3, 300), "CatWoman");
        map.put(new Employee(4, 50), "IronMan");
        map.put(new Employee(5, 10), "Thor");
        map.put(new Employee(6, 1000), "CaptainAmerica");


        Map<Employee, String> mapSortedById = new TreeMap<Employee, String>(new IdComparator());

        mapSortedById.putAll(map);
        System.out.println("Sort by id\n"+mapSortedById);

        Map<Employee, String> mapSortedBySalary = new TreeMap<Employee, String>(new SalaryComparator());

        mapSortedBySalary.putAll(map);
        System.out.println("Sort by salary\n"+ mapSortedBySalary);
        
       ValuesComparator vcm = new ValuesComparator(map);
       Map<Employee, String> mapSortedByValue = new TreeMap<Employee, String>(vcm);

        mapSortedByValue.putAll(map);
        System.out.println("Sort by values\n"+mapSortedByValue);




    }
   
}
class Employee {

    double salary;
    int id;

    public Employee(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        
        return "\nEmployee{" + "salary=" + salary + ", id=" + id + '}';
    }   
    
}

//IdComparator
class IdComparator implements Comparator<Employee> {

    public IdComparator() {
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getId() > o2.getId()) {
            return 1;
        } else if (o1.getId() < o2.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
}

//salary Comparator
class SalaryComparator implements Comparator<Employee> {

    public SalaryComparator() {
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getSalary() > o2.getSalary()) {
            return 1;
        } else if (o1.getSalary() < o2.getSalary()) {
            return -1;
        } else {
            return 0;
        }
    }
}

class ValuesComparator implements Comparator<Object>{

    Map <Employee, String> comparatorMap;
        public ValuesComparator(Map <Employee, String> comparatorMap) {
            this.comparatorMap = comparatorMap;
        }


    @Override
    public int compare(Object o1, Object o2) {
        return (comparatorMap.get(o1).compareTo (comparatorMap.get(o2)));
    }
    }