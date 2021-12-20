// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link SignalResourceRequest} extends {@link RequestModel}
 *
 * <p>SignalResourceRequest</p>
 */
public class SignalResourceRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("LogicalResourceId")
    private String logicalResourceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StackId")
    private String stackId;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("UniqueId")
    private String uniqueId;


    private SignalResourceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.logicalResourceId = builder.logicalResourceId;
        this.regionId = builder.regionId;
        this.stackId = builder.stackId;
        this.status = builder.status;
        this.uniqueId = builder.uniqueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SignalResourceRequest create() {
        return builder().build();
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return logicalResourceId
     */
    public String getLogicalResourceId() {
        return this.logicalResourceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return uniqueId
     */
    public String getUniqueId() {
        return this.uniqueId;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String clientToken; 
        private String logicalResourceId; 
        private String regionId; 
        private String stackId; 
        private String status; 
        private String uniqueId; 

        /**
         * <p>ClientToken.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>LogicalResourceId.</p>
         */
        public Builder logicalResourceId(String logicalResourceId) {
            this.putQueryParameter("LogicalResourceId", logicalResourceId);
            this.logicalResourceId = logicalResourceId;
            return this;
        }

        /**
         * <p>RegionId.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>StackId.</p>
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        /**
         * <p>Status.</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>UniqueId.</p>
         */
        public Builder uniqueId(String uniqueId) {
            this.putQueryParameter("UniqueId", uniqueId);
            this.uniqueId = uniqueId;
            return this;
        }

        public SignalResourceRequest build() {
            return new SignalResourceRequest(this);
        } 

    } 

}
