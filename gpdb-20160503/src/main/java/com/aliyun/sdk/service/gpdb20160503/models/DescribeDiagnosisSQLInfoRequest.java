// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosisSQLInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeDiagnosisSQLInfoRequest</p>
 */
public class DescribeDiagnosisSQLInfoRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("Database")
    @Validation(required = true)
    private String database;

    @Query
    @NameInMap("QueryID")
    @Validation(required = true)
    private String queryID;

    private DescribeDiagnosisSQLInfoRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.database = builder.database;
        this.queryID = builder.queryID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosisSQLInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return queryID
     */
    public String getQueryID() {
        return this.queryID;
    }

    public static final class Builder extends Request.Builder<DescribeDiagnosisSQLInfoRequest, Builder> {
        private String DBInstanceId; 
        private String database; 
        private String queryID; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDiagnosisSQLInfoRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.database = request.database;
            this.queryID = request.queryID;
        } 

        /**
         * The ID of the instance.
         * <p>
         * 
         * >  You can call the [DescribeDBInstances](~~86911~~) operation to query the details of all AnalyticDB for PostgreSQL instances in a specific region, including instance IDs.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The name of the database.
         */
        public Builder database(String database) {
            this.putQueryParameter("Database", database);
            this.database = database;
            return this;
        }

        /**
         * The ID of the query. It is a unique identifier of the query.
         * <p>
         * 
         * >  You can call the [DescribeDiagnosisRecords](~~450511~~) operation to query the query ID.
         */
        public Builder queryID(String queryID) {
            this.putQueryParameter("QueryID", queryID);
            this.queryID = queryID;
            return this;
        }

        @Override
        public DescribeDiagnosisSQLInfoRequest build() {
            return new DescribeDiagnosisSQLInfoRequest(this);
        } 

    } 

}