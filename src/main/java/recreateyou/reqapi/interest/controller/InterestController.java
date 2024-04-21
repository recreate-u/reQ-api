package recreateyou.reqapi.interest.controller;

<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import recreateyou.reqapi.interest.service.InterestService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/interest")
public class InterestController {

	private final InterestService interestService;
	
=======
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterestController {
>>>>>>> 2d4ca457b90285a00fc455f6edc4ec95a02e0c46
}
