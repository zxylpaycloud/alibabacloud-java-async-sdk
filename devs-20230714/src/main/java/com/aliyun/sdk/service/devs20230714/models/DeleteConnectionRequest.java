// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteConnectionRequest} extends {@link RequestModel}
 *
 * <p>DeleteConnectionRequest</p>
 */
public class DeleteConnectionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("force")
    private Boolean force;

    private DeleteConnectionRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.force = builder.force;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConnectionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    public static final class Builder extends Request.Builder<DeleteConnectionRequest, Builder> {
        private String name; 
        private Boolean force; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConnectionRequest request) {
            super(request);
            this.name = request.name;
            this.force = request.force;
        } 

        /**
         * name.
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * force.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("force", force);
            this.force = force;
            return this;
        }

        @Override
        public DeleteConnectionRequest build() {
            return new DeleteConnectionRequest(this);
        } 

    } 

}
