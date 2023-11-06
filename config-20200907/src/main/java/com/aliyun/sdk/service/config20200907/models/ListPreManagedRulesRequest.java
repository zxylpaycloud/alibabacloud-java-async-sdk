// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPreManagedRulesRequest} extends {@link RequestModel}
 *
 * <p>ListPreManagedRulesRequest</p>
 */
public class ListPreManagedRulesRequest extends Request {
    @Body
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Body
    @NameInMap("PageSize")
    private Long pageSize;

    @Body
    @NameInMap("ResourceTypes")
    private java.util.List < String > resourceTypes;

    private ListPreManagedRulesRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceTypes = builder.resourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPreManagedRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceTypes
     */
    public java.util.List < String > getResourceTypes() {
        return this.resourceTypes;
    }

    public static final class Builder extends Request.Builder<ListPreManagedRulesRequest, Builder> {
        private Long pageNumber; 
        private Long pageSize; 
        private java.util.List < String > resourceTypes; 

        private Builder() {
            super();
        } 

        private Builder(ListPreManagedRulesRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceTypes = request.resourceTypes;
        } 

        /**
         * The number of the page to return.
         * <p>
         * 
         * Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Default value: 10.
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The type of the resource.
         */
        public Builder resourceTypes(java.util.List < String > resourceTypes) {
            String resourceTypesShrink = shrink(resourceTypes, "ResourceTypes", "json");
            this.putBodyParameter("ResourceTypes", resourceTypesShrink);
            this.resourceTypes = resourceTypes;
            return this;
        }

        @Override
        public ListPreManagedRulesRequest build() {
            return new ListPreManagedRulesRequest(this);
        } 

    } 

}
