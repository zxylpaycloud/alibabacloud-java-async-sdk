// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link JaegerConfig} extends {@link TeaModel}
 *
 * <p>JaegerConfig</p>
 */
public class JaegerConfig extends TeaModel {
    @NameInMap("endpoint")
    private String endpoint;


    private JaegerConfig(Builder builder) {
        this.endpoint = builder.endpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JaegerConfig create() {
        return builder().build();
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    public static final class Builder {
        private String endpoint; 

        /**
         * <p>endpoint</p>
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public JaegerConfig build() {
            return new JaegerConfig(this);
        } 

    } 

}
