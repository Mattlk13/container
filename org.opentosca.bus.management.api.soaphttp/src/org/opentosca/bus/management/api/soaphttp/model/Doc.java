//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2018.07.16 at 01:55:00 PM CEST
//


package org.opentosca.bus.management.api.soaphttp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;

import org.w3c.dom.Element;


/**
 * <p>
 * Java class for Doc complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Doc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='skip' minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Doc", propOrder = {"any"})
public class Doc {

    @XmlAnyElement
    protected Element any;

    /**
     * Gets the value of the any property.
     *
     * @return possible object is {@link Element }
     *
     */
    public Element getAny() {
        return this.any;
    }

    /**
     * Sets the value of the any property.
     *
     * @param value allowed object is {@link Element }
     *
     */
    public void setAny(final Element value) {
        this.any = value;
    }

}
