// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateABTestSceneRequest} extends {@link RequestModel}
 *
 * <p>CreateABTestSceneRequest</p>
 */
public class CreateABTestSceneRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    private CreateABTestSceneRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateABTestSceneRequest create() {
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

    public static final class Builder extends Request.Builder<CreateABTestSceneRequest, Builder> {
        private String appGroupIdentity; 

        private Builder() {
            super();
        } 

        private Builder(CreateABTestSceneRequest response) {
            super(response);
            this.appGroupIdentity = response.appGroupIdentity;
        } 

        /**
         * appGroupIdentity.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        @Override
        public CreateABTestSceneRequest build() {
            return new CreateABTestSceneRequest(this);
        } 

    } 

}
