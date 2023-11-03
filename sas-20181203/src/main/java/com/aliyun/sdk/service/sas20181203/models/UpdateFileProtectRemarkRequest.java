// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFileProtectRemarkRequest} extends {@link RequestModel}
 *
 * <p>UpdateFileProtectRemarkRequest</p>
 */
public class UpdateFileProtectRemarkRequest extends Request {
    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("Remark")
    private java.util.List < String > remark;

    private UpdateFileProtectRemarkRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFileProtectRemarkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return remark
     */
    public java.util.List < String > getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<UpdateFileProtectRemarkRequest, Builder> {
        private Long id; 
        private java.util.List < String > remark; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFileProtectRemarkRequest request) {
            super(request);
            this.id = request.id;
            this.remark = request.remark;
        } 

        /**
         * The ID of the event.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The remarks.
         */
        public Builder remark(java.util.List < String > remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public UpdateFileProtectRemarkRequest build() {
            return new UpdateFileProtectRemarkRequest(this);
        } 

    } 

}
