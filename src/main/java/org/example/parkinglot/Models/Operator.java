package org.example.parkinglot.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Operator extends BaseModel{
    private String name;
    private int empId;

    public Operator(String name,int empId){
        this.name = name;
        this.empId = empId;
    }
}
