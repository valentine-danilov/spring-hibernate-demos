package by.danilov.repository;

import by.danilov.domain.PersonSeq;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

@Profile({"seq", "all"})
public interface PersonSeqRepository extends JpaRepository<PersonSeq, Long>, PersonRepository {
}
