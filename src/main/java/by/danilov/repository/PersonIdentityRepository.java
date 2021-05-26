package by.danilov.repository;

import by.danilov.domain.PersonIdentity;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

@Profile({"id", "all"})
public interface PersonIdentityRepository extends JpaRepository<PersonIdentity, Long> {

}
