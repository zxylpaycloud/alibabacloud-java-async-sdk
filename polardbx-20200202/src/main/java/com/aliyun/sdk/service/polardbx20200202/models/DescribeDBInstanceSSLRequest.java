// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceSSLRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBInstanceSSLRequest</p>
 */
public class DescribeDBInstanceSSLRequest extends Request {
    @Query
    @NameInMap("DBInstanceName")
    private String DBInstanceName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DescribeDBInstanceSSLRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceSSLRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeDBInstanceSSLRequest, Builder> {
        private String DBInstanceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBInstanceSSLRequest response) {
            super(response);
            this.DBInstanceName = response.DBInstanceName;
            this.regionId = response.regionId;
        } 

        /**
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
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
        public DescribeDBInstanceSSLRequest build() {
            return new DescribeDBInstanceSSLRequest(this);
        } 

    } 

}
