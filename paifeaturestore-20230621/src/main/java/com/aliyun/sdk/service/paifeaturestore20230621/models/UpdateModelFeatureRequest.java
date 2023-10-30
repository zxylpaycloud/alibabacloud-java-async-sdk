// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateModelFeatureRequest} extends {@link RequestModel}
 *
 * <p>UpdateModelFeatureRequest</p>
 */
public class UpdateModelFeatureRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("ModelFeatureId")
    @Validation(required = true)
    private String modelFeatureId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Features")
    private java.util.List < Features> features;

    @Body
    @NameInMap("LabelTableId")
    private String labelTableId;

    @Body
    @NameInMap("SequenceFeatureViewIds")
    private java.util.List < String > sequenceFeatureViewIds;

    private UpdateModelFeatureRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.modelFeatureId = builder.modelFeatureId;
        this.regionId = builder.regionId;
        this.features = builder.features;
        this.labelTableId = builder.labelTableId;
        this.sequenceFeatureViewIds = builder.sequenceFeatureViewIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelFeatureRequest create() {
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
     * @return modelFeatureId
     */
    public String getModelFeatureId() {
        return this.modelFeatureId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return features
     */
    public java.util.List < Features> getFeatures() {
        return this.features;
    }

    /**
     * @return labelTableId
     */
    public String getLabelTableId() {
        return this.labelTableId;
    }

    /**
     * @return sequenceFeatureViewIds
     */
    public java.util.List < String > getSequenceFeatureViewIds() {
        return this.sequenceFeatureViewIds;
    }

    public static final class Builder extends Request.Builder<UpdateModelFeatureRequest, Builder> {
        private String instanceId; 
        private String modelFeatureId; 
        private String regionId; 
        private java.util.List < Features> features; 
        private String labelTableId; 
        private java.util.List < String > sequenceFeatureViewIds; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModelFeatureRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.modelFeatureId = request.modelFeatureId;
            this.regionId = request.regionId;
            this.features = request.features;
            this.labelTableId = request.labelTableId;
            this.sequenceFeatureViewIds = request.sequenceFeatureViewIds;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ModelFeatureId.
         */
        public Builder modelFeatureId(String modelFeatureId) {
            this.putPathParameter("ModelFeatureId", modelFeatureId);
            this.modelFeatureId = modelFeatureId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Features.
         */
        public Builder features(java.util.List < Features> features) {
            this.putBodyParameter("Features", features);
            this.features = features;
            return this;
        }

        /**
         * LabelTableId.
         */
        public Builder labelTableId(String labelTableId) {
            this.putBodyParameter("LabelTableId", labelTableId);
            this.labelTableId = labelTableId;
            return this;
        }

        /**
         * SequenceFeatureViewIds.
         */
        public Builder sequenceFeatureViewIds(java.util.List < String > sequenceFeatureViewIds) {
            this.putBodyParameter("SequenceFeatureViewIds", sequenceFeatureViewIds);
            this.sequenceFeatureViewIds = sequenceFeatureViewIds;
            return this;
        }

        @Override
        public UpdateModelFeatureRequest build() {
            return new UpdateModelFeatureRequest(this);
        } 

    } 

    public static class Features extends TeaModel {
        @NameInMap("AliasName")
        private String aliasName;

        @NameInMap("FeatureViewId")
        @Validation(required = true)
        private String featureViewId;

        @NameInMap("Name")
        @Validation(required = true)
        private String name;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        private Features(Builder builder) {
            this.aliasName = builder.aliasName;
            this.featureViewId = builder.featureViewId;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Features create() {
            return builder().build();
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return featureViewId
         */
        public String getFeatureViewId() {
            return this.featureViewId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String aliasName; 
            private String featureViewId; 
            private String name; 
            private String type; 

            /**
             * AliasName.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * FeatureViewId.
             */
            public Builder featureViewId(String featureViewId) {
                this.featureViewId = featureViewId;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Features build() {
                return new Features(this);
            } 

        } 

    }
}
