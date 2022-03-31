package com.example.carparkproject.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employee")
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "employeeId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeId;

    @Column(name = "account")
    private String account;

    @Column(name = "department")
    private String department;

    @Column(name = "employeeAddress")
    private String employeeAddress;

    @Column(name = "employeeBirthday")
    //FormatDate: date/month/year
    private Date employeeBirthday;

    @Column(name = "employeeEmail")
    private String employeeEmail;

    @Column(name = "employeeName")
    private String employeeName;

    @Column(name = "employeePhone")
    private String employeePhone;

    @Column(name = "password")
    private String password;

    @Column(name = "sex")
    private String sex;
}
