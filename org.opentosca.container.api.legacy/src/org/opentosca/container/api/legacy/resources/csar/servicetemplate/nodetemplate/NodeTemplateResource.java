package org.opentosca.container.api.legacy.resources.csar.servicetemplate.nodetemplate;

import java.io.UnsupportedEncodingException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.namespace.QName;

import org.opentosca.container.api.legacy.resources.csar.servicetemplate.nodetemplate.instances.NodeTemplateInstancesResource;
import org.opentosca.container.api.legacy.resources.utilities.ResourceConstants;
import org.opentosca.container.api.legacy.resources.utilities.Utilities;
import org.opentosca.container.api.legacy.resources.xlink.Reference;
import org.opentosca.container.api.legacy.resources.xlink.References;
import org.opentosca.container.api.legacy.resources.xlink.XLinkConstants;
import org.opentosca.container.core.model.csar.id.CSARID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NodeTemplateResource {

    private final Logger log = LoggerFactory.getLogger(NodeTemplateResource.class);
    private final CSARID csarId;
    private final QName serviceTemplateID;
    private final int serviceTemplateInstanceId;
    private final QName nodeTemplateID;
    private UriInfo uriInfo;


    public NodeTemplateResource(final CSARID csarId, final QName serviceTemplateID, final int serviceTemplateInstanceId,
                                final String planIdLocalPart) {
        this.csarId = csarId;
        this.serviceTemplateID = serviceTemplateID;
        this.serviceTemplateInstanceId = serviceTemplateInstanceId;
        this.nodeTemplateID = new QName(serviceTemplateID.getNamespaceURI(), planIdLocalPart);
    }

    @GET
    @Produces(ResourceConstants.LINKED_XML)
    public Response getReferencesXML(@Context final UriInfo uriInfo) throws UnsupportedEncodingException {
        this.uriInfo = uriInfo;
        return Response.ok(this.getRefs().getXMLString()).build();
    }

    @GET
    @Produces(ResourceConstants.LINKED_JSON)
    public Response getReferencesJSON(@Context final UriInfo uriInfo) throws UnsupportedEncodingException {
        this.uriInfo = uriInfo;
        return Response.ok(this.getRefs().getJSONString()).build();
    }

    public References getRefs() throws UnsupportedEncodingException {

        if (this.csarId == null) {
            return null;
        }

        final References refs = new References();

        refs.getReference()
            .add(new Reference(Utilities.buildURI(this.uriInfo, "Instances"), XLinkConstants.SIMPLE, "Instances"));

        // selflink
        refs.getReference()
            .add(new Reference(this.uriInfo.getAbsolutePath().toString(), XLinkConstants.SIMPLE, XLinkConstants.SELF));

        return refs;
    }

    @Path("Instances")
    public NodeTemplateInstancesResource getNodeTemplateInstances() {
        return new NodeTemplateInstancesResource(this.csarId, this.serviceTemplateID, this.serviceTemplateInstanceId,
            this.nodeTemplateID);
    }
}
