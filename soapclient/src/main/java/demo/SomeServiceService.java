package demo;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.3
 * 2017-03-06T21:38:58.827-06:00
 * Generated source version: 3.1.3
 * 
 */
@WebServiceClient(name = "SomeServiceService", 
                  wsdlLocation = "http://localhost:8082/services/some?wsdl",
                  targetNamespace = "http://demo/") 
public class SomeServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://demo/", "SomeServiceService");
    public final static QName SomeServicePort = new QName("http://demo/", "SomeServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8082/services/some?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SomeServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8082/services/some?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SomeServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SomeServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SomeServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public SomeServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SomeServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SomeServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns SomeService
     */
    @WebEndpoint(name = "SomeServicePort")
    public SomeService getSomeServicePort() {
        return super.getPort(SomeServicePort, SomeService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SomeService
     */
    @WebEndpoint(name = "SomeServicePort")
    public SomeService getSomeServicePort(WebServiceFeature... features) {
        return super.getPort(SomeServicePort, SomeService.class, features);
    }

}
