//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.18 at 08:57:29 AM CEST 
//


package org.woped.file.yawl.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DirectionModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DirectionModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="input"/>
 *     &lt;enumeration value="output"/>
 *     &lt;enumeration value="both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DirectionModeType")
@XmlEnum
public enum DirectionModeType {

    @XmlEnumValue("input")
    INPUT("input"),
    @XmlEnumValue("output")
    OUTPUT("output"),
    @XmlEnumValue("both")
    BOTH("both");
    private final String value;

    DirectionModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DirectionModeType fromValue(String v) {
        for (DirectionModeType c: DirectionModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
