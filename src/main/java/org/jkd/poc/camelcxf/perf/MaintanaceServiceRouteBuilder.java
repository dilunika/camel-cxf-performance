package org.jkd.poc.camelcxf.perf;

import org.apache.camel.builder.RouteBuilder;

/**
 * Created by kd40173 on 19/06/14.
 */
public class MaintanaceServiceRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("cxfrs:server?bindingStyle=SimpleConsumer")
            .process(new OrderDeviceProcess())
            .process(new AllocateEngineerProcess())
            .process(new RequestTransformerProcess());
    }
}
