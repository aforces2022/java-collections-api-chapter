package com.zorba.collection.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapInternalEx {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"john", "M");
        Employee e2 = new Employee(2,"harry", "M");
        Employee e3 = new Employee(3,"mat", "M");
        Employee e4 = new Employee(4,"amy", "F");
        Employee e5 = new Employee(5,"yu", "F");
        Employee e6 = new Employee(6,"rajni", "F");

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);

        System.out.println(employees);

        Map<String, List<Employee>> map = new HashMap<>();
        //m -----> list
        //f ------> list

        for (Employee e:employees) {
            if("M".equalsIgnoreCase(e.getGender())){
                if(map.containsKey(e.getGender())){
                    List<Employee> existingEmp = map.get(e.getGender());
                    existingEmp.add(e);
                    map.put(e.getGender(),existingEmp);

                }else{
                    List<Employee> maleEmployees = new ArrayList<>();
                    maleEmployees.add(e);
                    map.put(e.getGender(),maleEmployees);
                }
            }else if("F".equalsIgnoreCase(e.getGender())){
                if(map.containsKey(e.getGender())){
                    List<Employee> existingEmp = map.get(e.getGender());
                    existingEmp.add(e);
                    map.put(e.getGender(),existingEmp);
                }else{
                    List<Employee> maleEmployees = new ArrayList<>();
                    maleEmployees.add(e);
                    map.put(e.getGender(),maleEmployees);
                }
            }
        }

    }
}
