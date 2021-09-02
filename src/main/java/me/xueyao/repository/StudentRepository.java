package me.xueyao.repository;

import me.xueyao.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Simon.Xue
 * @date 2021/9/2 9:24 下午
 **/
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
