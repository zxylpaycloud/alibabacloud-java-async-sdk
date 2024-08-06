// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterAuditProjectResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterAuditProjectResponseBody</p>
 */
public class GetClusterAuditProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("audit_enabled")
    private Boolean auditEnabled;

    @com.aliyun.core.annotation.NameInMap("sls_project_name")
    private String slsProjectName;

    private GetClusterAuditProjectResponseBody(Builder builder) {
        this.auditEnabled = builder.auditEnabled;
        this.slsProjectName = builder.slsProjectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterAuditProjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return auditEnabled
     */
    public Boolean getAuditEnabled() {
        return this.auditEnabled;
    }

    /**
     * @return slsProjectName
     */
    public String getSlsProjectName() {
        return this.slsProjectName;
    }

    public static final class Builder {
        private Boolean auditEnabled; 
        private String slsProjectName; 

        /**
         * audit_enabled.
         */
        public Builder auditEnabled(Boolean auditEnabled) {
            this.auditEnabled = auditEnabled;
            return this;
        }

        /**
         * sls_project_name.
         */
        public Builder slsProjectName(String slsProjectName) {
            this.slsProjectName = slsProjectName;
            return this;
        }

        public GetClusterAuditProjectResponseBody build() {
            return new GetClusterAuditProjectResponseBody(this);
        } 

    } 

}
