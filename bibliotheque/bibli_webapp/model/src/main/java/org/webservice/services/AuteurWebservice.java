
package org.webservice.services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AuteurWebservice", targetNamespace = "http://services.webservice.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AuteurWebservice {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.webservice.services.Auteur>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAuteurByName", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.GetAuteurByName")
    @ResponseWrapper(localName = "getAuteurByNameResponse", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.GetAuteurByNameResponse")
    @Action(input = "http://services.webservice.org/AuteurWebservice/getAuteurByNameRequest", output = "http://services.webservice.org/AuteurWebservice/getAuteurByNameResponse")
    public List<Auteur> getAuteurByName(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "createAuteur", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.CreateAuteur")
    @ResponseWrapper(localName = "createAuteurResponse", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.CreateAuteurResponse")
    @Action(input = "http://services.webservice.org/AuteurWebservice/createAuteurRequest", output = "http://services.webservice.org/AuteurWebservice/createAuteurResponse")
    public void createAuteur(
        @WebParam(name = "arg0", targetNamespace = "")
        Auteur arg0);

    /**
     * 
     * @return
     *     returns java.util.List<org.webservice.services.Auteur>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listAuteurs", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.ListAuteurs")
    @ResponseWrapper(localName = "listAuteursResponse", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.ListAuteursResponse")
    @Action(input = "http://services.webservice.org/AuteurWebservice/listAuteursRequest", output = "http://services.webservice.org/AuteurWebservice/listAuteursResponse")
    public List<Auteur> listAuteurs();

}
