// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link WebAclEntryConfig} extends {@link TeaModel}
 *
 * <p>WebAclEntryConfig</p>
 */
public class WebAclEntryConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Entry")
    @com.aliyun.core.annotation.Validation(required = true)
    private String entry;

    private WebAclEntryConfig(Builder builder) {
        this.entry = builder.entry;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebAclEntryConfig create() {
        return builder().build();
    }

    /**
     * @return entry
     */
    public String getEntry() {
        return this.entry;
    }

    public static final class Builder {
        private String entry; 

        /**
         * Entry.
         */
        public Builder entry(String entry) {
            this.entry = entry;
            return this;
        }

        public WebAclEntryConfig build() {
            return new WebAclEntryConfig(this);
        } 

    } 

}
