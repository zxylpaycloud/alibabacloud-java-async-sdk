// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTriggersOutput} extends {@link TeaModel}
 *
 * <p>ListTriggersOutput</p>
 */
public class ListTriggersOutput extends TeaModel {
    @NameInMap("nextToken")
    private String nextToken;

    @NameInMap("triggers")
    private java.util.List < Trigger > triggers;

    private ListTriggersOutput(Builder builder) {
        this.nextToken = builder.nextToken;
        this.triggers = builder.triggers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTriggersOutput create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return triggers
     */
    public java.util.List < Trigger > getTriggers() {
        return this.triggers;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List < Trigger > triggers; 

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * triggers.
         */
        public Builder triggers(java.util.List < Trigger > triggers) {
            this.triggers = triggers;
            return this;
        }

        public ListTriggersOutput build() {
            return new ListTriggersOutput(this);
        } 

    } 

}
