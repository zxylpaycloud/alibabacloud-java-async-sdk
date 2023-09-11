// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListListenerCertificatesRequest} extends {@link RequestModel}
 *
 * <p>ListListenerCertificatesRequest</p>
 */
public class ListListenerCertificatesRequest extends Request {
    @Body
    @NameInMap("CertType")
    private String certType;

    @Body
    @NameInMap("ListenerId")
    @Validation(required = true)
    private String listenerId;

    @Body
    @NameInMap("MaxResults")
    @Validation(maximum = 50, minimum = 1)
    private Integer maxResults;

    @Body
    @NameInMap("NextToken")
    private String nextToken;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private ListListenerCertificatesRequest(Builder builder) {
        super(builder);
        this.certType = builder.certType;
        this.listenerId = builder.listenerId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListListenerCertificatesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certType
     */
    public String getCertType() {
        return this.certType;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListListenerCertificatesRequest, Builder> {
        private String certType; 
        private String listenerId; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListListenerCertificatesRequest request) {
            super(request);
            this.certType = request.certType;
            this.listenerId = request.listenerId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
        } 

        /**
         * The type of the certificate. Valid values:
         * <p>
         * 
         * *   **Server**: a server certificate.
         * *   **Ca**: Certificate Authority Certificate
         */
        public Builder certType(String certType) {
            this.putBodyParameter("CertType", certType);
            this.certType = certType;
            return this;
        }

        /**
         * The ID of the listener. Specify the ID of a listener that uses SSL over TCP.
         */
        public Builder listenerId(String listenerId) {
            this.putBodyParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: **1** to **100**. Default value: **20**.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   You do not need to specify this parameter for the first request.
         * *   You must specify the token that is obtained from the previous query as the value of NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the region where the Network Load Balancer (NLB) instance is deployed.
         * <p>
         * 
         * You can call the [DescribeRegions](~~443657~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListListenerCertificatesRequest build() {
            return new ListListenerCertificatesRequest(this);
        } 

    } 

}
