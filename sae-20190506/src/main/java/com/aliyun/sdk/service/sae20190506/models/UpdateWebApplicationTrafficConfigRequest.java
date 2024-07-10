// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWebApplicationTrafficConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateWebApplicationTrafficConfigRequest</p>
 */
public class UpdateWebApplicationTrafficConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateWebApplicationTrafficConfigInput body;

    private UpdateWebApplicationTrafficConfigRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.namespaceId = builder.namespaceId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWebApplicationTrafficConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return body
     */
    public UpdateWebApplicationTrafficConfigInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateWebApplicationTrafficConfigRequest, Builder> {
        private String applicationId; 
        private String namespaceId; 
        private UpdateWebApplicationTrafficConfigInput body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWebApplicationTrafficConfigRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.namespaceId = request.namespaceId;
            this.body = request.body;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.putPathParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(UpdateWebApplicationTrafficConfigInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateWebApplicationTrafficConfigRequest build() {
            return new UpdateWebApplicationTrafficConfigRequest(this);
        } 

    } 

}
