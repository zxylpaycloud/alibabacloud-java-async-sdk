// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dg20190327.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDatabaseAccessPointRequest} extends {@link RequestModel}
 *
 * <p>CreateDatabaseAccessPointRequest</p>
 */
public class CreateDatabaseAccessPointRequest extends Request {
    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("DbInstanceId")
    @Validation(required = true)
    private String dbInstanceId;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("VSwitchId")
    @Validation(required = true)
    private String vSwitchId;

    @Body
    @NameInMap("VpcAZone")
    @Validation(required = true)
    private String vpcAZone;

    @Body
    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    @Body
    @NameInMap("VpcRegionId")
    @Validation(required = true)
    private String vpcRegionId;

    private CreateDatabaseAccessPointRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dbInstanceId = builder.dbInstanceId;
        this.regionId = builder.regionId;
        this.vSwitchId = builder.vSwitchId;
        this.vpcAZone = builder.vpcAZone;
        this.vpcId = builder.vpcId;
        this.vpcRegionId = builder.vpcRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatabaseAccessPointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dbInstanceId
     */
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcAZone
     */
    public String getVpcAZone() {
        return this.vpcAZone;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vpcRegionId
     */
    public String getVpcRegionId() {
        return this.vpcRegionId;
    }

    public static final class Builder extends Request.Builder<CreateDatabaseAccessPointRequest, Builder> {
        private String clientToken; 
        private String dbInstanceId; 
        private String regionId; 
        private String vSwitchId; 
        private String vpcAZone; 
        private String vpcId; 
        private String vpcRegionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatabaseAccessPointRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dbInstanceId = request.dbInstanceId;
            this.regionId = request.regionId;
            this.vSwitchId = request.vSwitchId;
            this.vpcAZone = request.vpcAZone;
            this.vpcId = request.vpcId;
            this.vpcRegionId = request.vpcRegionId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DbInstanceId.
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.putBodyParameter("DbInstanceId", dbInstanceId);
            this.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putBodyParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VpcAZone.
         */
        public Builder vpcAZone(String vpcAZone) {
            this.putBodyParameter("VpcAZone", vpcAZone);
            this.vpcAZone = vpcAZone;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * VpcRegionId.
         */
        public Builder vpcRegionId(String vpcRegionId) {
            this.putBodyParameter("VpcRegionId", vpcRegionId);
            this.vpcRegionId = vpcRegionId;
            return this;
        }

        @Override
        public CreateDatabaseAccessPointRequest build() {
            return new CreateDatabaseAccessPointRequest(this);
        } 

    } 

}
