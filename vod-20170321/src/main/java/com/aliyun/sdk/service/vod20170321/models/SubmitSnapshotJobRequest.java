// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitSnapshotJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitSnapshotJobRequest</p>
 */
public class SubmitSnapshotJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Height")
    private String height;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private Long interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotTemplateId")
    private String snapshotTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecifiedOffsetTime")
    private Long specifiedOffsetTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecifiedOffsetTimes")
    private java.util.List < Long > specifiedOffsetTimes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpriteSnapshotConfig")
    private String spriteSnapshotConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoId")
    private String videoId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Width")
    private String width;

    private SubmitSnapshotJobRequest(Builder builder) {
        super(builder);
        this.count = builder.count;
        this.height = builder.height;
        this.interval = builder.interval;
        this.snapshotTemplateId = builder.snapshotTemplateId;
        this.specifiedOffsetTime = builder.specifiedOffsetTime;
        this.specifiedOffsetTimes = builder.specifiedOffsetTimes;
        this.spriteSnapshotConfig = builder.spriteSnapshotConfig;
        this.userData = builder.userData;
        this.videoId = builder.videoId;
        this.width = builder.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSnapshotJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return height
     */
    public String getHeight() {
        return this.height;
    }

    /**
     * @return interval
     */
    public Long getInterval() {
        return this.interval;
    }

    /**
     * @return snapshotTemplateId
     */
    public String getSnapshotTemplateId() {
        return this.snapshotTemplateId;
    }

    /**
     * @return specifiedOffsetTime
     */
    public Long getSpecifiedOffsetTime() {
        return this.specifiedOffsetTime;
    }

    /**
     * @return specifiedOffsetTimes
     */
    public java.util.List < Long > getSpecifiedOffsetTimes() {
        return this.specifiedOffsetTimes;
    }

    /**
     * @return spriteSnapshotConfig
     */
    public String getSpriteSnapshotConfig() {
        return this.spriteSnapshotConfig;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    /**
     * @return width
     */
    public String getWidth() {
        return this.width;
    }

    public static final class Builder extends Request.Builder<SubmitSnapshotJobRequest, Builder> {
        private Long count; 
        private String height; 
        private Long interval; 
        private String snapshotTemplateId; 
        private Long specifiedOffsetTime; 
        private java.util.List < Long > specifiedOffsetTimes; 
        private String spriteSnapshotConfig; 
        private String userData; 
        private String videoId; 
        private String width; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSnapshotJobRequest request) {
            super(request);
            this.count = request.count;
            this.height = request.height;
            this.interval = request.interval;
            this.snapshotTemplateId = request.snapshotTemplateId;
            this.specifiedOffsetTime = request.specifiedOffsetTime;
            this.specifiedOffsetTimes = request.specifiedOffsetTimes;
            this.spriteSnapshotConfig = request.spriteSnapshotConfig;
            this.userData = request.userData;
            this.videoId = request.videoId;
            this.width = request.width;
        } 

        /**
         * The maximum number of snapshots. Default value: **1**.
         */
        public Builder count(Long count) {
            this.putQueryParameter("Count", count);
            this.count = count;
            return this;
        }

        /**
         * The height of each snapshot. Valid values: `[8,4096]`. By default, the height of the video source is used. Unit: pixels.
         */
        public Builder height(String height) {
            this.putQueryParameter("Height", height);
            this.height = height;
            return this;
        }

        /**
         * The snapshot interval. The value must be **greater than or equal to 0**.
         * <p>
         * 
         * *   Unit: seconds.
         * *   Default value: **1**.
         * *   If you set this parameter to **0**, snapshots are captured at even intervals based on the video duration divided by the value of the Count parameter.
         */
        public Builder interval(Long interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * The ID of the snapshot template.
         * <p>
         * 
         * *   We recommend that you create a snapshot template before you specify the template ID. For more information about how to create a snapshot template, see [AddVodTemplate](~~99406~~).
         * *   If you set the SnapshotTemplateId parameter, all the other request parameters except the Action and VideoId parameters are ignored.
         */
        public Builder snapshotTemplateId(String snapshotTemplateId) {
            this.putQueryParameter("SnapshotTemplateId", snapshotTemplateId);
            this.snapshotTemplateId = snapshotTemplateId;
            return this;
        }

        /**
         * The point in time when the first snapshot is captured.
         * <p>
         * 
         * *   Unit: milliseconds.
         * *   Default value: **0**.
         */
        public Builder specifiedOffsetTime(Long specifiedOffsetTime) {
            this.putQueryParameter("SpecifiedOffsetTime", specifiedOffsetTime);
            this.specifiedOffsetTime = specifiedOffsetTime;
            return this;
        }

        /**
         * The playback positions at which you want to capture snapshots. Unit: milliseconds. You can specify up to 30 playback positions in a request.
         */
        public Builder specifiedOffsetTimes(java.util.List < Long > specifiedOffsetTimes) {
            String specifiedOffsetTimesShrink = shrink(specifiedOffsetTimes, "SpecifiedOffsetTimes", "json");
            this.putQueryParameter("SpecifiedOffsetTimes", specifiedOffsetTimesShrink);
            this.specifiedOffsetTimes = specifiedOffsetTimes;
            return this;
        }

        /**
         * The sprite snapshot configuration. If you set this parameter, sprite snapshots are generated. For more information, see [SpriteSnapshotConfig](~~86952~~).
         */
        public Builder spriteSnapshotConfig(String spriteSnapshotConfig) {
            this.putQueryParameter("SpriteSnapshotConfig", spriteSnapshotConfig);
            this.spriteSnapshotConfig = spriteSnapshotConfig;
            return this;
        }

        /**
         * The custom configurations including the configuration of transparent data transmission and callback configurations. The value must be a JSON string. For more information, see [UserData](~~86952~~).
         * <p>
         * 
         * >  To use the message callback feature, you must specify an HTTP callback URL and the callback events in the ApsaraVideo VOD console. Otherwise, the callback settings do not take effect.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * The ID of the video. You can use one of the following methods to obtain the ID:
         * <p>
         * 
         * *   After you upload a video in the ApsaraVideo VOD console, you can log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com) and choose **Media Files** > **Audio/Video** to view the ID of the video.
         * *   Obtain the video ID from the response to the [CreateUploadVideo](~~55407~~) operation that you called to obtain the upload URL and credential.
         * *   Obtain the video ID from the response to the [SearchMedia](~~86044~~) operation that you called to query media information after the audio or video file is uploaded.
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        /**
         * The width of each snapshot. Valid values: `[8,4096]`. By default, the width of the video source is used. Unit: pixels.
         */
        public Builder width(String width) {
            this.putQueryParameter("Width", width);
            this.width = width;
            return this;
        }

        @Override
        public SubmitSnapshotJobRequest build() {
            return new SubmitSnapshotJobRequest(this);
        } 

    } 

}
