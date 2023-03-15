package login.loginspring.repository;


import login.loginspring.domain.Goals;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface GoalRepository {
    Goals save(Goals goals);
    Optional<Goals> findById(Integer id);
    Optional<Goals> findByOrderNum(Integer orderNum);
    Optional<Goals> findByCategory(String category);
    List<Goals> findAll();
}
