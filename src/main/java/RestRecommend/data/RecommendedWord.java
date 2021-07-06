package RestRecommend.data;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class RecommendedWord {
	public String recommendGeneratedDate;
	public String recommendResult;
	public ArrayList<String> recommendKeywordList;

	public RecommendedWord() {}
	public RecommendedWord(String recommend_generated_date, String recommend_result, ArrayList<String> recommend_keyword_list) {
		this.recommendGeneratedDate = recommend_generated_date;
		this.recommendResult = recommend_result;
		this.recommendKeywordList = recommend_keyword_list;
	}
	
}
