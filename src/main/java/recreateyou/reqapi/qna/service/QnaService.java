package recreateyou.reqapi.qna.service;

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6c9de38e5980bf2ddf30165d7105e0301fd8d629
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.RequiredArgsConstructor;
import recreateyou.reqapi.qna.entity.QuestionEntity;
import recreateyou.reqapi.qna.repository.QnaRepository;
import recreateyou.reqapi.qna.vo.QuestionRequestVO;
import recreateyou.reqapi.qna.vo.QuestionResponseVO;

@Transactional
@Service
@RequiredArgsConstructor
public class QnaService {

	private final QnaRepository qnaRepository;

	public void registerQuestion(Long questionSeq, QuestionRequestVO questionRequestVO) {
		qnaRepository.save(new QuestionEntity(questionSeq, questionRequestVO));
	}

	public QuestionResponseVO getQuestion(@PathVariable("question-seq") Long questionSeq) {
		Optional<QuestionEntity> findQuestion = qnaRepository.findById(questionSeq);
		QuestionEntity questionEntity = findQuestion.orElseThrow(() -> new RuntimeException("등록된 질문이 없습니다."));
		return new QuestionEntity().toResponseVO();
	}

	public List<QuestionResponseVO> getAllQuestion() {
		List<QuestionEntity> questionEntityList = qnaRepository.findAll();
		List<QuestionResponseVO> vos = new ArrayList<>();
		for (QuestionEntity entity : questionEntityList) {
			vos.add(new QuestionResponseVO(entity.getQuestionSeq(), entity.getUserId(), entity.getTitle(),
					entity.getContext(), entity.getRegDate(), entity.getUpdDate()));
		}
		return vos;
	}

	public void patchQuestion(Long questionSeq, QuestionRequestVO questionRequestVO) {
		QuestionEntity existingQuestion = qnaRepository.findById(questionSeq)
				.orElseThrow(() -> new RuntimeException("해당 질문을 찾을 수 없습니다: " + questionSeq));

		existingQuestion.setTitle(questionRequestVO.title());
		existingQuestion.setContext(questionRequestVO.context());

		qnaRepository.save(existingQuestion);
	}

	public void deleteQuestion(@PathVariable("question-seq") Long questionSeq) {
		qnaRepository.deleteById(questionSeq);
	}

<<<<<<< HEAD
=======
import org.springframework.stereotype.Service;

@Service
public class QnaService {
>>>>>>> 2d4ca457b90285a00fc455f6edc4ec95a02e0c46
=======
>>>>>>> 6c9de38e5980bf2ddf30165d7105e0301fd8d629
}
