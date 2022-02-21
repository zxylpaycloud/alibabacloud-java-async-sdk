// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMessageCallbackResponseBody} extends {@link TeaModel}
 *
 * <p>GetMessageCallbackResponseBody</p>
 */
public class GetMessageCallbackResponseBody extends TeaModel {
    @NameInMap("MessageCallback")
    private MessageCallback messageCallback;

    @NameInMap("RequestId")
    private String requestId;

    private GetMessageCallbackResponseBody(Builder builder) {
        this.messageCallback = builder.messageCallback;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMessageCallbackResponseBody create() {
        return builder().build();
    }

    /**
     * @return messageCallback
     */
    public MessageCallback getMessageCallback() {
        return this.messageCallback;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MessageCallback messageCallback; 
        private String requestId; 

        /**
         * MessageCallback.
         */
        public Builder messageCallback(MessageCallback messageCallback) {
            this.messageCallback = messageCallback;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMessageCallbackResponseBody build() {
            return new GetMessageCallbackResponseBody(this);
        } 

    } 

    public static class MessageCallback extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AuthKey")
        private String authKey;

        @NameInMap("AuthSwitch")
        private String authSwitch;

        @NameInMap("CallbackType")
        private String callbackType;

        @NameInMap("CallbackURL")
        private String callbackURL;

        @NameInMap("EventTypeList")
        private String eventTypeList;

        @NameInMap("MnsEndpoint")
        private String mnsEndpoint;

        @NameInMap("MnsQueueName")
        private String mnsQueueName;

        private MessageCallback(Builder builder) {
            this.appId = builder.appId;
            this.authKey = builder.authKey;
            this.authSwitch = builder.authSwitch;
            this.callbackType = builder.callbackType;
            this.callbackURL = builder.callbackURL;
            this.eventTypeList = builder.eventTypeList;
            this.mnsEndpoint = builder.mnsEndpoint;
            this.mnsQueueName = builder.mnsQueueName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MessageCallback create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return authKey
         */
        public String getAuthKey() {
            return this.authKey;
        }

        /**
         * @return authSwitch
         */
        public String getAuthSwitch() {
            return this.authSwitch;
        }

        /**
         * @return callbackType
         */
        public String getCallbackType() {
            return this.callbackType;
        }

        /**
         * @return callbackURL
         */
        public String getCallbackURL() {
            return this.callbackURL;
        }

        /**
         * @return eventTypeList
         */
        public String getEventTypeList() {
            return this.eventTypeList;
        }

        /**
         * @return mnsEndpoint
         */
        public String getMnsEndpoint() {
            return this.mnsEndpoint;
        }

        /**
         * @return mnsQueueName
         */
        public String getMnsQueueName() {
            return this.mnsQueueName;
        }

        public static final class Builder {
            private String appId; 
            private String authKey; 
            private String authSwitch; 
            private String callbackType; 
            private String callbackURL; 
            private String eventTypeList; 
            private String mnsEndpoint; 
            private String mnsQueueName; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AuthKey.
             */
            public Builder authKey(String authKey) {
                this.authKey = authKey;
                return this;
            }

            /**
             * AuthSwitch.
             */
            public Builder authSwitch(String authSwitch) {
                this.authSwitch = authSwitch;
                return this;
            }

            /**
             * CallbackType.
             */
            public Builder callbackType(String callbackType) {
                this.callbackType = callbackType;
                return this;
            }

            /**
             * CallbackURL.
             */
            public Builder callbackURL(String callbackURL) {
                this.callbackURL = callbackURL;
                return this;
            }

            /**
             * EventTypeList.
             */
            public Builder eventTypeList(String eventTypeList) {
                this.eventTypeList = eventTypeList;
                return this;
            }

            /**
             * MnsEndpoint.
             */
            public Builder mnsEndpoint(String mnsEndpoint) {
                this.mnsEndpoint = mnsEndpoint;
                return this;
            }

            /**
             * MnsQueueName.
             */
            public Builder mnsQueueName(String mnsQueueName) {
                this.mnsQueueName = mnsQueueName;
                return this;
            }

            public MessageCallback build() {
                return new MessageCallback(this);
            } 

        } 

    }
}
