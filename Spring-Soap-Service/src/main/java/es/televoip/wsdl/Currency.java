//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.11.26 a las 07:16:08 PM WET 
//


package es.televoip.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para currency.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="currency"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EUR"/&gt;
 *     &lt;enumeration value="PLN"/&gt;
 *     &lt;enumeration value="GBP"/&gt;
 *     &lt;enumeration value="CAD"/&gt;
 *     &lt;enumeration value="USD"/&gt;
 *     &lt;enumeration value="MXN"/&gt;
 *     &lt;enumeration value="BRL"/&gt;
 *     &lt;enumeration value="ARS"/&gt;
 *     &lt;enumeration value="JPY"/&gt;
 *     &lt;enumeration value="KRW"/&gt;
 *     &lt;enumeration value="CNY"/&gt;
 *     &lt;enumeration value="INR"/&gt;
 *     &lt;enumeration value="AUD"/&gt;
 *     &lt;enumeration value="ZAR"/&gt;
 *     &lt;enumeration value="RUB"/&gt;
 *     &lt;enumeration value="EGP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "currency")
@XmlEnum
public enum Currency {

    EUR,
    PLN,
    GBP,
    CAD,
    USD,
    MXN,
    BRL,
    ARS,
    JPY,
    KRW,
    CNY,
    INR,
    AUD,
    ZAR,
    RUB,
    EGP;

    public String value() {
        return name();
    }

    public static Currency fromValue(String v) {
        return valueOf(v);
    }

}
