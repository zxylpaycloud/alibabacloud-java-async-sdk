// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopSnatIpForSnatEntryRequest} extends {@link RequestModel}
 *
 * <p>StopSnatIpForSnatEntryRequest</p>
 */
public class StopSnatIpForSnatEntryRequest extends Request {
    @Query
    @NameInMap("SnatEntryId")
    @Validation(required = true)
    private String snatEntryId;

    @Query
    @NameInMap("SnatIp")
    @Validation(required = true)
    private String snatIp;

    private StopSnatIpForSnatEntryRequest(Builder builder) {
        super(builder);
        this.snatEntryId = builder.snatEntryId;
        this.snatIp = builder.snatIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopSnatIpForSnatEntryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return snatEntryId
     */
    public String getSnatEntryId() {
        return this.snatEntryId;
    }

    /**
     * @return snatIp
     */
    public String getSnatIp() {
        return this.snatIp;
    }

    public static final class Builder extends Request.Builder<StopSnatIpForSnatEntryRequest, Builder> {
        private String snatEntryId; 
        private String snatIp; 

        private Builder() {
            super();
        } 

        private Builder(StopSnatIpForSnatEntryRequest request) {
            super(request);
            this.snatEntryId = request.snatEntryId;
            this.snatIp = request.snatIp;
        } 

        /**
         * The ID of the SNAT entry.
         */
        public Builder snatEntryId(String snatEntryId) {
            this.putQueryParameter("SnatEntryId", snatEntryId);
            this.snatEntryId = snatEntryId;
            return this;
        }

        /**
         * The EIP specified in the SNAT entry.
         */
        public Builder snatIp(String snatIp) {
            this.putQueryParameter("SnatIp", snatIp);
            this.snatIp = snatIp;
            return this;
        }

        @Override
        public StopSnatIpForSnatEntryRequest build() {
            return new StopSnatIpForSnatEntryRequest(this);
        } 

    } 

}
