// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTableMetaRequest} extends {@link RequestModel}
 *
 * <p>UpdateTableMetaRequest</p>
 */
public class UpdateTableMetaRequest extends Request {
    @Path
    @NameInMap("TableMetaId")
    @Validation(required = true)
    private String tableMetaId;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("Fields")
    @Validation(required = true)
    private java.util.List < Fields> fields;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("Module")
    @Validation(required = true)
    private String module;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Body
    @NameInMap("TableName")
    @Validation(required = true)
    private String tableName;

    private UpdateTableMetaRequest(Builder builder) {
        super(builder);
        this.tableMetaId = builder.tableMetaId;
        this.description = builder.description;
        this.fields = builder.fields;
        this.instanceId = builder.instanceId;
        this.module = builder.module;
        this.name = builder.name;
        this.resourceId = builder.resourceId;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTableMetaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tableMetaId
     */
    public String getTableMetaId() {
        return this.tableMetaId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fields
     */
    public java.util.List < Fields> getFields() {
        return this.fields;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return module
     */
    public String getModule() {
        return this.module;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<UpdateTableMetaRequest, Builder> {
        private String tableMetaId; 
        private String description; 
        private java.util.List < Fields> fields; 
        private String instanceId; 
        private String module; 
        private String name; 
        private String resourceId; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTableMetaRequest request) {
            super(request);
            this.tableMetaId = request.tableMetaId;
            this.description = request.description;
            this.fields = request.fields;
            this.instanceId = request.instanceId;
            this.module = request.module;
            this.name = request.name;
            this.resourceId = request.resourceId;
            this.tableName = request.tableName;
        } 

        /**
         * TableMetaId.
         */
        public Builder tableMetaId(String tableMetaId) {
            this.putPathParameter("TableMetaId", tableMetaId);
            this.tableMetaId = tableMetaId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Fields.
         */
        public Builder fields(java.util.List < Fields> fields) {
            this.putBodyParameter("Fields", fields);
            this.fields = fields;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Module.
         */
        public Builder module(String module) {
            this.putBodyParameter("Module", module);
            this.module = module;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putBodyParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.putBodyParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public UpdateTableMetaRequest build() {
            return new UpdateTableMetaRequest(this);
        } 

    } 

    public static class Fields extends TeaModel {
        @NameInMap("DataType")
        private String dataType;

        @NameInMap("IsDimensionField")
        @Validation(required = true)
        private Boolean isDimensionField;

        @NameInMap("IsPartitionField")
        @Validation(required = true)
        private String isPartitionField;

        @NameInMap("Meaning")
        @Validation(required = true)
        private String meaning;

        @NameInMap("Name")
        @Validation(required = true)
        private String name;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        private Fields(Builder builder) {
            this.dataType = builder.dataType;
            this.isDimensionField = builder.isDimensionField;
            this.isPartitionField = builder.isPartitionField;
            this.meaning = builder.meaning;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fields create() {
            return builder().build();
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return isDimensionField
         */
        public Boolean getIsDimensionField() {
            return this.isDimensionField;
        }

        /**
         * @return isPartitionField
         */
        public String getIsPartitionField() {
            return this.isPartitionField;
        }

        /**
         * @return meaning
         */
        public String getMeaning() {
            return this.meaning;
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
            private String dataType; 
            private Boolean isDimensionField; 
            private String isPartitionField; 
            private String meaning; 
            private String name; 
            private String type; 

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * IsDimensionField.
             */
            public Builder isDimensionField(Boolean isDimensionField) {
                this.isDimensionField = isDimensionField;
                return this;
            }

            /**
             * IsPartitionField.
             */
            public Builder isPartitionField(String isPartitionField) {
                this.isPartitionField = isPartitionField;
                return this;
            }

            /**
             * Meaning.
             */
            public Builder meaning(String meaning) {
                this.meaning = meaning;
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

            public Fields build() {
                return new Fields(this);
            } 

        } 

    }
}
