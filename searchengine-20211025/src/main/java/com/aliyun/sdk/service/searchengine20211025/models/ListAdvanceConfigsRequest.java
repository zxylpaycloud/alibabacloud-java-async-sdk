// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAdvanceConfigsRequest} extends {@link RequestModel}
 *
 * <p>ListAdvanceConfigsRequest</p>
 */
public class ListAdvanceConfigsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataSourceName")
    private String dataSourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("indexName")
    private String indexName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ListAdvanceConfigsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.dataSourceName = builder.dataSourceName;
        this.indexName = builder.indexName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAdvanceConfigsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * @return indexName
     */
    public String getIndexName() {
        return this.indexName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListAdvanceConfigsRequest, Builder> {
        private String instanceId; 
        private String dataSourceName; 
        private String indexName; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListAdvanceConfigsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.dataSourceName = request.dataSourceName;
            this.indexName = request.indexName;
            this.type = request.type;
        } 

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * dataSourceName.
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putQueryParameter("dataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * indexName.
         */
        public Builder indexName(String indexName) {
            this.putQueryParameter("indexName", indexName);
            this.indexName = indexName;
            return this;
        }

        /**
         * The type of the advanced configurations. Valid values: online and offline. - online The default value is offline.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListAdvanceConfigsRequest build() {
            return new ListAdvanceConfigsRequest(this);
        } 

    } 

}
