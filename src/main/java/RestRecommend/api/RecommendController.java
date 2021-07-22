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
import RestRecommend.v1.ManualProvider;


@RestController
@RequestMapping(value="/")
public class RecommendController {

	@RequestMapping(value="home/{version}", method=RequestMethod.GET)
	public String getUsage(@PathVariable String version) {
		ManualProvider our_manual_provider = new ManualProvider();
		String our_manual = our_manual_provider.getOurManual(version);
		return our_manual;
	}

	
	@RequestMapping(value="recommend/v1", method=RequestMethod.POST)
	@ResponseBody()
	public RecommendedWord getRecommendedWord(@RequestBody RequestedWord requested_word) throws Exception {
		// just return data by simple logics.
		Recommender recommender = new Recommender();
		RecommendedWord recommended_word = recommender.searchRecommendWord(requested_word);
		return recommended_word;
	}

	@RequestMapping(value="recommend/v2", method=RequestMethod.POST)
	@ResponseBody()
	public RecommendedWord getRecommendedWordByNgram(@RequestBody RequestedWord requested_word) throws Exception {
		NgramRecommender ngram_recommender = new Recommender();
		RecommendedWord ngram_recommended_word = ngram_recommender.searchNgramRecommendWord(requested_word);
	}

}
