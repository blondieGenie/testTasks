
package ru.gismeteo.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "LocationsSoap", targetNamespace = "http://ws.gismeteo.ru/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LocationsSoap {


    /**
     * 
     * @param count
     * @param lng
     * @param language
     * @param user
     * @param lat
     * @return
     *     returns ru.gismeteo.ws.LocationInfoShortResult
     */
    @WebMethod(operationName = "FindByCoords", action = "http://ws.gismeteo.ru/FindByCoords")
    @WebResult(name = "FindByCoordsResult", targetNamespace = "http://ws.gismeteo.ru/")
    @RequestWrapper(localName = "FindByCoords", targetNamespace = "http://ws.gismeteo.ru/", className = "ru.gismeteo.ws.FindByCoords")
    @ResponseWrapper(localName = "FindByCoordsResponse", targetNamespace = "http://ws.gismeteo.ru/", className = "ru.gismeteo.ws.FindByCoordsResponse")
    public LocationInfoShortResult findByCoords(
        @WebParam(name = "user", targetNamespace = "http://ws.gismeteo.ru/")
        String user,
        @WebParam(name = "lat", targetNamespace = "http://ws.gismeteo.ru/")
        double lat,
        @WebParam(name = "lng", targetNamespace = "http://ws.gismeteo.ru/")
        double lng,
        @WebParam(name = "count", targetNamespace = "http://ws.gismeteo.ru/")
        int count,
        @WebParam(name = "language", targetNamespace = "http://ws.gismeteo.ru/")
        String language);

    /**
     * 
     * @param count
     * @param lng
     * @param language
     * @param user
     * @param lat
     * @return
     *     returns ru.gismeteo.ws.LocationInfoFullResult
     */
    @WebMethod(operationName = "FindByCoordsFull", action = "http://ws.gismeteo.ru/FindByCoordsFull")
    @WebResult(name = "FindByCoordsFullResult", targetNamespace = "http://ws.gismeteo.ru/")
    @RequestWrapper(localName = "FindByCoordsFull", targetNamespace = "http://ws.gismeteo.ru/", className = "ru.gismeteo.ws.FindByCoordsFull")
    @ResponseWrapper(localName = "FindByCoordsFullResponse", targetNamespace = "http://ws.gismeteo.ru/", className = "ru.gismeteo.ws.FindByCoordsFullResponse")
    public LocationInfoFullResult findByCoordsFull(
        @WebParam(name = "user", targetNamespace = "http://ws.gismeteo.ru/")
        String user,
        @WebParam(name = "lat", targetNamespace = "http://ws.gismeteo.ru/")
        double lat,
        @WebParam(name = "lng", targetNamespace = "http://ws.gismeteo.ru/")
        double lng,
        @WebParam(name = "count", targetNamespace = "http://ws.gismeteo.ru/")
        int count,
        @WebParam(name = "language", targetNamespace = "http://ws.gismeteo.ru/")
        String language);

    /**
     * 
     * @param count
     * @param name
     * @param language
     * @param serial
     * @return
     *     returns ru.gismeteo.ws.LocationInfoShortResult
     */
    @WebMethod(operationName = "FindByName", action = "http://ws.gismeteo.ru/FindByName")
    @WebResult(name = "FindByNameResult", targetNamespace = "http://ws.gismeteo.ru/")
    @RequestWrapper(localName = "FindByName", targetNamespace = "http://ws.gismeteo.ru/", className = "ru.gismeteo.ws.FindByName")
    @ResponseWrapper(localName = "FindByNameResponse", targetNamespace = "http://ws.gismeteo.ru/", className = "ru.gismeteo.ws.FindByNameResponse")
    public LocationInfoShortResult findByName(
        @WebParam(name = "serial", targetNamespace = "http://ws.gismeteo.ru/")
        String serial,
        @WebParam(name = "name", targetNamespace = "http://ws.gismeteo.ru/")
        String name,
        @WebParam(name = "count", targetNamespace = "http://ws.gismeteo.ru/")
        int count,
        @WebParam(name = "language", targetNamespace = "http://ws.gismeteo.ru/")
        String language);

    /**
     * 
     * @param count
     * @param name
     * @param language
     * @param serial
     * @return
     *     returns ru.gismeteo.ws.LocationInfoFullResult
     */
    @WebMethod(operationName = "FindByNameFull", action = "http://ws.gismeteo.ru/FindByNameFull")
    @WebResult(name = "FindByNameFullResult", targetNamespace = "http://ws.gismeteo.ru/")
    @RequestWrapper(localName = "FindByNameFull", targetNamespace = "http://ws.gismeteo.ru/", className = "ru.gismeteo.ws.FindByNameFull")
    @ResponseWrapper(localName = "FindByNameFullResponse", targetNamespace = "http://ws.gismeteo.ru/", className = "ru.gismeteo.ws.FindByNameFullResponse")
    public LocationInfoFullResult findByNameFull(
        @WebParam(name = "serial", targetNamespace = "http://ws.gismeteo.ru/")
        String serial,
        @WebParam(name = "name", targetNamespace = "http://ws.gismeteo.ru/")
        String name,
        @WebParam(name = "count", targetNamespace = "http://ws.gismeteo.ru/")
        int count,
        @WebParam(name = "language", targetNamespace = "http://ws.gismeteo.ru/")
        String language);

    /**
     * 
     * @param id
     * @param language
     * @param serial
     * @return
     *     returns ru.gismeteo.ws.GetNameResult
     */
    @WebMethod(operationName = "GetCountryName", action = "http://ws.gismeteo.ru/GetCountryName")
    @WebResult(name = "GetCountryNameResult", targetNamespace = "http://ws.gismeteo.ru/")
    @RequestWrapper(localName = "GetCountryName", targetNamespace = "http://ws.gismeteo.ru/", className = "ru.gismeteo.ws.GetCountryName")
    @ResponseWrapper(localName = "GetCountryNameResponse", targetNamespace = "http://ws.gismeteo.ru/", className = "ru.gismeteo.ws.GetCountryNameResponse")
    public GetNameResult getCountryName(
        @WebParam(name = "serial", targetNamespace = "http://ws.gismeteo.ru/")
        String serial,
        @WebParam(name = "id", targetNamespace = "http://ws.gismeteo.ru/")
        int id,
        @WebParam(name = "language", targetNamespace = "http://ws.gismeteo.ru/")
        String language);

    /**
     * 
     * @param id
     * @param language
     * @param serial
     * @return
     *     returns ru.gismeteo.ws.GetNameResult
     */
    @WebMethod(operationName = "GetRegionName", action = "http://ws.gismeteo.ru/GetRegionName")
    @WebResult(name = "GetRegionNameResult", targetNamespace = "http://ws.gismeteo.ru/")
    @RequestWrapper(localName = "GetRegionName", targetNamespace = "http://ws.gismeteo.ru/", className = "ru.gismeteo.ws.GetRegionName")
    @ResponseWrapper(localName = "GetRegionNameResponse", targetNamespace = "http://ws.gismeteo.ru/", className = "ru.gismeteo.ws.GetRegionNameResponse")
    public GetNameResult getRegionName(
        @WebParam(name = "serial", targetNamespace = "http://ws.gismeteo.ru/")
        String serial,
        @WebParam(name = "id", targetNamespace = "http://ws.gismeteo.ru/")
        int id,
        @WebParam(name = "language", targetNamespace = "http://ws.gismeteo.ru/")
        String language);

    /**
     * 
     * @param id
     * @param language
     * @param serial
     * @return
     *     returns ru.gismeteo.ws.GetNameResult
     */
    @WebMethod(operationName = "GetLocationName", action = "http://ws.gismeteo.ru/GetLocationName")
    @WebResult(name = "GetLocationNameResult", targetNamespace = "http://ws.gismeteo.ru/")
    @RequestWrapper(localName = "GetLocationName", targetNamespace = "http://ws.gismeteo.ru/", className = "ru.gismeteo.ws.GetLocationName")
    @ResponseWrapper(localName = "GetLocationNameResponse", targetNamespace = "http://ws.gismeteo.ru/", className = "ru.gismeteo.ws.GetLocationNameResponse")
    public GetNameResult getLocationName(
        @WebParam(name = "serial", targetNamespace = "http://ws.gismeteo.ru/")
        String serial,
        @WebParam(name = "id", targetNamespace = "http://ws.gismeteo.ru/")
        int id,
        @WebParam(name = "language", targetNamespace = "http://ws.gismeteo.ru/")
        String language);

}
