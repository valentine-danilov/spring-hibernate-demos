package by.danilov.repository;

import by.danilov.domain.PersonAuto;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

@Profile({"auto", "all"})
public interface PersonAutoRepository extends JpaRepository<PersonAuto, Long>, PersonRepository {
}
