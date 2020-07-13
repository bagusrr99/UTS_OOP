package lab.phb.oopuas.repo;

import lab.phb.oopuas.entity.DataMhs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataMhsRepo extends JpaRepository<DataMhs, String> {
}