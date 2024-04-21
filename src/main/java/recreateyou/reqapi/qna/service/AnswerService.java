package recreateyou.reqapi.qna.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import recreateyou.reqapi.qna.entity.AnswerEntity;
import recreateyou.reqapi.qna.repository.AnswerRepository;
import recreateyou.reqapi.qna.vo.AnswerRequestVO;
import recreateyou.reqapi.qna.vo.AnswerResponseVO;

@Transactional
@Service
@RequiredArgsConstructor
public class AnswerService {

	private final AnswerRepository answerRepository;

	public void registerAnswer(Long questionSeq, AnswerRequestVO answerRequestVO) {
		answerRepository.save(new AnswerEntity(questionSeq, answerRequestVO));
	}

	public AnswerResponseVO getAnswer(Long questionSeq, Long answerSeq) {
		Optional<AnswerEntity> optionalAnswerEntity = answerRepository.findById(answerSeq);
		AnswerEntity answerEntity = optionalAnswerEntity.orElseThrow(() -> new RuntimeException("등록된 답변이 없습니다."));
		return answerEntity.toResponseVO();
	}

	public List<AnswerResponseVO> getAllAnswers(Long questionSeq) {
		List<AnswerEntity> answerEntityList = answerRepository.findAll();
		List<AnswerResponseVO> vos = new ArrayList<>();
		for (AnswerEntity entity : answerEntityList) {
			vos.add(entity.toResponseVO());
		}
		return vos;
	}

	public void patchAnswer(Long answerSeq, AnswerRequestVO answerRequestVO) {
		AnswerEntity existingAnswer = answerRepository.findById(answerSeq)
				.orElseThrow(() -> new RuntimeException("해당 답변을 찾을 수 없습니다: " + answerSeq));

		existingAnswer.setTitle(answerRequestVO.title());
		existingAnswer.setContext(answerRequestVO.context());

		answerRepository.save(existingAnswer);
	}

	public void deleteAnswer(Long answerSeq) {
		answerRepository.deleteById(answerSeq);
	}
}
