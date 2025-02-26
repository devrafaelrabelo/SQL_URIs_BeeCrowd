package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.dto.LoanMinDTO;
import com.DesafiosBeeCrowd.demo.entities.Loan;
import com.DesafiosBeeCrowd.demo.projections.LoanMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LoanRepository extends JpaRepository<Loan, Long> {

    @Query(nativeQuery = true, value = "SELECT name, cast(extract(DAY from payday) AS INT) FROM loan")
    List<LoanMinProjection> search1();

    @Query("SELECT new com.DesafiosBeeCrowd.demo.dto.LoanMinDTO(name, cast(extract(DAY from payday) AS integer)) " +
            "FROM Loan")
    List<LoanMinDTO> search2();
}
