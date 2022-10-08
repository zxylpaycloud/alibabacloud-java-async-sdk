// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BeeBotAssociateResponseBody} extends {@link TeaModel}
 *
 * <p>BeeBotAssociateResponseBody</p>
 */
public class BeeBotAssociateResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private BeeBotAssociateResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BeeBotAssociateResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * 返回结果 OK 为正常
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 提示信息，当返回异常时有值
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BeeBotAssociateResponseBody build() {
            return new BeeBotAssociateResponseBody(this);
        } 

    } 

    public static class Associate extends TeaModel {
        @NameInMap("Meta")
        private String meta;

        @NameInMap("Title")
        private String title;

        private Associate(Builder builder) {
            this.meta = builder.meta;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Associate create() {
            return builder().build();
        }

        /**
         * @return meta
         */
        public String getMeta() {
            return this.meta;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String meta; 
            private String title; 

            /**
             * 附带信息
             */
            public Builder meta(String meta) {
                this.meta = meta;
                return this;
            }

            /**
             * 关联问题的标题
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Associate build() {
                return new Associate(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Associate")
        private java.util.List < Associate> associate;

        @NameInMap("MessageId")
        private String messageId;

        @NameInMap("SessionId")
        private String sessionId;

        private Data(Builder builder) {
            this.associate = builder.associate;
            this.messageId = builder.messageId;
            this.sessionId = builder.sessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return associate
         */
        public java.util.List < Associate> getAssociate() {
            return this.associate;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        public static final class Builder {
            private java.util.List < Associate> associate; 
            private String messageId; 
            private String sessionId; 

            /**
             * Associate.
             */
            public Builder associate(java.util.List < Associate> associate) {
                this.associate = associate;
                return this;
            }

            /**
             * 本条会话应答消息ID
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * 会话ID
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
