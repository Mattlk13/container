
/**
 * PackageManagementException.java
 *
 * This file was auto-generated from WSDL by the Apache Axis2 version: SNAPSHOT Built on : Nov 10,
 * 2010 (06:33:10 UTC)
 */

package org.wso2.bps.management.wsdl.bpelpackagemanagement;

public class PackageManagementException extends java.lang.Exception {

    private static final long serialVersionUID = 1330000208818L;

    private org.wso2.bps.management.schema.PackageManagementException faultMessage;


    public PackageManagementException() {
        super("PackageManagementException");
    }

    public PackageManagementException(final java.lang.String s) {
        super(s);
    }

    public PackageManagementException(final java.lang.String s, final java.lang.Throwable ex) {
        super(s, ex);
    }

    public PackageManagementException(final java.lang.Throwable cause) {
        super(cause);
    }


    public void setFaultMessage(final org.wso2.bps.management.schema.PackageManagementException msg) {
        this.faultMessage = msg;
    }

    public org.wso2.bps.management.schema.PackageManagementException getFaultMessage() {
        return this.faultMessage;
    }
}
