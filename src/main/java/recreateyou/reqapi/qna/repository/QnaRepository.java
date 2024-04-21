package recreateyou.reqapi.qna.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import recreateyou.reqapi.qna.entity.QuestionEntity;

@Repository
public interface QnaRepository extends JpaRepository<QuestionEntity, Long> {

}
