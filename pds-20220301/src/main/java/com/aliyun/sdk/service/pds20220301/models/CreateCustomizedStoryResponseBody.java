// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomizedStoryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCustomizedStoryResponseBody</p>
 */
public class CreateCustomizedStoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.NameInMap("story_id")
    private String storyId;

    private CreateCustomizedStoryResponseBody(Builder builder) {
        this.driveId = builder.driveId;
        this.storyId = builder.storyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomizedStoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return storyId
     */
    public String getStoryId() {
        return this.storyId;
    }

    public static final class Builder {
        private String driveId; 
        private String storyId; 

        /**
         * drive_id.
         */
        public Builder driveId(String driveId) {
            this.driveId = driveId;
            return this;
        }

        /**
         * story_id.
         */
        public Builder storyId(String storyId) {
            this.storyId = storyId;
            return this;
        }

        public CreateCustomizedStoryResponseBody build() {
            return new CreateCustomizedStoryResponseBody(this);
        } 

    } 

}
