package kounettechnologie.kounet.multiconnexions.config;

import kounettechnologie.kounet.multiconnexions.web.CustomerSoapService;
import lombok.AllArgsConstructor;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class CxfConfig {
    private Bus bus;
    private CustomerSoapService customerSoapService;

    @Bean
    public EndpointImpl endpoint(){
        EndpointImpl endpoint=new EndpointImpl(bus,customerSoapService);
        endpoint.publish("/CustomerService");
        return endpoint;
    }
}
