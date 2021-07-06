package RestRecommend.interfaces;

import RestRecommend.data.RecommendedWord;
import RestRecommend.data.RequestedWord;

public interface AbstractRecommender {
	RecommendedWord searchRecommendWord(RequestedWord requested_word); 
}
