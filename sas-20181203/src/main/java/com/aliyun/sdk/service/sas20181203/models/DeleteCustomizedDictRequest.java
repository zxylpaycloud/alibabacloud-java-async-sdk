// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCustomizedDictRequest} extends {@link RequestModel}
 *
 * <p>DeleteCustomizedDictRequest</p>
 */
public class DeleteCustomizedDictRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private DeleteCustomizedDictRequest(Builder builder) {
        super(builder);
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCustomizedDictRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DeleteCustomizedDictRequest, Builder> {
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCustomizedDictRequest request) {
            super(request);
            this.sourceIp = request.sourceIp;
        } 

        /**
         * The source IP address.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DeleteCustomizedDictRequest build() {
            return new DeleteCustomizedDictRequest(this);
        } 

    } 

}
