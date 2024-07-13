package recreateyou.reqapi.qna.controller;

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
import recreateyou.reqapi.qna.service.AnswerService;
import recreateyou.reqapi.qna.vo.AnswerRequestVO;
import recreateyou.reqapi.qna.vo.AnswerResponseVO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/question/{question-seq}/answer")
public class AnswerController {
	private final AnswerService answerService;

	@PostMapping
	public void registerAnswer(@PathVariable("question-seq") Long questionSeq,
			@RequestBody AnswerRequestVO answerRequestVO) {
		answerService.registerAnswer(questionSeq, answerRequestVO);
	}

	@GetMapping("/{answer-seq}")
	public AnswerResponseVO getAnswer(@PathVariable("question-seq") Long questionSeq,
			@PathVariable("answer-seq") Long answerSeq) {
		return answerService.getAnswer(questionSeq, answerSeq);
	}

	@GetMapping
	public List<AnswerResponseVO> getAllAnswers(@PathVariable("question-seq") Long questionSeq) {
		return answerService.getAllAnswers(questionSeq);
	}

	@PatchMapping("/{answer-seq}")
	public void patchAnswer(@PathVariable("question-seq") Long questionSeq, @PathVariable("answer-seq") Long answerSeq,
			@RequestBody AnswerRequestVO answerRequestVO) {
		answerService.patchAnswer(answerSeq, answerRequestVO);
	}

	@DeleteMapping("/{answer-seq}")
	public void deleteAnswer(@PathVariable("question-seq") Long questionSeq,
			@PathVariable("answer-seq") Long answerSeq) {
		answerService.deleteAnswer(answerSeq);
	}
}