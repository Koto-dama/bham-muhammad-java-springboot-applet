package projects.java.register;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface registerRepository extends JpaRepository<Register, Long> {
}
