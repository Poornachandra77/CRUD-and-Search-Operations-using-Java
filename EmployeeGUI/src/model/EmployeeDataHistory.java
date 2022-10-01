/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author chandukongara
 */
public class EmployeeDataHistory {
    
    private ArrayList<Employee> history;
    
    public EmployeeDataHistory(){
        this.history = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }

    public Employee addNewEmployeeData(){
        Employee newEmployeeData = new Employee();
        history.add(newEmployeeData);
        return newEmployeeData;
    }
}
