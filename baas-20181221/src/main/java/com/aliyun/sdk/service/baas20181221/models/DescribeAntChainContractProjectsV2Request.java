// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainContractProjectsV2Request} extends {@link RequestModel}
 *
 * <p>DescribeAntChainContractProjectsV2Request</p>
 */
public class DescribeAntChainContractProjectsV2Request extends Request {
    @Body
    @NameInMap("ConsortiumId")
    @Validation(required = true)
    private String consortiumId;

    @Body
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeAntChainContractProjectsV2Request(Builder builder) {
        super(builder);
        this.consortiumId = builder.consortiumId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainContractProjectsV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consortiumId
     */
    public String getConsortiumId() {
        return this.consortiumId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeAntChainContractProjectsV2Request, Builder> {
        private String consortiumId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAntChainContractProjectsV2Request response) {
            super(response);
            this.consortiumId = response.consortiumId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
        } 

        /**
         * ConsortiumId.
         */
        public Builder consortiumId(String consortiumId) {
            this.putBodyParameter("ConsortiumId", consortiumId);
            this.consortiumId = consortiumId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeAntChainContractProjectsV2Request build() {
            return new DescribeAntChainContractProjectsV2Request(this);
        } 

    } 

}
