// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOssUploadTokenResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOssUploadTokenResponseBody</p>
 */
public class DescribeOssUploadTokenResponseBody extends TeaModel {
    @NameInMap("OssUploadToken")
    private OssUploadToken ossUploadToken;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeOssUploadTokenResponseBody(Builder builder) {
        this.ossUploadToken = builder.ossUploadToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssUploadTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return ossUploadToken
     */
    public OssUploadToken getOssUploadToken() {
        return this.ossUploadToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OssUploadToken ossUploadToken; 
        private String requestId; 

        /**
         * OssUploadToken.
         */
        public Builder ossUploadToken(OssUploadToken ossUploadToken) {
            this.ossUploadToken = ossUploadToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOssUploadTokenResponseBody build() {
            return new DescribeOssUploadTokenResponseBody(this);
        } 

    } 

    public static class OssUploadToken extends TeaModel {
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("EndPoint")
        private String endPoint;

        @NameInMap("Expired")
        private Long expired;

        @NameInMap("Key")
        private String key;

        @NameInMap("Path")
        private String path;

        @NameInMap("Secret")
        private String secret;

        @NameInMap("Token")
        private String token;

        private OssUploadToken(Builder builder) {
            this.bucket = builder.bucket;
            this.endPoint = builder.endPoint;
            this.expired = builder.expired;
            this.key = builder.key;
            this.path = builder.path;
            this.secret = builder.secret;
            this.token = builder.token;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssUploadToken create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return endPoint
         */
        public String getEndPoint() {
            return this.endPoint;
        }

        /**
         * @return expired
         */
        public Long getExpired() {
            return this.expired;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return secret
         */
        public String getSecret() {
            return this.secret;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        public static final class Builder {
            private String bucket; 
            private String endPoint; 
            private Long expired; 
            private String key; 
            private String path; 
            private String secret; 
            private String token; 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * EndPoint.
             */
            public Builder endPoint(String endPoint) {
                this.endPoint = endPoint;
                return this;
            }

            /**
             * Expired.
             */
            public Builder expired(Long expired) {
                this.expired = expired;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Secret.
             */
            public Builder secret(String secret) {
                this.secret = secret;
                return this;
            }

            /**
             * Token.
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            public OssUploadToken build() {
                return new OssUploadToken(this);
            } 

        } 

    }
}
