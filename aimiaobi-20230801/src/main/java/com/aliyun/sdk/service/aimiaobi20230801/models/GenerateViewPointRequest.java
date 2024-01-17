// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateViewPointRequest} extends {@link RequestModel}
 *
 * <p>GenerateViewPointRequest</p>
 */
public class GenerateViewPointRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Body
    @NameInMap("ReferenceData")
    private ReferenceData referenceData;

    private GenerateViewPointRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.referenceData = builder.referenceData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateViewPointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return referenceData
     */
    public ReferenceData getReferenceData() {
        return this.referenceData;
    }

    public static final class Builder extends Request.Builder<GenerateViewPointRequest, Builder> {
        private String agentKey; 
        private ReferenceData referenceData; 

        private Builder() {
            super();
        } 

        private Builder(GenerateViewPointRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.referenceData = request.referenceData;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * ReferenceData.
         */
        public Builder referenceData(ReferenceData referenceData) {
            String referenceDataShrink = shrink(referenceData, "ReferenceData", "json");
            this.putBodyParameter("ReferenceData", referenceDataShrink);
            this.referenceData = referenceData;
            return this;
        }

        @Override
        public GenerateViewPointRequest build() {
            return new GenerateViewPointRequest(this);
        } 

    } 

    public static class ReferenceData extends TeaModel {
        @NameInMap("MiniDoc")
        private java.util.List < String > miniDoc;

        private ReferenceData(Builder builder) {
            this.miniDoc = builder.miniDoc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReferenceData create() {
            return builder().build();
        }

        /**
         * @return miniDoc
         */
        public java.util.List < String > getMiniDoc() {
            return this.miniDoc;
        }

        public static final class Builder {
            private java.util.List < String > miniDoc; 

            /**
             * MiniDoc.
             */
            public Builder miniDoc(java.util.List < String > miniDoc) {
                this.miniDoc = miniDoc;
                return this;
            }

            public ReferenceData build() {
                return new ReferenceData(this);
            } 

        } 

    }
}
