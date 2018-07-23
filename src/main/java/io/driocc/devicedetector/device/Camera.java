/**
 * 
 */
package io.driocc.devicedetector.device;

import io.driocc.devicedetector.DetectResult;
import io.driocc.devicedetector.yaml.YamlParser;

/**
 * @author kyon
 *
 */
public class Camera extends DeviceParserAbstract {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String FIXTURE_FILE = "regexes/device/cameras.yml";
    
    private Camera(){
    	super();
    	this.setType("camera");
    	this.setRegexes(YamlParser.get(FIXTURE_FILE));
    }
    
    public DetectResult parse(String userAgent) {
        if (this.preMatchOverall(userAgent)) {
            return null;
        }
        return super.parse(userAgent);
    }

}
