// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePerspectiveRequest} extends {@link RequestModel}
 *
 * <p>CreatePerspectiveRequest</p>
 */
public class CreatePerspectiveRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CreatePerspectiveRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.name = builder.name;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePerspectiveRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreatePerspectiveRequest, Builder> {
        private String agentKey; 
        private String name; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePerspectiveRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.name = request.name;
            this.regionId = request.regionId;
        } 

        /**
         * 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreatePerspectiveRequest build() {
            return new CreatePerspectiveRequest(this);
        } 

    } 

}
