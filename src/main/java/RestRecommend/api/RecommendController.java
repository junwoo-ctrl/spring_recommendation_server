package RestRecommend.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import RestRecommend.data.RequestedWord;
import RestRecommend.data.RecommendedWord
import RestRecommend.v1.Recommender;


@RestController
@ReqeustMapping(value="/recommend")
public class RecommendController {
	
	@RequestMapping(value="/{requested_word}", method=RequestMethod.GET)
	@ResponseBody()
	public RecommendedWord getRecommendedWord(@PathVariable("requested_word") final RequestedWord requested_word) {
		Recommender recommender = new Recommender();
		RecommendedWord recommended_word = recommender.search(requested_word);
		return recommended_word;
	}

}
