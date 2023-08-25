// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLabelRequest} extends {@link RequestModel}
 *
 * <p>CreateLabelRequest</p>
 */
public class CreateLabelRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private CreateLabelRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLabelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreateLabelRequest, Builder> {
        private String regionId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateLabelRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.name = request.name;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateLabelRequest build() {
            return new CreateLabelRequest(this);
        } 

    } 

}
