// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUpsertCollectionDataJobRequest} extends {@link RequestModel}
 *
 * <p>GetUpsertCollectionDataJobRequest</p>
 */
public class GetUpsertCollectionDataJobRequest extends Request {
    @Body
    @NameInMap("Collection")
    @Validation(required = true)
    private String collection;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Body
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Body
    @NameInMap("Namespace")
    private String namespace;

    @Body
    @NameInMap("NamespacePassword")
    @Validation(required = true)
    private String namespacePassword;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetUpsertCollectionDataJobRequest(Builder builder) {
        super(builder);
        this.collection = builder.collection;
        this.DBInstanceId = builder.DBInstanceId;
        this.jobId = builder.jobId;
        this.namespace = builder.namespace;
        this.namespacePassword = builder.namespacePassword;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUpsertCollectionDataJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collection
     */
    public String getCollection() {
        return this.collection;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return namespacePassword
     */
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetUpsertCollectionDataJobRequest, Builder> {
        private String collection; 
        private String DBInstanceId; 
        private String jobId; 
        private String namespace; 
        private String namespacePassword; 
        private Long ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetUpsertCollectionDataJobRequest request) {
            super(request);
            this.collection = request.collection;
            this.DBInstanceId = request.DBInstanceId;
            this.jobId = request.jobId;
            this.namespace = request.namespace;
            this.namespacePassword = request.namespacePassword;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
        } 

        /**
         * Collection.
         */
        public Builder collection(String collection) {
            this.putBodyParameter("Collection", collection);
            this.collection = collection;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * NamespacePassword.
         */
        public Builder namespacePassword(String namespacePassword) {
            this.putBodyParameter("NamespacePassword", namespacePassword);
            this.namespacePassword = namespacePassword;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetUpsertCollectionDataJobRequest build() {
            return new GetUpsertCollectionDataJobRequest(this);
        } 

    } 

}
