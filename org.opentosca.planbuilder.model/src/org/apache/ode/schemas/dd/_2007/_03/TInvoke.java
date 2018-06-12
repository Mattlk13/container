//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.05.27 at 03:40:55 PM CEST
//


package org.apache.ode.schemas.dd._2007._03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

import org.apache.ode.activityrecovery.FailureHandling;


/**
 * <p>
 * Java class for tInvoke complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tInvoke">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="service" type="{http://www.apache.org/ode/schemas/dd/2007/03}tService"/>
 *         &lt;element name="binding" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://ode.apache.org/activityRecovery}failureHandling" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="partnerLink" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="usePeer2Peer" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tInvoke", propOrder = {"service", "binding", "failureHandling"})
public class TInvoke {

    @XmlElement(required = true)
    protected TService service;
    protected TInvoke.Binding binding;
    @XmlElement(namespace = "http://ode.apache.org/activityRecovery")
    protected FailureHandling failureHandling;
    @XmlAttribute(required = true)
    protected String partnerLink;
    @XmlAttribute
    protected Boolean usePeer2Peer;

    /**
     * Gets the value of the service property.
     *
     * @return possible object is {@link TService }
     *
     */
    public TService getService() {
        return this.service;
    }

    /**
     * Sets the value of the service property.
     *
     * @param value allowed object is {@link TService }
     *
     */
    public void setService(final TService value) {
        this.service = value;
    }

    /**
     * Gets the value of the binding property.
     *
     * @return possible object is {@link TInvoke.Binding }
     *
     */
    public TInvoke.Binding getBinding() {
        return this.binding;
    }

    /**
     * Sets the value of the binding property.
     *
     * @param value allowed object is {@link TInvoke.Binding }
     *
     */
    public void setBinding(final TInvoke.Binding value) {
        this.binding = value;
    }

    /**
     * Gets the value of the failureHandling property.
     *
     * @return possible object is {@link FailureHandling }
     *
     */
    public FailureHandling getFailureHandling() {
        return this.failureHandling;
    }

    /**
     * Sets the value of the failureHandling property.
     *
     * @param value allowed object is {@link FailureHandling }
     *
     */
    public void setFailureHandling(final FailureHandling value) {
        this.failureHandling = value;
    }

    /**
     * Gets the value of the partnerLink property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPartnerLink() {
        return this.partnerLink;
    }

    /**
     * Sets the value of the partnerLink property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPartnerLink(final String value) {
        this.partnerLink = value;
    }

    /**
     * Gets the value of the usePeer2Peer property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public boolean isUsePeer2Peer() {
        if (this.usePeer2Peer == null) {
            return true;
        } else {
            return this.usePeer2Peer;
        }
    }

    /**
     * Sets the value of the usePeer2Peer property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setUsePeer2Peer(final Boolean value) {
        this.usePeer2Peer = value;
    }


    /**
     * <p>
     * Java class for anonymous complex type.
     *
     * <p>
     * The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Binding {

        @XmlAttribute(required = true)
        protected QName name;

        /**
         * Gets the value of the name property.
         *
         * @return possible object is {@link QName }
         *
         */
        public QName getName() {
            return this.name;
        }

        /**
         * Sets the value of the name property.
         *
         * @param value allowed object is {@link QName }
         *
         */
        public void setName(final QName value) {
            this.name = value;
        }

    }

}
