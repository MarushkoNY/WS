
package service;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GetDataService", targetNamespace = "http://service/", wsdlLocation = "file:wsdl/GetDataService.wsdl")
public class GetDataService
    extends Service
{

    private final static URL GETDATASERVICE_WSDL_LOCATION;
    private final static WebServiceException GETDATASERVICE_EXCEPTION;
    private final static QName GETDATASERVICE_QNAME = new QName("http://service/", "GetDataService");

    static {
        GETDATASERVICE_WSDL_LOCATION = service.GetDataService.class.getResource("file:wsdl/GetDataService.wsdl");
        WebServiceException e = null;
        if (GETDATASERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'file:wsdl/GetDataService.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        GETDATASERVICE_EXCEPTION = e;
    }

    public GetDataService() {
        super(__getWsdlLocation(), GETDATASERVICE_QNAME);
    }

    public GetDataService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GETDATASERVICE_QNAME, features);
    }

    public GetDataService(URL wsdlLocation) {
        super(wsdlLocation, GETDATASERVICE_QNAME);
    }

    public GetDataService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GETDATASERVICE_QNAME, features);
    }

    public GetDataService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetDataService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DataWS
     */
    @WebEndpoint(name = "GetDataPort")
    public DataWS getGetDataPort() {
        return super.getPort(new QName("http://service/", "GetDataPort"), DataWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DataWS
     */
    @WebEndpoint(name = "GetDataPort")
    public DataWS getGetDataPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service/", "GetDataPort"), DataWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GETDATASERVICE_EXCEPTION!= null) {
            throw GETDATASERVICE_EXCEPTION;
        }
        return GETDATASERVICE_WSDL_LOCATION;
    }

}
