package com.agent47.employeemanagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
    @Id
    @SequenceGenerator(
            name = "employee_sequence",
            sequenceName = "employee_sequence",
            allocationSize = 2
    )
    @GeneratedValue(
            generator = "employee_sequence",
            strategy = GenerationType.AUTO
    )
    private Long employeeId;
    private String firstName;
    private String lastName;
    @NotBlank
    private String email;
}
