// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EntityDeleteRequest} extends {@link RequestModel}
 *
 * <p>EntityDeleteRequest</p>
 */
public class EntityDeleteRequest extends Request {
    @Query
    @NameInMap("del_all")
    @Validation(required = true)
    private Boolean delAll;

    @Body
    @NameInMap("entity_d_o_list")
    private java.util.List < EntityDOList> entityDOList;

    @Query
    @NameInMap("thirdpart_id")
    @Validation(required = true)
    private String thirdpartId;

    private EntityDeleteRequest(Builder builder) {
        super(builder);
        this.delAll = builder.delAll;
        this.entityDOList = builder.entityDOList;
        this.thirdpartId = builder.thirdpartId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EntityDeleteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return delAll
     */
    public Boolean getDelAll() {
        return this.delAll;
    }

    /**
     * @return entityDOList
     */
    public java.util.List < EntityDOList> getEntityDOList() {
        return this.entityDOList;
    }

    /**
     * @return thirdpartId
     */
    public String getThirdpartId() {
        return this.thirdpartId;
    }

    public static final class Builder extends Request.Builder<EntityDeleteRequest, Builder> {
        private Boolean delAll; 
        private java.util.List < EntityDOList> entityDOList; 
        private String thirdpartId; 

        private Builder() {
            super();
        } 

        private Builder(EntityDeleteRequest request) {
            super(request);
            this.delAll = request.delAll;
            this.entityDOList = request.entityDOList;
            this.thirdpartId = request.thirdpartId;
        } 

        /**
         * 是否全部删除
         */
        public Builder delAll(Boolean delAll) {
            this.putQueryParameter("del_all", delAll);
            this.delAll = delAll;
            return this;
        }

        /**
         * 删除的成员信息列表,delAll为true时可不填
         */
        public Builder entityDOList(java.util.List < EntityDOList> entityDOList) {
            String entityDOListShrink = shrink(entityDOList, "entity_d_o_list", "json");
            this.putBodyParameter("entity_d_o_list", entityDOListShrink);
            this.entityDOList = entityDOList;
            return this;
        }

        /**
         * 第三方成本中心id
         */
        public Builder thirdpartId(String thirdpartId) {
            this.putQueryParameter("thirdpart_id", thirdpartId);
            this.thirdpartId = thirdpartId;
            return this;
        }

        @Override
        public EntityDeleteRequest build() {
            return new EntityDeleteRequest(this);
        } 

    } 

    public static class EntityDOList extends TeaModel {
        @NameInMap("entity_id")
        @Validation(required = true)
        private String entityId;

        @NameInMap("entity_type")
        @Validation(required = true)
        private String entityType;

        private EntityDOList(Builder builder) {
            this.entityId = builder.entityId;
            this.entityType = builder.entityType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntityDOList create() {
            return builder().build();
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        public static final class Builder {
            private String entityId; 
            private String entityType; 

            /**
             * entity_id.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * entity_type.
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            public EntityDOList build() {
                return new EntityDOList(this);
            } 

        } 

    }
}
