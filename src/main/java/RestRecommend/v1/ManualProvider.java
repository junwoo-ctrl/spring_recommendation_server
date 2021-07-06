package RestRecommend.v1;

import lombok.Getter;
import lombok.Setter;

import RestRecommend.data.ManualV1;
import RestRecommend.data.ManualV2;


public class ManualProvider {

	protected String versionOne = "v1";
	protected String versionTwo = "v2";
	
	public ManualProvider() {}

	public String getOurManual(String version) {
		if (version.equals(this.versionOne)) {
			ManualV1 manual_v1 = new ManualV1();
			String ourManual = manual_v1.getManual();
			return ourManual;
		}
		else if (version.equals(this.versionTwo)) {
			ManualV2 manual_v2 = new ManualV2();
			String ourManual = manual_v2.getManual();
			return ourManual;
		}
		else {
			String ourManual = "Invalid Version Request.";
			return ourManual;
		}
	}
}
