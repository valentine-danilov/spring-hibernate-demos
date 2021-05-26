package by.danilov.domain;

import lombok.Data;

import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public abstract class AbstractPerson {
    private String firstName;
    private String lastName;
    private Integer age;
}
