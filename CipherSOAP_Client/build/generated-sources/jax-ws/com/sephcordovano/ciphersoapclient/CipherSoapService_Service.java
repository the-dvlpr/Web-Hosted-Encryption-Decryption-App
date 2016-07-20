
package com.sephcordovano.ciphersoapclient;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CipherSoapService", targetNamespace = "http://ciphersoapws.sephcordovano.com/", wsdlLocation = "http://localhost:8080/CipherSOAP_Service/CipherSoapService?WSDL")
public class CipherSoapService_Service
    extends Service
{

    private final static URL CIPHERSOAPSERVICE_WSDL_LOCATION;
    private final static WebServiceException CIPHERSOAPSERVICE_EXCEPTION;
    private final static QName CIPHERSOAPSERVICE_QNAME = new QName("http://ciphersoapws.sephcordovano.com/", "CipherSoapService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/CipherSOAP_Service/CipherSoapService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CIPHERSOAPSERVICE_WSDL_LOCATION = url;
        CIPHERSOAPSERVICE_EXCEPTION = e;
    }

    public CipherSoapService_Service() {
        super(__getWsdlLocation(), CIPHERSOAPSERVICE_QNAME);
    }

    public CipherSoapService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CIPHERSOAPSERVICE_QNAME, features);
    }

    public CipherSoapService_Service(URL wsdlLocation) {
        super(wsdlLocation, CIPHERSOAPSERVICE_QNAME);
    }

    public CipherSoapService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CIPHERSOAPSERVICE_QNAME, features);
    }

    public CipherSoapService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CipherSoapService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CipherSoapService
     */
    @WebEndpoint(name = "CipherSoapServicePort")
    public CipherSoapService getCipherSoapServicePort() {
        return super.getPort(new QName("http://ciphersoapws.sephcordovano.com/", "CipherSoapServicePort"), CipherSoapService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CipherSoapService
     */
    @WebEndpoint(name = "CipherSoapServicePort")
    public CipherSoapService getCipherSoapServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ciphersoapws.sephcordovano.com/", "CipherSoapServicePort"), CipherSoapService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CIPHERSOAPSERVICE_EXCEPTION!= null) {
            throw CIPHERSOAPSERVICE_EXCEPTION;
        }
        return CIPHERSOAPSERVICE_WSDL_LOCATION;
    }

}
