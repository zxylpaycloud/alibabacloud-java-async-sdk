// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListListenerCertificatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListListenerCertificatesResponseBody</p>
 */
public class ListListenerCertificatesResponseBody extends TeaModel {
    @NameInMap("CertificateIds")
    private java.util.List < String > certificateIds;

    @NameInMap("Certificates")
    private java.util.List < Certificates> certificates;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListListenerCertificatesResponseBody(Builder builder) {
        this.certificateIds = builder.certificateIds;
        this.certificates = builder.certificates;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListListenerCertificatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return certificateIds
     */
    public java.util.List < String > getCertificateIds() {
        return this.certificateIds;
    }

    /**
     * @return certificates
     */
    public java.util.List < Certificates> getCertificates() {
        return this.certificates;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < String > certificateIds; 
        private java.util.List < Certificates> certificates; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The server certificates.
         */
        public Builder certificateIds(java.util.List < String > certificateIds) {
            this.certificateIds = certificateIds;
            return this;
        }

        /**
         * The certificates.
         */
        public Builder certificates(java.util.List < Certificates> certificates) {
            this.certificates = certificates;
            return this;
        }

        /**
         * The number of entries returned per page. Valid values: **1** to **100**. Default value: **20**.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   You do not need to specify this parameter for the first request.
         * *   You must specify the token that is obtained from the previous query as the value of NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListListenerCertificatesResponseBody build() {
            return new ListListenerCertificatesResponseBody(this);
        } 

    } 

    public static class Certificates extends TeaModel {
        @NameInMap("CertificateId")
        private String certificateId;

        @NameInMap("CertificateType")
        private String certificateType;

        @NameInMap("IsDefault")
        private Boolean isDefault;

        @NameInMap("Status")
        private String status;

        private Certificates(Builder builder) {
            this.certificateId = builder.certificateId;
            this.certificateType = builder.certificateType;
            this.isDefault = builder.isDefault;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Certificates create() {
            return builder().build();
        }

        /**
         * @return certificateId
         */
        public String getCertificateId() {
            return this.certificateId;
        }

        /**
         * @return certificateType
         */
        public String getCertificateType() {
            return this.certificateType;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String certificateId; 
            private String certificateType; 
            private Boolean isDefault; 
            private String status; 

            /**
             * The ID of the certificate.
             */
            public Builder certificateId(String certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            /**
             * The type of the certificate.
             * <p>
             * 
             * -  Server
             * - Ca
             */
            public Builder certificateType(String certificateType) {
                this.certificateType = certificateType;
                return this;
            }

            /**
             * Indicates whether the certificate is the default certificate of the listener. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * Indicates whether the certificate is associated with the listener. Valid values:
             * <p>
             * 
             * *   **Associating**
             * *   **Associated**
             * *   **Diassociating**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Certificates build() {
                return new Certificates(this);
            } 

        } 

    }
}
