// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindESUserAnalyzerRequest} extends {@link RequestModel}
 *
 * <p>UnbindESUserAnalyzerRequest</p>
 */
public class UnbindESUserAnalyzerRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("esInstanceId")
    @Validation(required = true)
    private String esInstanceId;

    private UnbindESUserAnalyzerRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.esInstanceId = builder.esInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindESUserAnalyzerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return esInstanceId
     */
    public String getEsInstanceId() {
        return this.esInstanceId;
    }

    public static final class Builder extends Request.Builder<UnbindESUserAnalyzerRequest, Builder> {
        private String appGroupIdentity; 
        private String esInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(UnbindESUserAnalyzerRequest response) {
            super(response);
            this.appGroupIdentity = response.appGroupIdentity;
            this.esInstanceId = response.esInstanceId;
        } 

        /**
         * appGroupIdentity.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * esInstanceId.
         */
        public Builder esInstanceId(String esInstanceId) {
            this.putPathParameter("esInstanceId", esInstanceId);
            this.esInstanceId = esInstanceId;
            return this;
        }

        @Override
        public UnbindESUserAnalyzerRequest build() {
            return new UnbindESUserAnalyzerRequest(this);
        } 

    } 

}
