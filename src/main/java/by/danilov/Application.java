package by.danilov;

import by.danilov.domain.AbstractPerson;
import by.danilov.domain.PersonSeq;
import by.danilov.domain.PersonTable;
import by.danilov.repository.PersonAutoRepository;
import by.danilov.repository.PersonIdentityRepository;
import by.danilov.repository.PersonSeqRepository;
import by.danilov.repository.PersonTableRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class Application implements CommandLineRunner {

    @Autowired(required = false)
    private PersonAutoRepository personAutoRepository;
    @Autowired(required = false)
    private PersonIdentityRepository personIdentityRepository;
    @Autowired(required = false)
    private PersonSeqRepository personSeqRepository;
    @Autowired(required = false)
    private PersonTableRepository personTableRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        personTableRepository.save(createPerson("Valiantsin", "Danilau", 22, PersonTable.class));
    }

    @SneakyThrows
    private <T extends AbstractPerson> T createPerson(String firstName, String lastName, Integer age, Class<T> targetClass) {
        T person = targetClass.newInstance();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);
        return person;
    }
}
