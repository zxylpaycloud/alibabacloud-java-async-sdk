// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainCustomLogConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainCustomLogConfigResponseBody</p>
 */
public class DescribeDomainCustomLogConfigResponseBody extends TeaModel {
    @NameInMap("ConfigId")
    private String configId;

    @NameInMap("Remark")
    private String remark;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Sample")
    private String sample;

    @NameInMap("Tag")
    private String tag;

    private DescribeDomainCustomLogConfigResponseBody(Builder builder) {
        this.configId = builder.configId;
        this.remark = builder.remark;
        this.requestId = builder.requestId;
        this.sample = builder.sample;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainCustomLogConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sample
     */
    public String getSample() {
        return this.sample;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder {
        private String configId; 
        private String remark; 
        private String requestId; 
        private String sample; 
        private String tag; 

        /**
         * The ID of the log configuration.
         */
        public Builder configId(String configId) {
            this.configId = configId;
            return this;
        }

        /**
         * The format of the log configuration.
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The sample log configuration.
         */
        public Builder sample(String sample) {
            this.sample = sample;
            return this;
        }

        /**
         * The tag information about the log configuration.
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        public DescribeDomainCustomLogConfigResponseBody build() {
            return new DescribeDomainCustomLogConfigResponseBody(this);
        } 

    } 

}
