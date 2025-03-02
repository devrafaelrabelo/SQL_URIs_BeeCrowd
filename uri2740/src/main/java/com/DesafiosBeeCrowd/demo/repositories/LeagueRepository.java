package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.entities.League;
import com.DesafiosBeeCrowd.demo.projections.LeagueMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LeagueRepository extends JpaRepository<League, Long> {


    @Query(nativeQuery = true, value = "(SELECT concat('Podium: ', team) AS name from league " +
            "WHERE position <= 3 " +
            "ORDER BY position) " +
            "UNION ALL " +
            "(SELECT concat('Demoted: ', team) AS name from league " +
            "WHERE position >= (SELECT COUNT(*) - 1 FROM league) " +
            "ORDER BY position)")
    List<LeagueMinProjection> search1();
}
