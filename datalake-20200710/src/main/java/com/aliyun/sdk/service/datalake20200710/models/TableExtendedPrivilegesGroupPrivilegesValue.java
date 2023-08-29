// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TableExtendedPrivilegesGroupPrivilegesValue} extends {@link TeaModel}
 *
 * <p>TableExtendedPrivilegesGroupPrivilegesValue</p>
 */
public class TableExtendedPrivilegesGroupPrivilegesValue extends TeaModel {
    @NameInMap("CreateTime")
    private Integer createTime;

    @NameInMap("GrantOption")
    private Boolean grantOption;

    @NameInMap("Grantor")
    private String grantor;

    @NameInMap("GrantorType")
    private String grantorType;

    @NameInMap("Privilege")
    private String privilege;

    private TableExtendedPrivilegesGroupPrivilegesValue(Builder builder) {
        this.createTime = builder.createTime;
        this.grantOption = builder.grantOption;
        this.grantor = builder.grantor;
        this.grantorType = builder.grantorType;
        this.privilege = builder.privilege;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TableExtendedPrivilegesGroupPrivilegesValue create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public Integer getCreateTime() {
        return this.createTime;
    }

    /**
     * @return grantOption
     */
    public Boolean getGrantOption() {
        return this.grantOption;
    }

    /**
     * @return grantor
     */
    public String getGrantor() {
        return this.grantor;
    }

    /**
     * @return grantorType
     */
    public String getGrantorType() {
        return this.grantorType;
    }

    /**
     * @return privilege
     */
    public String getPrivilege() {
        return this.privilege;
    }

    public static final class Builder {
        private Integer createTime; 
        private Boolean grantOption; 
        private String grantor; 
        private String grantorType; 
        private String privilege; 

        /**
         * CreateTime.
         */
        public Builder createTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * GrantOption.
         */
        public Builder grantOption(Boolean grantOption) {
            this.grantOption = grantOption;
            return this;
        }

        /**
         * Grantor.
         */
        public Builder grantor(String grantor) {
            this.grantor = grantor;
            return this;
        }

        /**
         * GrantorType.
         */
        public Builder grantorType(String grantorType) {
            this.grantorType = grantorType;
            return this;
        }

        /**
         * Privilege.
         */
        public Builder privilege(String privilege) {
            this.privilege = privilege;
            return this;
        }

        public TableExtendedPrivilegesGroupPrivilegesValue build() {
            return new TableExtendedPrivilegesGroupPrivilegesValue(this);
        } 

    } 

}
