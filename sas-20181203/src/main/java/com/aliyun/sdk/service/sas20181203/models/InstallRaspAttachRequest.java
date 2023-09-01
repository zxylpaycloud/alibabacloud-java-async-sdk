// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallRaspAttachRequest} extends {@link RequestModel}
 *
 * <p>InstallRaspAttachRequest</p>
 */
public class InstallRaspAttachRequest extends Request {
    @Query
    @NameInMap("ApplicationId")
    @Validation(required = true)
    private String applicationId;

    @Query
    @NameInMap("EcsUUIDList")
    private java.util.List < String > ecsUUIDList;

    private InstallRaspAttachRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.ecsUUIDList = builder.ecsUUIDList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallRaspAttachRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return ecsUUIDList
     */
    public java.util.List < String > getEcsUUIDList() {
        return this.ecsUUIDList;
    }

    public static final class Builder extends Request.Builder<InstallRaspAttachRequest, Builder> {
        private String applicationId; 
        private java.util.List < String > ecsUUIDList; 

        private Builder() {
            super();
        } 

        private Builder(InstallRaspAttachRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.ecsUUIDList = request.ecsUUIDList;
        } 

        /**
         * The application group ID.
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * The UUIDs of ECS instances on which the RASP agent is to be installed.
         */
        public Builder ecsUUIDList(java.util.List < String > ecsUUIDList) {
            this.putQueryParameter("EcsUUIDList", ecsUUIDList);
            this.ecsUUIDList = ecsUUIDList;
            return this;
        }

        @Override
        public InstallRaspAttachRequest build() {
            return new InstallRaspAttachRequest(this);
        } 

    } 

}
