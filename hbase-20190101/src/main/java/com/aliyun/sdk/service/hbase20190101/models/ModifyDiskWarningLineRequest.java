// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDiskWarningLineRequest} extends {@link RequestModel}
 *
 * <p>ModifyDiskWarningLineRequest</p>
 */
public class ModifyDiskWarningLineRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("WarningLine")
    @Validation(required = true, maximum = 100)
    private Integer warningLine;

    private ModifyDiskWarningLineRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.warningLine = builder.warningLine;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDiskWarningLineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return warningLine
     */
    public Integer getWarningLine() {
        return this.warningLine;
    }

    public static final class Builder extends Request.Builder<ModifyDiskWarningLineRequest, Builder> {
        private String clusterId; 
        private Integer warningLine; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDiskWarningLineRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.warningLine = response.warningLine;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * WarningLine.
         */
        public Builder warningLine(Integer warningLine) {
            this.putQueryParameter("WarningLine", warningLine);
            this.warningLine = warningLine;
            return this;
        }

        @Override
        public ModifyDiskWarningLineRequest build() {
            return new ModifyDiskWarningLineRequest(this);
        } 

    } 

}
