// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataSourceTableFieldsRequest} extends {@link RequestModel}
 *
 * <p>ListDataSourceTableFieldsRequest</p>
 */
public class ListDataSourceTableFieldsRequest extends Request {
    @Path
    @NameInMap("dataSourceType")
    @Validation(required = true)
    private String dataSourceType;

    @Query
    @NameInMap("params")
    @Validation(required = true)
    private String params;

    private ListDataSourceTableFieldsRequest(Builder builder) {
        super(builder);
        this.dataSourceType = builder.dataSourceType;
        this.params = builder.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourceTableFieldsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    public static final class Builder extends Request.Builder<ListDataSourceTableFieldsRequest, Builder> {
        private String dataSourceType; 
        private String params; 

        private Builder() {
            super();
        } 

        private Builder(ListDataSourceTableFieldsRequest response) {
            super(response);
            this.dataSourceType = response.dataSourceType;
            this.params = response.params;
        } 

        /**
         * dataSourceType.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putPathParameter("dataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * params.
         */
        public Builder params(String params) {
            this.putQueryParameter("params", params);
            this.params = params;
            return this;
        }

        @Override
        public ListDataSourceTableFieldsRequest build() {
            return new ListDataSourceTableFieldsRequest(this);
        } 

    } 

}
