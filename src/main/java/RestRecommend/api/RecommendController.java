package RestRecommend.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import RestRecommend.data.RequestedWord;
import RestRecommend.data.RecommendedWord;
import RestRecommend.v1.Recommender;


@RestController
@RequestMapping(value="/recommend")
public class RecommendController {
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	@ResponseBody()
	public RecommendedWord getRecommendedWord(@RequestBody RequestedWord requested_word) throws Exception {
		Recommender recommender = new Recommender();
		RecommendedWord recommended_word = recommender.searchRecommendWord(requested_word);
		return recommended_word;
	}

}
