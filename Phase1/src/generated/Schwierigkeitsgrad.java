//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.15 um 01:57:35 AM CEST 
//


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für schwierigkeitsgrad.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="schwierigkeitsgrad">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="simple"/>
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="pfiffig"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "schwierigkeitsgrad")
@XmlEnum
public enum Schwierigkeitsgrad {

    @XmlEnumValue("simple")
    SIMPLE("simple"),
    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("pfiffig")
    PFIFFIG("pfiffig");
    private final String value;

    Schwierigkeitsgrad(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Schwierigkeitsgrad fromValue(String v) {
        for (Schwierigkeitsgrad c: Schwierigkeitsgrad.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
