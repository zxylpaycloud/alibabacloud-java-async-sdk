// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIdcProbeRequest} extends {@link RequestModel}
 *
 * <p>DeleteIdcProbeRequest</p>
 */
public class DeleteIdcProbeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuid;

    private DeleteIdcProbeRequest(Builder builder) {
        super(builder);
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIdcProbeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<DeleteIdcProbeRequest, Builder> {
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIdcProbeRequest request) {
            super(request);
            this.uuid = request.uuid;
        } 

        /**
         * The UUID of the server.
         * <p>
         * 
         * >  You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public DeleteIdcProbeRequest build() {
            return new DeleteIdcProbeRequest(this);
        } 

    } 

}
