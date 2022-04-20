package com.zorba.collection.Map;

public class ObjectClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Emp emp = new Emp();
        emp.setId(1);
        emp.setName("john");
        Emp cEmp = (Emp) emp.clone();

        System.out.println(cEmp.getId());
        System.out.println(cEmp.getName());
    }
}
