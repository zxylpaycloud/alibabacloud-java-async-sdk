// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecondRankRequest} extends {@link RequestModel}
 *
 * <p>DescribeSecondRankRequest</p>
 */
public class DescribeSecondRankRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("appId")
    @Validation(required = true)
    private Integer appId;

    @Path
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    private DescribeSecondRankRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.appId = builder.appId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecondRankRequest create() {
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

    /**
     * @return appId
     */
    public Integer getAppId() {
        return this.appId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<DescribeSecondRankRequest, Builder> {
        private String appGroupIdentity; 
        private Integer appId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSecondRankRequest response) {
            super(response);
            this.appGroupIdentity = response.appGroupIdentity;
            this.appId = response.appId;
            this.name = response.name;
        } 

        /**
         * appGroupIdentity.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * appId.
         */
        public Builder appId(Integer appId) {
            this.putPathParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public DescribeSecondRankRequest build() {
            return new DescribeSecondRankRequest(this);
        } 

    } 

}
