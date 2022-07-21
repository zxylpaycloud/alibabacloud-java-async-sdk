// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetEdgeInstanceDriverConfigsRequest} extends {@link RequestModel}
 *
 * <p>SetEdgeInstanceDriverConfigsRequest</p>
 */
public class SetEdgeInstanceDriverConfigsRequest extends Request {
    @Query
    @NameInMap("Configs")
    @Validation(required = true)
    private java.util.List < Configs> configs;

    @Query
    @NameInMap("DriverId")
    @Validation(required = true)
    private String driverId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private SetEdgeInstanceDriverConfigsRequest(Builder builder) {
        super(builder);
        this.configs = builder.configs;
        this.driverId = builder.driverId;
        this.instanceId = builder.instanceId;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetEdgeInstanceDriverConfigsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configs
     */
    public java.util.List < Configs> getConfigs() {
        return this.configs;
    }

    /**
     * @return driverId
     */
    public String getDriverId() {
        return this.driverId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<SetEdgeInstanceDriverConfigsRequest, Builder> {
        private java.util.List < Configs> configs; 
        private String driverId; 
        private String instanceId; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(SetEdgeInstanceDriverConfigsRequest request) {
            super(request);
            this.configs = request.configs;
            this.driverId = request.driverId;
            this.instanceId = request.instanceId;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * Configs.
         */
        public Builder configs(java.util.List < Configs> configs) {
            this.putQueryParameter("Configs", configs);
            this.configs = configs;
            return this;
        }

        /**
         * DriverId.
         */
        public Builder driverId(String driverId) {
            this.putQueryParameter("DriverId", driverId);
            this.driverId = driverId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        @Override
        public SetEdgeInstanceDriverConfigsRequest build() {
            return new SetEdgeInstanceDriverConfigsRequest(this);
        } 

    } 

    public static class Configs extends TeaModel {
        @NameInMap("Content")
        @Validation(required = true)
        private String content;

        @NameInMap("Format")
        @Validation(required = true)
        private String format;

        @NameInMap("Key")
        private String key;

        private Configs(Builder builder) {
            this.content = builder.content;
            this.format = builder.format;
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String content; 
            private String format; 
            private String key; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
}
