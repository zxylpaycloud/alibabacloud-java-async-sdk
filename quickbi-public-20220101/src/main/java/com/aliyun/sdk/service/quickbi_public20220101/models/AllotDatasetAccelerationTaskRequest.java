// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllotDatasetAccelerationTaskRequest} extends {@link RequestModel}
 *
 * <p>AllotDatasetAccelerationTaskRequest</p>
 */
public class AllotDatasetAccelerationTaskRequest extends Request {
    @Query
    @NameInMap("CubeId")
    @Validation(required = true)
    private String cubeId;

    private AllotDatasetAccelerationTaskRequest(Builder builder) {
        super(builder);
        this.cubeId = builder.cubeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllotDatasetAccelerationTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cubeId
     */
    public String getCubeId() {
        return this.cubeId;
    }

    public static final class Builder extends Request.Builder<AllotDatasetAccelerationTaskRequest, Builder> {
        private String cubeId; 

        private Builder() {
            super();
        } 

        private Builder(AllotDatasetAccelerationTaskRequest request) {
            super(request);
            this.cubeId = request.cubeId;
        } 

        /**
         * CubeId.
         */
        public Builder cubeId(String cubeId) {
            this.putQueryParameter("CubeId", cubeId);
            this.cubeId = cubeId;
            return this;
        }

        @Override
        public AllotDatasetAccelerationTaskRequest build() {
            return new AllotDatasetAccelerationTaskRequest(this);
        } 

    } 

}
