// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListEventSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListEventSourcesResponseBody</p>
 */
public class ListEventSourcesResponseBody extends TeaModel {
    @NameInMap("eventSources")
    private java.util.List < EventSources> eventSources;


    private ListEventSourcesResponseBody(Builder builder) {
        this.eventSources = builder.eventSources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventSourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return eventSources
     */
    public java.util.List < EventSources> getEventSources() {
        return this.eventSources;
    }

    public static final class Builder {
        private java.util.List < EventSources> eventSources; 

        /**
         * <p>事件源列表</p>
         */
        public Builder eventSources(java.util.List < EventSources> eventSources) {
            this.eventSources = eventSources;
            return this;
        }

        public ListEventSourcesResponseBody build() {
            return new ListEventSourcesResponseBody(this);
        } 

    } 

    public static class EventSources extends TeaModel {
        @NameInMap("createdTime")
        private String createdTime;

        @NameInMap("sourceArn")
        private String sourceArn;


        private EventSources(Builder builder) {
            this.createdTime = builder.createdTime;
            this.sourceArn = builder.sourceArn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventSources create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return sourceArn
         */
        public String getSourceArn() {
            return this.sourceArn;
        }

        public static final class Builder {
            private String createdTime; 
            private String sourceArn; 

            /**
             * <p>创建时间</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>事件源资源标识符</p>
             */
            public Builder sourceArn(String sourceArn) {
                this.sourceArn = sourceArn;
                return this;
            }

            public EventSources build() {
                return new EventSources(this);
            } 

        } 

    }
}
