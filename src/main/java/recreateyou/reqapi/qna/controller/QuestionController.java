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
import recreateyou.reqapi.qna.service.QuestionService;
import recreateyou.reqapi.qna.vo.QuestionRequestVO;
import recreateyou.reqapi.qna.vo.QuestionResponseVO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/question")
public class QuestionController {
	private final QuestionService questionService;

	@PostMapping("/{question-seq}")
	public void registerQuestion(@PathVariable("question-seq") Long questionSeq,
			@RequestBody QuestionRequestVO questionRequestVO) {
		questionService.registerQuestion(questionSeq, questionRequestVO);
	}

	@GetMapping("/{question-seq}")
	public QuestionResponseVO getQuestion(@PathVariable("question-seq") Long questionSeq) {
		return questionService.getQuestion(questionSeq);
	}

	@GetMapping
	public List<QuestionResponseVO> getAllQuestion() {
		return questionService.getAllQuestion();
	}

	@PatchMapping("/{question-seq}")
	public void patchQuestion(@PathVariable("question-seq") Long questionSeq,
			@RequestBody QuestionRequestVO questionRequestVO) {
		questionService.patchQuestion(questionSeq, questionRequestVO);
	}

	@DeleteMapping("/{question-seq}")
	public void deleteQuestion(@PathVariable("question-seq") Long questionSeq) {
		questionService.deleteQuestion(questionSeq);
	}

}
