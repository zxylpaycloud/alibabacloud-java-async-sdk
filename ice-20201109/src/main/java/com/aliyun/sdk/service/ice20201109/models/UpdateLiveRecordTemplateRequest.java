// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLiveRecordTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateLiveRecordTemplateRequest</p>
 */
public class UpdateLiveRecordTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecordFormat")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < RecordFormat> recordFormat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    private UpdateLiveRecordTemplateRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.recordFormat = builder.recordFormat;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLiveRecordTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return recordFormat
     */
    public java.util.List < RecordFormat> getRecordFormat() {
        return this.recordFormat;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<UpdateLiveRecordTemplateRequest, Builder> {
        private String name; 
        private java.util.List < RecordFormat> recordFormat; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLiveRecordTemplateRequest request) {
            super(request);
            this.name = request.name;
            this.recordFormat = request.recordFormat;
            this.templateId = request.templateId;
        } 

        /**
         * 代表资源名称的资源属性字段
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * 录制格式
         */
        public Builder recordFormat(java.util.List < RecordFormat> recordFormat) {
            String recordFormatShrink = shrink(recordFormat, "RecordFormat", "json");
            this.putBodyParameter("RecordFormat", recordFormatShrink);
            this.recordFormat = recordFormat;
            return this;
        }

        /**
         * 代表资源一级ID的资源属性字段
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public UpdateLiveRecordTemplateRequest build() {
            return new UpdateLiveRecordTemplateRequest(this);
        } 

    } 

    public static class RecordFormat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CycleDuration")
        private Integer cycleDuration;

        @com.aliyun.core.annotation.NameInMap("Format")
        @com.aliyun.core.annotation.Validation(required = true)
        private String format;

        @com.aliyun.core.annotation.NameInMap("OssObjectPrefix")
        private String ossObjectPrefix;

        @com.aliyun.core.annotation.NameInMap("SliceDuration")
        private Integer sliceDuration;

        @com.aliyun.core.annotation.NameInMap("SliceOssObjectPrefix")
        private String sliceOssObjectPrefix;

        private RecordFormat(Builder builder) {
            this.cycleDuration = builder.cycleDuration;
            this.format = builder.format;
            this.ossObjectPrefix = builder.ossObjectPrefix;
            this.sliceDuration = builder.sliceDuration;
            this.sliceOssObjectPrefix = builder.sliceOssObjectPrefix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordFormat create() {
            return builder().build();
        }

        /**
         * @return cycleDuration
         */
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return ossObjectPrefix
         */
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        /**
         * @return sliceDuration
         */
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

        /**
         * @return sliceOssObjectPrefix
         */
        public String getSliceOssObjectPrefix() {
            return this.sliceOssObjectPrefix;
        }

        public static final class Builder {
            private Integer cycleDuration; 
            private String format; 
            private String ossObjectPrefix; 
            private Integer sliceDuration; 
            private String sliceOssObjectPrefix; 

            /**
             * CycleDuration.
             */
            public Builder cycleDuration(Integer cycleDuration) {
                this.cycleDuration = cycleDuration;
                return this;
            }

            /**
             * 格式
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * Oss对象名，不包含后缀
             */
            public Builder ossObjectPrefix(String ossObjectPrefix) {
                this.ossObjectPrefix = ossObjectPrefix;
                return this;
            }

            /**
             * 切片时长
             */
            public Builder sliceDuration(Integer sliceDuration) {
                this.sliceDuration = sliceDuration;
                return this;
            }

            /**
             * 切片Oss对象名，不包含后缀
             */
            public Builder sliceOssObjectPrefix(String sliceOssObjectPrefix) {
                this.sliceOssObjectPrefix = sliceOssObjectPrefix;
                return this;
            }

            public RecordFormat build() {
                return new RecordFormat(this);
            } 

        } 

    }
}
