// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetModelVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetModelVersionResponseBody</p>
 */
public class GetModelVersionResponseBody extends TeaModel {
    @NameInMap("ApprovalStatus")
    private String approvalStatus;

    @NameInMap("FormatType")
    private String formatType;

    @NameInMap("FrameworkType")
    private String frameworkType;

    @NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @NameInMap("InferenceSpec")
    private java.util.Map < String, ? > inferenceSpec;

    @NameInMap("Labels")
    private java.util.List < Label > labels;

    @NameInMap("Options")
    private String options;

    @NameInMap("OwnerId")
    private String ownerId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SourceId")
    private String sourceId;

    @NameInMap("SourceType")
    private String sourceType;

    @NameInMap("TrainingSpec")
    private java.util.Map < String, ? > trainingSpec;

    @NameInMap("Uri")
    private String uri;

    @NameInMap("UserId")
    private String userId;

    @NameInMap("VersionDescription")
    private String versionDescription;

    @NameInMap("VersionName")
    private String versionName;

    private GetModelVersionResponseBody(Builder builder) {
        this.approvalStatus = builder.approvalStatus;
        this.formatType = builder.formatType;
        this.frameworkType = builder.frameworkType;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.inferenceSpec = builder.inferenceSpec;
        this.labels = builder.labels;
        this.options = builder.options;
        this.ownerId = builder.ownerId;
        this.requestId = builder.requestId;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
        this.trainingSpec = builder.trainingSpec;
        this.uri = builder.uri;
        this.userId = builder.userId;
        this.versionDescription = builder.versionDescription;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return approvalStatus
     */
    public String getApprovalStatus() {
        return this.approvalStatus;
    }

    /**
     * @return formatType
     */
    public String getFormatType() {
        return this.formatType;
    }

    /**
     * @return frameworkType
     */
    public String getFrameworkType() {
        return this.frameworkType;
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
     * @return inferenceSpec
     */
    public java.util.Map < String, ? > getInferenceSpec() {
        return this.inferenceSpec;
    }

    /**
     * @return labels
     */
    public java.util.List < Label > getLabels() {
        return this.labels;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return trainingSpec
     */
    public java.util.Map < String, ? > getTrainingSpec() {
        return this.trainingSpec;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return versionDescription
     */
    public String getVersionDescription() {
        return this.versionDescription;
    }

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    public static final class Builder {
        private String approvalStatus; 
        private String formatType; 
        private String frameworkType; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private java.util.Map < String, ? > inferenceSpec; 
        private java.util.List < Label > labels; 
        private String options; 
        private String ownerId; 
        private String requestId; 
        private String sourceId; 
        private String sourceType; 
        private java.util.Map < String, ? > trainingSpec; 
        private String uri; 
        private String userId; 
        private String versionDescription; 
        private String versionName; 

        /**
         * ApprovalStatus.
         */
        public Builder approvalStatus(String approvalStatus) {
            this.approvalStatus = approvalStatus;
            return this;
        }

        /**
         * FormatType.
         */
        public Builder formatType(String formatType) {
            this.formatType = formatType;
            return this;
        }

        /**
         * FrameworkType.
         */
        public Builder frameworkType(String frameworkType) {
            this.frameworkType = frameworkType;
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
         * InferenceSpec.
         */
        public Builder inferenceSpec(java.util.Map < String, ? > inferenceSpec) {
            this.inferenceSpec = inferenceSpec;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List < Label > labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Options.
         */
        public Builder options(String options) {
            this.options = options;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
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
         * SourceId.
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * TrainingSpec.
         */
        public Builder trainingSpec(java.util.Map < String, ? > trainingSpec) {
            this.trainingSpec = trainingSpec;
            return this;
        }

        /**
         * Uri.
         */
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * VersionDescription.
         */
        public Builder versionDescription(String versionDescription) {
            this.versionDescription = versionDescription;
            return this;
        }

        /**
         * VersionName.
         */
        public Builder versionName(String versionName) {
            this.versionName = versionName;
            return this;
        }

        public GetModelVersionResponseBody build() {
            return new GetModelVersionResponseBody(this);
        } 

    } 

}