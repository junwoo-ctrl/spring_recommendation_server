package RestRecommend.v1;

import RestRecommend.interfaces.AbstractRecommender;
import RestRecommend.data.RecommendedWord;
import RestRecommend.data.RequestedWord;


public class Recommender implements AbstractRecommender {
	
	public RecommendedWord searchRecommendWord(RequestedWord requested_word) {

		RecommendedWord recommended_word = new RecommendedWord();

		recommended_word.setRecommendGeneratedDate(new String(requested_word.getRequestGeneratedDate()));
		recommended_word.setRecommendResult("recommend by ngrams");
		return recommended_word;
	}
}
