// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogstoreStorageRequest} extends {@link RequestModel}
 *
 * <p>DescribeLogstoreStorageRequest</p>
 */
public class DescribeLogstoreStorageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    @com.aliyun.core.annotation.Validation(required = true)
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private DescribeLogstoreStorageRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogstoreStorageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DescribeLogstoreStorageRequest, Builder> {
        private String from; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLogstoreStorageRequest request) {
            super(request);
            this.from = request.from;
            this.lang = request.lang;
        } 

        /**
         * The ID of the request source. Set the value to **sas**.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DescribeLogstoreStorageRequest build() {
            return new DescribeLogstoreStorageRequest(this);
        } 

    } 

}
