// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetailSceneRequest} extends {@link RequestModel}
 *
 * <p>DetailSceneRequest</p>
 */
public class DetailSceneRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    private DetailSceneRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetailSceneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DetailSceneRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(DetailSceneRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * 场景Id
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DetailSceneRequest build() {
            return new DetailSceneRequest(this);
        } 

    } 

}
