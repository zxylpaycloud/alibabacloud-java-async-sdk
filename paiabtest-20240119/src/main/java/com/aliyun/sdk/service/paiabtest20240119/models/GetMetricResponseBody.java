// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetricResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetricResponseBody</p>
 */
public class GetMetricResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Definition")
    private String definition;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("MetricGroupId")
    private String metricGroupId;

    @com.aliyun.core.annotation.NameInMap("MetricId")
    private String metricId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceTableMetaId")
    private String sourceTableMetaId;

    @com.aliyun.core.annotation.NameInMap("SourceTableMetaName")
    private String sourceTableMetaName;

    private GetMetricResponseBody(Builder builder) {
        this.definition = builder.definition;
        this.description = builder.description;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.metricGroupId = builder.metricGroupId;
        this.metricId = builder.metricId;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.sourceTableMetaId = builder.sourceTableMetaId;
        this.sourceTableMetaName = builder.sourceTableMetaName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetricResponseBody create() {
        return builder().build();
    }

    /**
     * @return definition
     */
    public String getDefinition() {
        return this.definition;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return metricGroupId
     */
    public String getMetricGroupId() {
        return this.metricGroupId;
    }

    /**
     * @return metricId
     */
    public String getMetricId() {
        return this.metricId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceTableMetaId
     */
    public String getSourceTableMetaId() {
        return this.sourceTableMetaId;
    }

    /**
     * @return sourceTableMetaName
     */
    public String getSourceTableMetaName() {
        return this.sourceTableMetaName;
    }

    public static final class Builder {
        private String definition; 
        private String description; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String metricGroupId; 
        private String metricId; 
        private String name; 
        private String requestId; 
        private String sourceTableMetaId; 
        private String sourceTableMetaName; 

        /**
         * Definition.
         */
        public Builder definition(String definition) {
            this.definition = definition;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * MetricGroupId.
         */
        public Builder metricGroupId(String metricGroupId) {
            this.metricGroupId = metricGroupId;
            return this;
        }

        /**
         * MetricId.
         */
        public Builder metricId(String metricId) {
            this.metricId = metricId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SourceTableMetaId.
         */
        public Builder sourceTableMetaId(String sourceTableMetaId) {
            this.sourceTableMetaId = sourceTableMetaId;
            return this;
        }

        /**
         * SourceTableMetaName.
         */
        public Builder sourceTableMetaName(String sourceTableMetaName) {
            this.sourceTableMetaName = sourceTableMetaName;
            return this;
        }

        public GetMetricResponseBody build() {
            return new GetMetricResponseBody(this);
        } 

    } 

}
