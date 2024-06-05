// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DomainBuildClientConfig} extends {@link TeaModel}
 *
 * <p>DomainBuildClientConfig</p>
 */
public class DomainBuildClientConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("copyright")
    private String copyright;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private DomainBuildClientConfig(Builder builder) {
        this.copyright = builder.copyright;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DomainBuildClientConfig create() {
        return builder().build();
    }

    /**
     * @return copyright
     */
    public String getCopyright() {
        return this.copyright;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String copyright; 
        private String name; 

        /**
         * copyright.
         */
        public Builder copyright(String copyright) {
            this.copyright = copyright;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public DomainBuildClientConfig build() {
            return new DomainBuildClientConfig(this);
        } 

    } 

}
