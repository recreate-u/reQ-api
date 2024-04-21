package recreateyou.reqapi.interest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import recreateyou.reqapi.interest.service.InterestService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/interest")
public class InterestController {

	private final InterestService interestService;
	
}
