// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachLabelRequest} extends {@link RequestModel}
 *
 * <p>DetachLabelRequest</p>
 */
public class DetachLabelRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelContent")
    private String labelContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelId")
    private String labelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SerialNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serialNo;

    private DetachLabelRequest(Builder builder) {
        super(builder);
        this.labelContent = builder.labelContent;
        this.labelId = builder.labelId;
        this.serialNo = builder.serialNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachLabelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return labelContent
     */
    public String getLabelContent() {
        return this.labelContent;
    }

    /**
     * @return labelId
     */
    public String getLabelId() {
        return this.labelId;
    }

    /**
     * @return serialNo
     */
    public String getSerialNo() {
        return this.serialNo;
    }

    public static final class Builder extends Request.Builder<DetachLabelRequest, Builder> {
        private String labelContent; 
        private String labelId; 
        private String serialNo; 

        private Builder() {
            super();
        } 

        private Builder(DetachLabelRequest request) {
            super(request);
            this.labelContent = request.labelContent;
            this.labelId = request.labelId;
            this.serialNo = request.serialNo;
        } 

        /**
         * LabelContent.
         */
        public Builder labelContent(String labelContent) {
            this.putBodyParameter("LabelContent", labelContent);
            this.labelContent = labelContent;
            return this;
        }

        /**
         * LabelId.
         */
        public Builder labelId(String labelId) {
            this.putBodyParameter("LabelId", labelId);
            this.labelId = labelId;
            return this;
        }

        /**
         * SerialNo.
         */
        public Builder serialNo(String serialNo) {
            this.putBodyParameter("SerialNo", serialNo);
            this.serialNo = serialNo;
            return this;
        }

        @Override
        public DetachLabelRequest build() {
            return new DetachLabelRequest(this);
        } 

    } 

}
