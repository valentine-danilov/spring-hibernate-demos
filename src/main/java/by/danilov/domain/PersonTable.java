package by.danilov.domain;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "person_table")
@Getter
public class PersonTable extends AbstractPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
}
