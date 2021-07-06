package RestRecommend.data;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class RequestedWord{

	// todo: Lombok implement?
    public String requestGeneratedDate;
    public String requestRecommendType;
    public String requestKeyword;

	public RequestedWord() {}
	public RequestedWord(String request_generated_date, String request_recommend_type, String request_keyword) {
		this.requestGeneratedDate = request_generated_date;
		this.requestRecommendType = request_recommend_type;
		this.requestKeyword = request_keyword;
	}
}
