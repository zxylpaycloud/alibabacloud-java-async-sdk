// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOrganizationDeletableRequest} extends {@link RequestModel}
 *
 * <p>QueryOrganizationDeletableRequest</p>
 */
public class QueryOrganizationDeletableRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Location")
    private String location;

    @Query
    @NameInMap("OrganizationId")
    @Validation(required = true)
    private String organizationId;

    private QueryOrganizationDeletableRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.location = builder.location;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOrganizationDeletableRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<QueryOrganizationDeletableRequest, Builder> {
        private String regionId; 
        private String location; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(QueryOrganizationDeletableRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.location = request.location;
            this.organizationId = request.organizationId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Location.
         */
        public Builder location(String location) {
            this.putBodyParameter("Location", location);
            this.location = location;
            return this;
        }

        /**
         * OrganizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("OrganizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public QueryOrganizationDeletableRequest build() {
            return new QueryOrganizationDeletableRequest(this);
        } 

    } 

}
