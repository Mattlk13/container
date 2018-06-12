package org.opentosca.container.core.model.deployment.plan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.PrimaryKey;
import org.opentosca.container.core.model.csar.id.CSARID;
import org.opentosca.container.core.model.deployment.AbstractFileDeploymentInfo;

/**
 * Deployment information of a Plan inside a CSAR file. It is used for tracking its deploy progress.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NamedQueries({@NamedQuery(name = PlanDeploymentInfo.getPlanDeploymentInfoByCSARIDAndRelPath,
                           query = PlanDeploymentInfo.getPlanDeploymentInfoByCSARIDAndRelPathQuery),
               @NamedQuery(name = PlanDeploymentInfo.getPlanDeploymentInfoByCSARID,
                           query = PlanDeploymentInfo.getPlanDeploymentInfoByCSARIDQuery)})
@Table(name = PlanDeploymentInfo.tableName)
@PrimaryKey(columns = {@Column(name = "csarID"), @Column(name = "RelPath")})
public class PlanDeploymentInfo extends AbstractFileDeploymentInfo {

    protected final static String tableName = "PlanDeploymentInfo";

    /*
     * JPQL Queries
     */
    public static final String getPlanDeploymentInfoByCSARIDAndRelPath = "PlanDeploymentInfo.ByCSARIDAndRelPath";
    protected static final String getPlanDeploymentInfoByCSARIDAndRelPathQuery =
        "select t from " + PlanDeploymentInfo.tableName + " t where t.relPath = :planRelPath and t.csarID = :csarID";

    public static final String getPlanDeploymentInfoByCSARID = "PlanDeploymentInfo.ByCSARID";
    protected static final String getPlanDeploymentInfoByCSARIDQuery =
        "select t from " + PlanDeploymentInfo.tableName + " t where t.csarID = :csarID";

    /**
     * Deployment state of this Plan.
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "DeploymentState")
    private PlanDeploymentState deploymentState;


    protected PlanDeploymentInfo() {

    }

    public PlanDeploymentInfo(final CSARID csarID, final String relPath, final PlanDeploymentState deploymentState) {
        super(csarID, relPath);
        this.deploymentState = deploymentState;
    }

    public PlanDeploymentState getDeploymentState() {
        return this.deploymentState;
    }

    public void setDeploymentState(final PlanDeploymentState deploymentState) {
        this.deploymentState = deploymentState;
    }
}
