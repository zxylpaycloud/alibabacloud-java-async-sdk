// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopDataSetRequest} extends {@link RequestModel}
 *
 * <p>StopDataSetRequest</p>
 */
public class StopDataSetRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("VersionId")
    @Validation(required = true)
    private String versionId;

    private StopDataSetRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopDataSetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<StopDataSetRequest, Builder> {
        private String instanceId; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(StopDataSetRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.versionId = response.versionId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * VersionId.
         */
        public Builder versionId(String versionId) {
            this.putPathParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public StopDataSetRequest build() {
            return new StopDataSetRequest(this);
        } 

    } 

}
