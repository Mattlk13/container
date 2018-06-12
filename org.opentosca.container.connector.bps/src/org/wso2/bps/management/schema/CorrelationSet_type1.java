
/**
 * CorrelationSet_type1.java
 *
 * This file was auto-generated from WSDL by the Apache Axis2 version: SNAPSHOT Built on : Nov 10,
 * 2010 (06:34:21 UTC)
 */


package org.wso2.bps.management.schema;


/**
 * CorrelationSet_type1 bean class
 */

public class CorrelationSet_type1 implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name = correlationSet_type1 Namespace
     * URI = http://wso2.org/bps/management/schema Namespace Prefix = ns1
     */


    /**
     *
     */
    private static final long serialVersionUID = -1416852611496067895L;

    /**
     * field for CorrelationProperty This was an Array!
     */


    protected org.wso2.bps.management.schema.CorrelationPropertyType[] localCorrelationProperty;

    /*
     * This tracker boolean wil be used to detect whether the user called the set method for this
     * attribute. It will be used to determine whether to include this field in the serialized XML
     */
    protected boolean localCorrelationPropertyTracker = false;


    /**
     * Auto generated getter method
     *
     * @return org.wso2.bps.management.schema.CorrelationPropertyType[]
     */
    public org.wso2.bps.management.schema.CorrelationPropertyType[] getCorrelationProperty() {
        return this.localCorrelationProperty;
    }



    /**
     * validate the array for CorrelationProperty
     */
    protected void validateCorrelationProperty(final org.wso2.bps.management.schema.CorrelationPropertyType[] param) {

    }


    /**
     * Auto generated setter method
     *
     * @param param CorrelationProperty
     */
    public void setCorrelationProperty(final org.wso2.bps.management.schema.CorrelationPropertyType[] param) {

        validateCorrelationProperty(param);

        this.localCorrelationPropertyTracker = param != null;

        this.localCorrelationProperty = param;
    }



    /**
     * Auto generated add method for the array for convenience
     *
     * @param param org.wso2.bps.management.schema.CorrelationPropertyType
     */
    public void addCorrelationProperty(final org.wso2.bps.management.schema.CorrelationPropertyType param) {
        if (this.localCorrelationProperty == null) {
            this.localCorrelationProperty = new org.wso2.bps.management.schema.CorrelationPropertyType[] {};
        }


        // update the setting tracker
        this.localCorrelationPropertyTracker = true;


        final java.util.List list =
            org.apache.axis2.databinding.utils.ConverterUtil.toList(this.localCorrelationProperty);
        list.add(param);
        this.localCorrelationProperty =
            (org.wso2.bps.management.schema.CorrelationPropertyType[]) list.toArray(new org.wso2.bps.management.schema.CorrelationPropertyType[list.size()]);

    }


    /**
     * field for Name This was an Attribute!
     */


    protected java.lang.String localName;


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getName() {
        return this.localName;
    }



    /**
     * Auto generated setter method
     *
     * @param param Name
     */
    public void setName(final java.lang.String param) {

        this.localName = param;


    }


    /**
     * field for Csetid This was an Attribute!
     */


    protected java.lang.String localCsetid;


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCsetid() {
        return this.localCsetid;
    }



    /**
     * Auto generated setter method
     *
     * @param param Csetid
     */
    public void setCsetid(final java.lang.String param) {

        this.localCsetid = param;


    }



    /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    @Override
    public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                                                      final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {



        final org.apache.axiom.om.OMDataSource dataSource =
            new org.apache.axis2.databinding.ADBDataSource(this, parentQName);
        return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(parentQName, factory, dataSource);

    }

    @Override
    public void serialize(final javax.xml.namespace.QName parentQName,
                          final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException,
                                                                            org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    @Override
    public void serialize(final javax.xml.namespace.QName parentQName, final javax.xml.stream.XMLStreamWriter xmlWriter,
                          final boolean serializeType) throws javax.xml.stream.XMLStreamException,
                                                       org.apache.axis2.databinding.ADBException {



        java.lang.String prefix = null;
        java.lang.String namespace = null;


        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

        if (serializeType) {


            final java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://wso2.org/bps/management/schema");
            if (namespacePrefix != null && namespacePrefix.trim().length() > 0) {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                               namespacePrefix + ":correlationSet_type1", xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "correlationSet_type1",
                               xmlWriter);
            }


        }

        if (this.localName != null) {

            writeAttribute("", "name", org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localName),
                           xmlWriter);


        }

        else {
            throw new org.apache.axis2.databinding.ADBException("required attribute localName is null");
        }

        if (this.localCsetid != null) {

            writeAttribute("", "csetid",
                           org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localCsetid),
                           xmlWriter);


        }

        else {
            throw new org.apache.axis2.databinding.ADBException("required attribute localCsetid is null");
        }
        if (this.localCorrelationPropertyTracker) {
            if (this.localCorrelationProperty != null) {
                for (final CorrelationPropertyType element : this.localCorrelationProperty) {
                    if (element != null) {
                        element.serialize(new javax.xml.namespace.QName("http://wso2.org/bps/management/schema",
                            "correlationProperty"), xmlWriter);
                    } else {

                        // we don't have to do any thing since minOccures is zero

                    }

                }
            } else {

                throw new org.apache.axis2.databinding.ADBException("correlationProperty cannot be null!!");

            }
        }
        xmlWriter.writeEndElement();


    }

    private static java.lang.String generatePrefix(final java.lang.String namespace) {
        if (namespace.equals("http://wso2.org/bps/management/schema")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix, final java.lang.String namespace,
                                   final java.lang.String localPart,
                                   final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        final java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
        if (writerPrefix != null) {
            xmlWriter.writeStartElement(namespace, localPart);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(final java.lang.String prefix, final java.lang.String namespace,
                                final java.lang.String attName, final java.lang.String attValue,
                                final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        if (xmlWriter.getPrefix(namespace) == null) {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
        xmlWriter.writeAttribute(namespace, attName, attValue);
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(final java.lang.String namespace, final java.lang.String attName,
                                final java.lang.String attValue,
                                final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }
    }


    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(final java.lang.String namespace, final java.lang.String attName,
                                     final javax.xml.namespace.QName qname,
                                     final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        final java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }

    /**
     * method to handle Qnames
     */

    private void writeQName(final javax.xml.namespace.QName qname,
                            final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        final java.lang.String namespaceURI = qname.getNamespaceURI();
        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":"
                    + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }
    }

    private void writeQNames(final javax.xml.namespace.QName[] qnames,
                             final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            final java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }
                namespaceURI = qnames[i].getNamespaceURI();
                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);
                    if (prefix == null || prefix.length() == 0) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            }
            xmlWriter.writeCharacters(stringToWrite.toString());
        }

    }


    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(final javax.xml.stream.XMLStreamWriter xmlWriter,
                                            final java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);
        if (prefix == null) {
            prefix = generatePrefix(namespace);
            while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
        return prefix;
    }



    /**
     * databinding method to get an XML representation of this object
     *
     */
    @Override
    public javax.xml.stream.XMLStreamReader getPullParser(final javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {



        final java.util.ArrayList elementList = new java.util.ArrayList();
        final java.util.ArrayList attribList = new java.util.ArrayList();

        if (this.localCorrelationPropertyTracker) {
            if (this.localCorrelationProperty != null) {
                for (final CorrelationPropertyType element : this.localCorrelationProperty) {

                    if (element != null) {
                        elementList.add(new javax.xml.namespace.QName("http://wso2.org/bps/management/schema",
                            "correlationProperty"));
                        elementList.add(element);
                    } else {

                        // nothing to do

                    }

                }
            } else {

                throw new org.apache.axis2.databinding.ADBException("correlationProperty cannot be null!!");

            }

        }
        attribList.add(new javax.xml.namespace.QName("", "name"));

        attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localName));

        attribList.add(new javax.xml.namespace.QName("", "csetid"));

        attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localCsetid));


        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
            attribList.toArray());



    }



    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {



        /**
         * static method to create the object Precondition: If this object is an element, the current or
         * next start element starts this object and any intervening reader events are ignorable If this
         * object is not an element, it is a complex type and the reader is at the event just after the
         * outer start element Postcondition: If this object is an element, the reader is positioned at its
         * end element If this object is a complex type, the reader is positioned at the end element of its
         * outer element
         */
        public static CorrelationSet_type1 parse(final javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            final CorrelationSet_type1 object = new CorrelationSet_type1();

            final int event;
            final java.lang.String nillableValue = null;
            final java.lang.String prefix = "";
            final java.lang.String namespaceuri = "";
            try {

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }


                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    final java.lang.String fullTypeName =
                        reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;
                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                        }
                        nsPrefix = nsPrefix == null ? "" : nsPrefix;

                        final java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                        if (!"correlationSet_type1".equals(type)) {
                            // find namespace for the prefix
                            final java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (CorrelationSet_type1) org.wso2.bps.management.wsdl.instancemanagement.ExtensionMapper.getTypeObject(nsUri,
                                                                                                                                        type,
                                                                                                                                        reader);
                        }


                    }


                }



                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                final java.util.Vector handledAttributes = new java.util.Vector();



                // handle attribute "name"
                final java.lang.String tempAttribName =

                    reader.getAttributeValue(null, "name");

                if (tempAttribName != null) {
                    final java.lang.String content = tempAttribName;

                    object.setName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribName));

                } else {

                    throw new org.apache.axis2.databinding.ADBException("Required attribute name is missing");

                }
                handledAttributes.add("name");

                // handle attribute "csetid"
                final java.lang.String tempAttribCsetid =

                    reader.getAttributeValue(null, "csetid");

                if (tempAttribCsetid != null) {
                    final java.lang.String content = tempAttribCsetid;

                    object.setCsetid(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribCsetid));

                } else {

                    throw new org.apache.axis2.databinding.ADBException("Required attribute csetid is missing");

                }
                handledAttributes.add("csetid");


                reader.next();

                final java.util.ArrayList list1 = new java.util.ArrayList();


                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://wso2.org/bps/management/schema",
                    "correlationProperty").equals(reader.getName())) {



                    // Process the array and step past its final element's end.
                    list1.add(org.wso2.bps.management.schema.CorrelationPropertyType.Factory.parse(reader));

                    // loop until we find a start element that is not part of this array
                    boolean loopDone1 = false;
                    while (!loopDone1) {
                        // We should be at the end element, but make sure
                        while (!reader.isEndElement()) {
                            reader.next();
                        }
                        // Step out of this element
                        reader.next();
                        // Step to next element event.
                        while (!reader.isStartElement() && !reader.isEndElement()) {
                            reader.next();
                        }
                        if (reader.isEndElement()) {
                            // two continuous end elements means we are exiting the xml structure
                            loopDone1 = true;
                        } else {
                            if (new javax.xml.namespace.QName("http://wso2.org/bps/management/schema",
                                "correlationProperty").equals(reader.getName())) {
                                list1.add(org.wso2.bps.management.schema.CorrelationPropertyType.Factory.parse(reader));

                            } else {
                                loopDone1 = true;
                            }
                        }
                    }
                    // call the converter utility to convert and set the array

                    object.setCorrelationProperty((org.wso2.bps.management.schema.CorrelationPropertyType[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(org.wso2.bps.management.schema.CorrelationPropertyType.class,
                                                                                                                                                                             list1));

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }

                if (reader.isStartElement()) {
                    // A start element we are not expecting indicates a trailing invalid
                    // property
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getLocalName());
                }



            }
            catch (final javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

    }// end of factory class



}

