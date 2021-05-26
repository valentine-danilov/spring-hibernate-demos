package by.danilov.repository;

import by.danilov.domain.PersonTable;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

@Profile({"table", "all"})
public interface PersonTableRepository extends JpaRepository<PersonTable, Long>, PersonRepository {
}
