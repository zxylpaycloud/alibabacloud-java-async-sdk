// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebLockTotalFileChangeCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeWebLockTotalFileChangeCountRequest</p>
 */
public class DescribeWebLockTotalFileChangeCountRequest extends Request {
    private DescribeWebLockTotalFileChangeCountRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebLockTotalFileChangeCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeWebLockTotalFileChangeCountRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeWebLockTotalFileChangeCountRequest request) {
            super(request);
        } 

        @Override
        public DescribeWebLockTotalFileChangeCountRequest build() {
            return new DescribeWebLockTotalFileChangeCountRequest(this);
        } 

    } 

}
