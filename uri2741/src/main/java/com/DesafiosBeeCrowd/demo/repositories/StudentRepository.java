package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.dto.StudentMinDTO;
import com.DesafiosBeeCrowd.demo.entities.Student;
import com.DesafiosBeeCrowd.demo.projections.StudentMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {


    @Query(nativeQuery = true, value = "SELECT concat('Approved: ', name) AS name, grade FROM students " +
            "WHERE grade >= 7 " +
            "ORDER BY grade DESC")
    List<StudentMinProjection> search1();

    @Query("SELECT new com.DesafiosBeeCrowd.demo.dto.StudentMinDTO(concat('Approved: ', obj.name) AS name, obj.grade) " +
            "FROM Student obj " +
            "WHERE obj.grade >= 7 " +
            "ORDER BY obj.grade DESC")
    List<StudentMinDTO> search2();
}
