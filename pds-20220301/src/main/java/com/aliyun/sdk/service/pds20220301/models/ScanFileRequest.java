// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScanFileRequest} extends {@link RequestModel}
 *
 * <p>ScanFileRequest</p>
 */
public class ScanFileRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fields")
    private String fields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("limit")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("marker")
    private String marker;

    private ScanFileRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.fields = builder.fields;
        this.limit = builder.limit;
        this.marker = builder.marker;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScanFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return fields
     */
    public String getFields() {
        return this.fields;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    public static final class Builder extends Request.Builder<ScanFileRequest, Builder> {
        private String domainId; 
        private String driveId; 
        private String fields; 
        private Integer limit; 
        private String marker; 

        private Builder() {
            super();
        } 

        private Builder(ScanFileRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.driveId = request.driveId;
            this.fields = request.fields;
            this.limit = request.limit;
            this.marker = request.marker;
        } 

        /**
         * domain_id.
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * The drive ID.
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * The file properties to return.
         * <p>
         * 
         * *   If you want to return all file properties, set this parameter to \*.
         * *   By default, if you do not specify this parameter, the following properties of a file are returned: - file_id, - drive_id, - parent_file_id, - type, - created_at, - updated_at, - file_extention, - size, - starred, - status, - category, and - permissions.
         * *   You can also specify properties to return. Separate multiple properties with commas (,).
         */
        public Builder fields(String fields) {
            this.putBodyParameter("fields", fields);
            this.fields = fields;
            return this;
        }

        /**
         * The maximum number of results to return. Valid values: 1 to 100.
         * <p>
         * 
         * The number of returned results must be less than or equal to the specified number.
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker.\
         * <p>
         * By default, this parameter is left empty.
         */
        public Builder marker(String marker) {
            this.putBodyParameter("marker", marker);
            this.marker = marker;
            return this;
        }

        @Override
        public ScanFileRequest build() {
            return new ScanFileRequest(this);
        } 

    } 

}
