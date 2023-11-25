// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkAppMetricsRequest} extends {@link RequestModel}
 *
 * <p>GetSparkAppMetricsRequest</p>
 */
public class GetSparkAppMetricsRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true, maxLength = 64)
    private String appId;

    @Query
    @NameInMap("DBClusterId")
    private String DBClusterId;

    private GetSparkAppMetricsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.DBClusterId = builder.DBClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkAppMetricsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public static final class Builder extends Request.Builder<GetSparkAppMetricsRequest, Builder> {
        private String appId; 
        private String DBClusterId; 

        private Builder() {
            super();
        } 

        private Builder(GetSparkAppMetricsRequest request) {
            super(request);
            this.appId = request.appId;
            this.DBClusterId = request.DBClusterId;
        } 

        /**
         * The ID of the Spark application.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        @Override
        public GetSparkAppMetricsRequest build() {
            return new GetSparkAppMetricsRequest(this);
        } 

    } 

}
