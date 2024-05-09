// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnvCustomJobRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnvCustomJobRequest</p>
 */
public class DescribeEnvCustomJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomJobName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customJobName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptYaml")
    private Boolean encryptYaml;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvironmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeEnvCustomJobRequest(Builder builder) {
        super(builder);
        this.customJobName = builder.customJobName;
        this.encryptYaml = builder.encryptYaml;
        this.environmentId = builder.environmentId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnvCustomJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customJobName
     */
    public String getCustomJobName() {
        return this.customJobName;
    }

    /**
     * @return encryptYaml
     */
    public Boolean getEncryptYaml() {
        return this.encryptYaml;
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeEnvCustomJobRequest, Builder> {
        private String customJobName; 
        private Boolean encryptYaml; 
        private String environmentId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEnvCustomJobRequest request) {
            super(request);
            this.customJobName = request.customJobName;
            this.encryptYaml = request.encryptYaml;
            this.environmentId = request.environmentId;
            this.regionId = request.regionId;
        } 

        /**
         * The name of the custom job.
         */
        public Builder customJobName(String customJobName) {
            this.putQueryParameter("CustomJobName", customJobName);
            this.customJobName = customJobName;
            return this;
        }

        /**
         * Specifies whether to return the encrypted YAML string.
         */
        public Builder encryptYaml(Boolean encryptYaml) {
            this.putQueryParameter("EncryptYaml", encryptYaml);
            this.encryptYaml = encryptYaml;
            return this;
        }

        /**
         * The ID of the environment instance.
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("EnvironmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeEnvCustomJobRequest build() {
            return new DescribeEnvCustomJobRequest(this);
        } 

    } 

}
