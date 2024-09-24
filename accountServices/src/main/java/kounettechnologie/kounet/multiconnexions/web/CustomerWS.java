package kounettechnologie.kounet.multiconnexions.web;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * This class was generated by Apache CXF 4.0.0
 * 2024-09-24T13:48:32.223-04:00
 * Generated source version: 4.0.0
 *
 */
@WebServiceClient(name = "CustomerWS",
                  wsdlLocation = "file:/C:/Users/Utilisateur/Documents/mes%20projets/pour%20mon%20portofolio/config/muti/RESTSAOPGRAPHQLGRPC/accountServices/src/main/resources/CustomerService.wsdl",
                  targetNamespace = "http://web.multiconnexions.kounet.kounettechnologie/")
public class CustomerWS extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://web.multiconnexions.kounet.kounettechnologie/", "CustomerWS");
    public final static QName CustomerSoapServicePort = new QName("http://web.multiconnexions.kounet.kounettechnologie/", "CustomerSoapServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Utilisateur/Documents/mes%20projets/pour%20mon%20portofolio/config/muti/RESTSAOPGRAPHQLGRPC/accountServices/src/main/resources/CustomerService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CustomerWS.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Utilisateur/Documents/mes%20projets/pour%20mon%20portofolio/config/muti/RESTSAOPGRAPHQLGRPC/accountServices/src/main/resources/CustomerService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CustomerWS(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CustomerWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CustomerWS() {
        super(WSDL_LOCATION, SERVICE);
    }

    public CustomerWS(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CustomerWS(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CustomerWS(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns CustomerSoapService
     */
    @WebEndpoint(name = "CustomerSoapServicePort")
    public CustomerSoapService getCustomerSoapServicePort() {
        return super.getPort(CustomerSoapServicePort, CustomerSoapService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CustomerSoapService
     */
    @WebEndpoint(name = "CustomerSoapServicePort")
    public CustomerSoapService getCustomerSoapServicePort(WebServiceFeature... features) {
        return super.getPort(CustomerSoapServicePort, CustomerSoapService.class, features);
    }

}
