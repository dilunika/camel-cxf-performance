package org.jkd.poc.camelcxf.perf;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by kd40173 on 19/06/14.
 */

@XmlRootElement(name = "deviceOrderInvoice")
public class DeviceOrderInvoice {

    private String serialNumber;

    private Double amount;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
