
package org.webservice.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Livre", targetNamespace = "http://services.webservice.org/", wsdlLocation = "http://vij-pc:8080/webservice2396852418528692936/Livre?wsdl")
public class Livre_Service
    extends Service
{

    private final static URL LIVRE_WSDL_LOCATION;
    private final static WebServiceException LIVRE_EXCEPTION;
    private final static QName LIVRE_QNAME = new QName("http://services.webservice.org/", "Livre");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://vij-pc:8080/webservice2396852418528692936/Livre?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LIVRE_WSDL_LOCATION = url;
        LIVRE_EXCEPTION = e;
    }

    public Livre_Service() {
        super(__getWsdlLocation(), LIVRE_QNAME);
    }

    public Livre_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), LIVRE_QNAME, features);
    }

    public Livre_Service(URL wsdlLocation) {
        super(wsdlLocation, LIVRE_QNAME);
    }

    public Livre_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LIVRE_QNAME, features);
    }

    public Livre_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Livre_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LivreWebservice
     */
    @WebEndpoint(name = "LivreWebservicePort")
    public LivreWebservice getLivreWebservicePort() {
        return super.getPort(new QName("http://services.webservice.org/", "LivreWebservicePort"), LivreWebservice.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LivreWebservice
     */
    @WebEndpoint(name = "LivreWebservicePort")
    public LivreWebservice getLivreWebservicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.webservice.org/", "LivreWebservicePort"), LivreWebservice.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LIVRE_EXCEPTION!= null) {
            throw LIVRE_EXCEPTION;
        }
        return LIVRE_WSDL_LOCATION;
    }

}
