package org.jkd.poc.camelcxf.perf;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by kd40173 on 19/06/14.
 */

@XmlRootElement(name = "replacementNotification")
public class ReplacementNotification {

    private String deviceSerialNumber;

    private String partSerialNumber;

    private String faultDescription;

    public String getDeviceSerialNumber() {
        return deviceSerialNumber;
    }

    public void setDeviceSerialNumber(String deviceSerialNumber) {
        this.deviceSerialNumber = deviceSerialNumber;
    }

    public String getPartSerialNumber() {
        return partSerialNumber;
    }

    public void setPartSerialNumber(String partSerialNumber) {
        this.partSerialNumber = partSerialNumber;
    }

    public String getFaultDescription() {
        return faultDescription;
    }

    public void setFaultDescription(String faultDescription) {
        this.faultDescription = faultDescription;
    }
}
