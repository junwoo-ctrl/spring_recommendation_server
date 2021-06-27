package RestRecommend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(packages="RestRecommend")
public class RestRecommendApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestRecommendApplication.class, args);
	}

}
