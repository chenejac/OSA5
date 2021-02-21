package rs.ac.uns.ftn.osavezbe05.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.ac.uns.ftn.osavezbe05.model.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
}
