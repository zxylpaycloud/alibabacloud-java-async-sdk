// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserProvisioningEventsRequest} extends {@link RequestModel}
 *
 * <p>ListUserProvisioningEventsRequest</p>
 */
public class ListUserProvisioningEventsRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("UserProvisioningId")
    private String userProvisioningId;

    private ListUserProvisioningEventsRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.userProvisioningId = builder.userProvisioningId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserProvisioningEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
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
     * @return userProvisioningId
     */
    public String getUserProvisioningId() {
        return this.userProvisioningId;
    }

    public static final class Builder extends Request.Builder<ListUserProvisioningEventsRequest, Builder> {
        private String directoryId; 
        private Integer maxResults; 
        private String nextToken; 
        private String userProvisioningId; 

        private Builder() {
            super();
        } 

        private Builder(ListUserProvisioningEventsRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.userProvisioningId = request.userProvisioningId;
        } 

        /**
         * The ID of the resource directory.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The maximum number of entries per page.
         * <p>
         * 
         * Valid values: 1 to 100.
         * 
         * Default value: 10.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that is used to initiate the next request. If this is your first time to call this operation, you do not need to specify the `NextToken` parameter.
         * <p>
         * 
         * When you call this operation for the first time, if the total number of entries to return is larger than the value of `MaxResults`, the entries are truncated. The system returns entries based on the value of `MaxResults`, and does not return the excess entries. In this case, the value of the response parameter `IsTruncated` is `true`, and `NextToken` is returned. In the next call, you can use the value of `NextToken` and maintain the settings of the other request parameters to query the excess entries. You can repeat the call until the value of `IsTruncated` becomes `false`. This way, all entries are returned.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the RAM user provisioning.
         */
        public Builder userProvisioningId(String userProvisioningId) {
            this.putQueryParameter("UserProvisioningId", userProvisioningId);
            this.userProvisioningId = userProvisioningId;
            return this;
        }

        @Override
        public ListUserProvisioningEventsRequest build() {
            return new ListUserProvisioningEventsRequest(this);
        } 

    } 

}
