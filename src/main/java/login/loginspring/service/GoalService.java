package login.loginspring.service;

import login.loginspring.domain.Goals;
import login.loginspring.repository.GoalRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
public class GoalService {
    private final GoalRepository goalRepository;

    public GoalService(GoalRepository goalRepository) {
        this.goalRepository = goalRepository;
    }

    public Integer join(Goals goals) {
        goalRepository.save(goals);
        return goals.getId();
    }

    public String delete(Goals goals) {
        goalRepository.remove(goals);
        return goals.getCategory();
    }

//    public Integer join(Goals goals){
//        goalRepository.save(goals);
//        return goals.getId();
//    }

    /* 전체 목표 조회 */
    public List<Goals> findGoals() { return goalRepository.findAll(); } //findId로 해야함(?)

    /* user id로 전체 목표 조회 */
    public List<Goals> findGoalsByUserId(String userId) {
        return goalRepository.findByUserId(userId);
    }

    /* 한 목표 조회 with category */
    public Optional<Goals> findByCategory(String category) { return goalRepository.findByCategory(category);}

    /* 한 목표 조회 with id */
    public Optional<Goals> findById(String id) { return goalRepository.findById(Integer.valueOf(id)); }

}
