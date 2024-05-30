// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryWabaBusinessInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryWabaBusinessInfoRequest</p>
 */
public class QueryWabaBusinessInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WabaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wabaId;

    private QueryWabaBusinessInfoRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.wabaId = builder.wabaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryWabaBusinessInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return wabaId
     */
    public String getWabaId() {
        return this.wabaId;
    }

    public static final class Builder extends Request.Builder<QueryWabaBusinessInfoRequest, Builder> {
        private String custSpaceId; 
        private String wabaId; 

        private Builder() {
            super();
        } 

        private Builder(QueryWabaBusinessInfoRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.wabaId = request.wabaId;
        } 

        /**
         * The space ID of the user under the independent software vendor (ISV) account.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * The ID of the WABA.
         */
        public Builder wabaId(String wabaId) {
            this.putQueryParameter("WabaId", wabaId);
            this.wabaId = wabaId;
            return this;
        }

        @Override
        public QueryWabaBusinessInfoRequest build() {
            return new QueryWabaBusinessInfoRequest(this);
        } 

    } 

}
