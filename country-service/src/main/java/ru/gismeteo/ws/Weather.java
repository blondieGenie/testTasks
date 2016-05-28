
package ru.gismeteo.ws;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import javax.jws.HandlerChain;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "Weather", targetNamespace = "http://ws.gismeteo.ru/", wsdlLocation = "http://ws.gismeteo.ru/Weather/Weather.asmx?wsdl")
@HandlerChain(file="/weather.xml")
public class Weather
    extends Service
{

    private final static URL WEATHER_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(ru.gismeteo.ws.Weather.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = ru.gismeteo.ws.Weather.class.getResource(".");
            url = new URL(baseUrl, "http://ws.gismeteo.ru/Weather/Weather.asmx?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://ws.gismeteo.ru/Weather/Weather.asmx?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        WEATHER_WSDL_LOCATION = url;
    }

    public Weather(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Weather() {
        super(WEATHER_WSDL_LOCATION, new QName("http://ws.gismeteo.ru/", "Weather"));
    }

    /**
     * 
     * @return
     *     returns WeatherSoap
     */
    @WebEndpoint(name = "WeatherSoap")
    public WeatherSoap getWeatherSoap() {
        return super.getPort(new QName("http://ws.gismeteo.ru/", "WeatherSoap"), WeatherSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherSoap
     */
    @WebEndpoint(name = "WeatherSoap")
    public WeatherSoap getWeatherSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.gismeteo.ru/", "WeatherSoap"), WeatherSoap.class, features);
    }

}
