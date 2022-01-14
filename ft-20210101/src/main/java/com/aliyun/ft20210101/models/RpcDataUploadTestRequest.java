// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link RpcDataUploadTestRequest} extends {@link RequestModel}
 *
 * <p>RpcDataUploadTestRequest</p>
 */
public class RpcDataUploadTestRequest extends Request {

    private RpcDataUploadTestRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RpcDataUploadTestRequest create() {
        return builder().build();
    }

    public static final class Builder extends Request.Builder<Builder> {

        public RpcDataUploadTestRequest build() {
            return new RpcDataUploadTestRequest(this);
        } 

    } 

}
