package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.dto.AccountMinDTO;
import com.DesafiosBeeCrowd.demo.entities.Account;
import com.DesafiosBeeCrowd.demo.projections.AccountMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {

    @Query(nativeQuery = true, value = "SELECT id, password, MD5(password) FROM account")
    List<AccountMinProjection> search1();

    @Query("SELECT new com.DesafiosBeeCrowd.demo.dto.AccountMinDTO(obj.id, obj.password, MD5(obj.password)) " +
            "FROM Account obj")
    List<AccountMinDTO> search2();
}
