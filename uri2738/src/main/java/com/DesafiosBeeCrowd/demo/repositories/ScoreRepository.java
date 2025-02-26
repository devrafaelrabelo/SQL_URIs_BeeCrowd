package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.dto.ScoreMinDTO;
import com.DesafiosBeeCrowd.demo.entities.Score;
import com.DesafiosBeeCrowd.demo.projections.ScoreMinProjections;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ScoreRepository extends JpaRepository<Score, Long> {

    @Query(nativeQuery = true, value = "SELECT name, ROUND(((score.math*2) + (score.specific*3) + (score.project_plan)*5)/10, 2) AS avg FROM score " +
            "JOIN candidate ON score.candidate_id = candidate.id " +
            "ORDER BY avg DESC")
    List<ScoreMinProjections> search1();

    @Query("SELECT new com.DesafiosBeeCrowd.demo.dto.ScoreMinDTO(obj.candidate.name, ROUND(((obj.math*2) + (obj.specific*3) + (obj.project_plan)*5)/10, 2) AS avg ) " +
            "FROM Score obj " +
            "ORDER BY avg DESC")
    List<ScoreMinDTO> search2();



}
