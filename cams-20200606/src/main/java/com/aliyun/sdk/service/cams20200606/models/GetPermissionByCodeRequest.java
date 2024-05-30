// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPermissionByCodeRequest} extends {@link RequestModel}
 *
 * <p>GetPermissionByCodeRequest</p>
 */
public class GetPermissionByCodeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    private String custSpaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Permissions")
    private java.util.List < String > permissions;

    private GetPermissionByCodeRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.custSpaceId = builder.custSpaceId;
        this.permissions = builder.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPermissionByCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return permissions
     */
    public java.util.List < String > getPermissions() {
        return this.permissions;
    }

    public static final class Builder extends Request.Builder<GetPermissionByCodeRequest, Builder> {
        private String code; 
        private String custSpaceId; 
        private java.util.List < String > permissions; 

        private Builder() {
            super();
        } 

        private Builder(GetPermissionByCodeRequest request) {
            super(request);
            this.code = request.code;
            this.custSpaceId = request.custSpaceId;
            this.permissions = request.permissions;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.putBodyParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * CustSpaceId.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putBodyParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * Permissions.
         */
        public Builder permissions(java.util.List < String > permissions) {
            String permissionsShrink = shrink(permissions, "Permissions", "json");
            this.putBodyParameter("Permissions", permissionsShrink);
            this.permissions = permissions;
            return this;
        }

        @Override
        public GetPermissionByCodeRequest build() {
            return new GetPermissionByCodeRequest(this);
        } 

    } 

}
