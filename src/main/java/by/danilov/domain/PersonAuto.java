package by.danilov.domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity(name = "person_auto")
@Getter
public class PersonAuto extends AbstractPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
