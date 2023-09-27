// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Variable} extends {@link TeaModel}
 *
 * <p>Variable</p>
 */
public class Variable extends TeaModel {
    @NameInMap("description")
    private String description;

    @NameInMap("kind")
    @Validation(required = true)
    private String kind;

    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @NameInMap("value")
    @Validation(required = true)
    private String value;

    private Variable(Builder builder) {
        this.description = builder.description;
        this.kind = builder.kind;
        this.name = builder.name;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Variable create() {
        return builder().build();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return kind
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String description; 
        private String kind; 
        private String name; 
        private String value; 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * kind.
         */
        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public Variable build() {
            return new Variable(this);
        } 

    } 

}
