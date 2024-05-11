// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStoryRequest} extends {@link RequestModel}
 *
 * <p>CreateStoryRequest</p>
 */
public class CreateStoryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Address")
    private AddressForStory address;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomId")
    private String customId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomLabels")
    private java.util.Map < String, ? > customLabels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxFileCount")
    private Long maxFileCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MinFileCount")
    private Long minFileCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Notification")
    private Notification notification;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NotifyTopicName")
    private String notifyTopicName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ObjectId")
    private String objectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoryEndTime")
    private String storyEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoryName")
    private String storyName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoryStartTime")
    private String storyStartTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StorySubType")
    private String storySubType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoryType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map < String, ? > tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private CreateStoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.address = builder.address;
        this.customId = builder.customId;
        this.customLabels = builder.customLabels;
        this.datasetName = builder.datasetName;
        this.maxFileCount = builder.maxFileCount;
        this.minFileCount = builder.minFileCount;
        this.notification = builder.notification;
        this.notifyTopicName = builder.notifyTopicName;
        this.objectId = builder.objectId;
        this.projectName = builder.projectName;
        this.storyEndTime = builder.storyEndTime;
        this.storyName = builder.storyName;
        this.storyStartTime = builder.storyStartTime;
        this.storySubType = builder.storySubType;
        this.storyType = builder.storyType;
        this.tags = builder.tags;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return address
     */
    public AddressForStory getAddress() {
        return this.address;
    }

    /**
     * @return customId
     */
    public String getCustomId() {
        return this.customId;
    }

    /**
     * @return customLabels
     */
    public java.util.Map < String, ? > getCustomLabels() {
        return this.customLabels;
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return maxFileCount
     */
    public Long getMaxFileCount() {
        return this.maxFileCount;
    }

    /**
     * @return minFileCount
     */
    public Long getMinFileCount() {
        return this.minFileCount;
    }

    /**
     * @return notification
     */
    public Notification getNotification() {
        return this.notification;
    }

    /**
     * @return notifyTopicName
     */
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    /**
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return storyEndTime
     */
    public String getStoryEndTime() {
        return this.storyEndTime;
    }

    /**
     * @return storyName
     */
    public String getStoryName() {
        return this.storyName;
    }

    /**
     * @return storyStartTime
     */
    public String getStoryStartTime() {
        return this.storyStartTime;
    }

    /**
     * @return storySubType
     */
    public String getStorySubType() {
        return this.storySubType;
    }

    /**
     * @return storyType
     */
    public String getStoryType() {
        return this.storyType;
    }

    /**
     * @return tags
     */
    public java.util.Map < String, ? > getTags() {
        return this.tags;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<CreateStoryRequest, Builder> {
        private String regionId; 
        private AddressForStory address; 
        private String customId; 
        private java.util.Map < String, ? > customLabels; 
        private String datasetName; 
        private Long maxFileCount; 
        private Long minFileCount; 
        private Notification notification; 
        private String notifyTopicName; 
        private String objectId; 
        private String projectName; 
        private String storyEndTime; 
        private String storyName; 
        private String storyStartTime; 
        private String storySubType; 
        private String storyType; 
        private java.util.Map < String, ? > tags; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(CreateStoryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.address = request.address;
            this.customId = request.customId;
            this.customLabels = request.customLabels;
            this.datasetName = request.datasetName;
            this.maxFileCount = request.maxFileCount;
            this.minFileCount = request.minFileCount;
            this.notification = request.notification;
            this.notifyTopicName = request.notifyTopicName;
            this.objectId = request.objectId;
            this.projectName = request.projectName;
            this.storyEndTime = request.storyEndTime;
            this.storyName = request.storyName;
            this.storyStartTime = request.storyStartTime;
            this.storySubType = request.storySubType;
            this.storyType = request.storyType;
            this.tags = request.tags;
            this.userData = request.userData;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Address.
         */
        public Builder address(AddressForStory address) {
            String addressShrink = shrink(address, "Address", "json");
            this.putBodyParameter("Address", addressShrink);
            this.address = address;
            return this;
        }

        /**
         * CustomId.
         */
        public Builder customId(String customId) {
            this.putBodyParameter("CustomId", customId);
            this.customId = customId;
            return this;
        }

        /**
         * CustomLabels.
         */
        public Builder customLabels(java.util.Map < String, ? > customLabels) {
            String customLabelsShrink = shrink(customLabels, "CustomLabels", "json");
            this.putBodyParameter("CustomLabels", customLabelsShrink);
            this.customLabels = customLabels;
            return this;
        }

        /**
         * DatasetName.
         */
        public Builder datasetName(String datasetName) {
            this.putBodyParameter("DatasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        /**
         * MaxFileCount.
         */
        public Builder maxFileCount(Long maxFileCount) {
            this.putBodyParameter("MaxFileCount", maxFileCount);
            this.maxFileCount = maxFileCount;
            return this;
        }

        /**
         * MinFileCount.
         */
        public Builder minFileCount(Long minFileCount) {
            this.putBodyParameter("MinFileCount", minFileCount);
            this.minFileCount = minFileCount;
            return this;
        }

        /**
         * 消息通知配置，支持使用MNS、RocketMQ接收异步消息通知。
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * NotifyTopicName.
         */
        public Builder notifyTopicName(String notifyTopicName) {
            this.putBodyParameter("NotifyTopicName", notifyTopicName);
            this.notifyTopicName = notifyTopicName;
            return this;
        }

        /**
         * ObjectId.
         */
        public Builder objectId(String objectId) {
            this.putBodyParameter("ObjectId", objectId);
            this.objectId = objectId;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * StoryEndTime.
         */
        public Builder storyEndTime(String storyEndTime) {
            this.putBodyParameter("StoryEndTime", storyEndTime);
            this.storyEndTime = storyEndTime;
            return this;
        }

        /**
         * StoryName.
         */
        public Builder storyName(String storyName) {
            this.putBodyParameter("StoryName", storyName);
            this.storyName = storyName;
            return this;
        }

        /**
         * StoryStartTime.
         */
        public Builder storyStartTime(String storyStartTime) {
            this.putBodyParameter("StoryStartTime", storyStartTime);
            this.storyStartTime = storyStartTime;
            return this;
        }

        /**
         * StorySubType.
         */
        public Builder storySubType(String storySubType) {
            this.putBodyParameter("StorySubType", storySubType);
            this.storySubType = storySubType;
            return this;
        }

        /**
         * StoryType.
         */
        public Builder storyType(String storyType) {
            this.putBodyParameter("StoryType", storyType);
            this.storyType = storyType;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.Map < String, ? > tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public CreateStoryRequest build() {
            return new CreateStoryRequest(this);
        } 

    } 

}
