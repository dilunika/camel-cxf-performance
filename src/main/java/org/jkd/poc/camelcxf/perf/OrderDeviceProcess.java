package org.jkd.poc.camelcxf.perf;

import org.apache.camel.Exchange;

/**
 * Created by kd40173 on 19/06/14.
 */
public class OrderDeviceProcess implements org.apache.camel.Processor {

    @Override
    public void process(Exchange exchange) throws Exception {

        ReplacementNotification notification = exchange.getIn().getBody(ReplacementNotification.class);
        String device = notification.getDeviceSerialNumber();

        DeviceOrderInvoice invoice = orderDevice(device);

    }

    private DeviceOrderInvoice orderDevice(String device) {

        return null;
    }
}
