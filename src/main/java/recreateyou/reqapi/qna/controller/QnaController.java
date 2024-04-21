package recreateyou.reqapi.qna.controller;

<<<<<<< HEAD
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import recreateyou.reqapi.qna.service.QnaService;
import recreateyou.reqapi.qna.vo.QuestionRequestVO;
import recreateyou.reqapi.qna.vo.QuestionResponseVO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/qna")
public class QnaController {
	private final QnaService qnaService;

	@PostMapping("/{question-seq}")
	public void registerQuestion(@PathVariable("question-seq") Long questionSeq,
			@RequestBody QuestionRequestVO questionRequestVO) {
		qnaService.registerQuestion(questionSeq, questionRequestVO);
	}

	@GetMapping("/{question-seq}")
	public QuestionResponseVO getQuestion(@PathVariable("question-seq") Long questionSeq) {
		return qnaService.getQuestion(questionSeq);
	}

	@GetMapping
	public List<QuestionResponseVO> getAllQuestion() {
		return qnaService.getAllQuestion();
	}

	@PatchMapping("/{question-seq}")
	public void patchQuestion(@PathVariable("question-seq") Long questionSeq,
			@RequestBody QuestionRequestVO questionRequestVO) {
		qnaService.patchQuestion(questionSeq, questionRequestVO);
	}

	@DeleteMapping("/{question-seq}")
	public void deleteQuestion(@PathVariable("question-seq") Long questionSeq) {
		qnaService.deleteQuestion(questionSeq);
	}

=======
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QnaController {
>>>>>>> 2d4ca457b90285a00fc455f6edc4ec95a02e0c46
}
