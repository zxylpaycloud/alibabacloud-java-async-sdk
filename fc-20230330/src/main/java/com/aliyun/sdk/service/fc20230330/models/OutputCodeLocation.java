// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OutputCodeLocation} extends {@link TeaModel}
 *
 * <p>OutputCodeLocation</p>
 */
public class OutputCodeLocation extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("location")
    private String location;

    @com.aliyun.core.annotation.NameInMap("repositoryType")
    private String repositoryType;

    private OutputCodeLocation(Builder builder) {
        this.location = builder.location;
        this.repositoryType = builder.repositoryType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OutputCodeLocation create() {
        return builder().build();
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return repositoryType
     */
    public String getRepositoryType() {
        return this.repositoryType;
    }

    public static final class Builder {
        private String location; 
        private String repositoryType; 

        /**
         * location.
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * repositoryType.
         */
        public Builder repositoryType(String repositoryType) {
            this.repositoryType = repositoryType;
            return this;
        }

        public OutputCodeLocation build() {
            return new OutputCodeLocation(this);
        } 

    } 

}
