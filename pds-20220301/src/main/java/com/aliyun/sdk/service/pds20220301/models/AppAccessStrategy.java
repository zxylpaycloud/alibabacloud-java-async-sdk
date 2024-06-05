// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AppAccessStrategy} extends {@link TeaModel}
 *
 * <p>AppAccessStrategy</p>
 */
public class AppAccessStrategy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("effect")
    private String effect;

    @com.aliyun.core.annotation.NameInMap("except_app_id_list")
    private java.util.List < String > exceptAppIdList;

    private AppAccessStrategy(Builder builder) {
        this.effect = builder.effect;
        this.exceptAppIdList = builder.exceptAppIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppAccessStrategy create() {
        return builder().build();
    }

    /**
     * @return effect
     */
    public String getEffect() {
        return this.effect;
    }

    /**
     * @return exceptAppIdList
     */
    public java.util.List < String > getExceptAppIdList() {
        return this.exceptAppIdList;
    }

    public static final class Builder {
        private String effect; 
        private java.util.List < String > exceptAppIdList; 

        /**
         * effect.
         */
        public Builder effect(String effect) {
            this.effect = effect;
            return this;
        }

        /**
         * except_app_id_list.
         */
        public Builder exceptAppIdList(java.util.List < String > exceptAppIdList) {
            this.exceptAppIdList = exceptAppIdList;
            return this;
        }

        public AppAccessStrategy build() {
            return new AppAccessStrategy(this);
        } 

    } 

}
