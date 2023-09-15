// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecurityIPListRequest} extends {@link RequestModel}
 *
 * <p>DescribeSecurityIPListRequest</p>
 */
public class DescribeSecurityIPListRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DescribeSecurityIPListRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityIPListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeSecurityIPListRequest, Builder> {
        private String DBInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSecurityIPListRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.regionId = request.regionId;
        } 

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeSecurityIPListRequest build() {
            return new DescribeSecurityIPListRequest(this);
        } 

    } 

}
