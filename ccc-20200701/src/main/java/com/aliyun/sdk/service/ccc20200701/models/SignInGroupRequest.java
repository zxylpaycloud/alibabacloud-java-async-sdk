// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SignInGroupRequest} extends {@link RequestModel}
 *
 * <p>SignInGroupRequest</p>
 */
public class SignInGroupRequest extends Request {
    @Query
    @NameInMap("Additivity")
    private Boolean additivity;

    @Query
    @NameInMap("ChatDeviceId")
    private String chatDeviceId;

    @Query
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("SignedSkillGroupIdList")
    @Validation(required = true)
    private String signedSkillGroupIdList;

    @Query
    @NameInMap("UserId")
    private String userId;

    private SignInGroupRequest(Builder builder) {
        super(builder);
        this.additivity = builder.additivity;
        this.chatDeviceId = builder.chatDeviceId;
        this.deviceId = builder.deviceId;
        this.instanceId = builder.instanceId;
        this.signedSkillGroupIdList = builder.signedSkillGroupIdList;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SignInGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return additivity
     */
    public Boolean getAdditivity() {
        return this.additivity;
    }

    /**
     * @return chatDeviceId
     */
    public String getChatDeviceId() {
        return this.chatDeviceId;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return signedSkillGroupIdList
     */
    public String getSignedSkillGroupIdList() {
        return this.signedSkillGroupIdList;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<SignInGroupRequest, Builder> {
        private Boolean additivity; 
        private String chatDeviceId; 
        private String deviceId; 
        private String instanceId; 
        private String signedSkillGroupIdList; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(SignInGroupRequest request) {
            super(request);
            this.additivity = request.additivity;
            this.chatDeviceId = request.chatDeviceId;
            this.deviceId = request.deviceId;
            this.instanceId = request.instanceId;
            this.signedSkillGroupIdList = request.signedSkillGroupIdList;
            this.userId = request.userId;
        } 

        /**
         * Additivity.
         */
        public Builder additivity(Boolean additivity) {
            this.putQueryParameter("Additivity", additivity);
            this.additivity = additivity;
            return this;
        }

        /**
         * ChatDeviceId.
         */
        public Builder chatDeviceId(String chatDeviceId) {
            this.putQueryParameter("ChatDeviceId", chatDeviceId);
            this.chatDeviceId = chatDeviceId;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * SignedSkillGroupIdList.
         */
        public Builder signedSkillGroupIdList(String signedSkillGroupIdList) {
            this.putQueryParameter("SignedSkillGroupIdList", signedSkillGroupIdList);
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public SignInGroupRequest build() {
            return new SignInGroupRequest(this);
        } 

    } 

}
