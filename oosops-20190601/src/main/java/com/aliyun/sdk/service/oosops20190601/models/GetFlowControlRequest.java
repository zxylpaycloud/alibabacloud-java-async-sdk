// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFlowControlRequest} extends {@link RequestModel}
 *
 * <p>GetFlowControlRequest</p>
 */
public class GetFlowControlRequest extends Request {
    @Query
    @NameInMap("Api")
    private String api;

    @Query
    @NameInMap("Service")
    private String service;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private Integer type;

    @Query
    @NameInMap("Uid")
    private String uid;

    private GetFlowControlRequest(Builder builder) {
        super(builder);
        this.api = builder.api;
        this.service = builder.service;
        this.type = builder.type;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFlowControlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return api
     */
    public String getApi() {
        return this.api;
    }

    /**
     * @return service
     */
    public String getService() {
        return this.service;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<GetFlowControlRequest, Builder> {
        private String api; 
        private String service; 
        private Integer type; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(GetFlowControlRequest request) {
            super(request);
            this.api = request.api;
            this.service = request.service;
            this.type = request.type;
            this.uid = request.uid;
        } 

        /**
         * Api.
         */
        public Builder api(String api) {
            this.putQueryParameter("Api", api);
            this.api = api;
            return this;
        }

        /**
         * Service.
         */
        public Builder service(String service) {
            this.putQueryParameter("Service", service);
            this.service = service;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(String uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public GetFlowControlRequest build() {
            return new GetFlowControlRequest(this);
        } 

    } 

}
