//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.04.02 at 04:58:44 PM CEST
//


package org.oasis_open.docs.tosca.ns._2011._12;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import org.w3c.dom.Element;


/**
 * <p>
 * Java class for tRelationshipTemplate complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tRelationshipTemplate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/tosca/ns/2011/12}tEntityTemplate">
 *       &lt;sequence>
 *         &lt;element name="SourceElement">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TargetElement">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RelationshipConstraints" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RelationshipConstraint" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;any processContents='lax' namespace='##other' minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="constraintType" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRelationshipTemplate", propOrder = {"sourceElement", "targetElement", "relationshipConstraints"})
public class TRelationshipTemplate extends TEntityTemplate {

    @XmlElement(name = "SourceElement", required = true)
    protected TRelationshipTemplate.SourceElement sourceElement;
    @XmlElement(name = "TargetElement", required = true)
    protected TRelationshipTemplate.TargetElement targetElement;
    @XmlElement(name = "RelationshipConstraints")
    protected TRelationshipTemplate.RelationshipConstraints relationshipConstraints;
    @XmlAttribute
    protected String name;

    /**
     * Gets the value of the sourceElement property.
     *
     * @return possible object is {@link TRelationshipTemplate.SourceElement }
     *
     */
    public TRelationshipTemplate.SourceElement getSourceElement() {
        return this.sourceElement;
    }

    /**
     * Sets the value of the sourceElement property.
     *
     * @param value allowed object is {@link TRelationshipTemplate.SourceElement }
     *
     */
    public void setSourceElement(final TRelationshipTemplate.SourceElement value) {
        this.sourceElement = value;
    }

    /**
     * Gets the value of the targetElement property.
     *
     * @return possible object is {@link TRelationshipTemplate.TargetElement }
     *
     */
    public TRelationshipTemplate.TargetElement getTargetElement() {
        return this.targetElement;
    }

    /**
     * Sets the value of the targetElement property.
     *
     * @param value allowed object is {@link TRelationshipTemplate.TargetElement }
     *
     */
    public void setTargetElement(final TRelationshipTemplate.TargetElement value) {
        this.targetElement = value;
    }

    /**
     * Gets the value of the relationshipConstraints property.
     *
     * @return possible object is {@link TRelationshipTemplate.RelationshipConstraints }
     *
     */
    public TRelationshipTemplate.RelationshipConstraints getRelationshipConstraints() {
        return this.relationshipConstraints;
    }

    /**
     * Sets the value of the relationshipConstraints property.
     *
     * @param value allowed object is {@link TRelationshipTemplate.RelationshipConstraints }
     *
     */
    public void setRelationshipConstraints(final TRelationshipTemplate.RelationshipConstraints value) {
        this.relationshipConstraints = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setName(final String value) {
        this.name = value;
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
     *       &lt;sequence>
     *         &lt;element name="RelationshipConstraint" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;any processContents='lax' namespace='##other' minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="constraintType" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"relationshipConstraint"})
    public static class RelationshipConstraints {

        @XmlElement(name = "RelationshipConstraint", required = true)
        protected List<TRelationshipTemplate.RelationshipConstraints.RelationshipConstraint> relationshipConstraint;

        /**
         * Gets the value of the relationshipConstraint property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any
         * modification you make to the returned list will be present inside the JAXB object. This is why
         * there is not a <CODE>set</CODE> method for the relationshipConstraint property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         *
         * <pre>
         * getRelationshipConstraint().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TRelationshipTemplate.RelationshipConstraints.RelationshipConstraint }
         *
         *
         */
        public List<TRelationshipTemplate.RelationshipConstraints.RelationshipConstraint> getRelationshipConstraint() {
            if (this.relationshipConstraint == null) {
                this.relationshipConstraint = new ArrayList<>();
            }
            return this.relationshipConstraint;
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
         *       &lt;sequence>
         *         &lt;any processContents='lax' namespace='##other' minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="constraintType" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"any"})
        public static class RelationshipConstraint {

            @XmlAnyElement(lax = true)
            protected Object any;
            @XmlAttribute(required = true)
            @XmlSchemaType(name = "anyURI")
            protected String constraintType;

            /**
             * Gets the value of the any property.
             *
             * @return possible object is {@link Object } {@link Element }
             *
             */
            public Object getAny() {
                return this.any;
            }

            /**
             * Sets the value of the any property.
             *
             * @param value allowed object is {@link Object } {@link Element }
             *
             */
            public void setAny(final Object value) {
                this.any = value;
            }

            /**
             * Gets the value of the constraintType property.
             *
             * @return possible object is {@link String }
             *
             */
            public String getConstraintType() {
                return this.constraintType;
            }

            /**
             * Sets the value of the constraintType property.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setConstraintType(final String value) {
                this.constraintType = value;
            }

        }

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
     *       &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SourceElement {

        @XmlAttribute(required = true)
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object ref;

        /**
         * Gets the value of the ref property.
         *
         * @return possible object is {@link Object }
         *
         */
        public Object getRef() {
            return this.ref;
        }

        /**
         * Sets the value of the ref property.
         *
         * @param value allowed object is {@link Object }
         *
         */
        public void setRef(final Object value) {
            this.ref = value;
        }

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
     *       &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TargetElement {

        @XmlAttribute(required = true)
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object ref;

        /**
         * Gets the value of the ref property.
         *
         * @return possible object is {@link Object }
         *
         */
        public Object getRef() {
            return this.ref;
        }

        /**
         * Sets the value of the ref property.
         *
         * @param value allowed object is {@link Object }
         *
         */
        public void setRef(final Object value) {
            this.ref = value;
        }

    }

}
