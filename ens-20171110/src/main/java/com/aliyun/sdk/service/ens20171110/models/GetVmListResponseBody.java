// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVmListResponseBody} extends {@link TeaModel}
 *
 * <p>GetVmListResponseBody</p>
 */
public class GetVmListResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private String data;

    @NameInMap("Desc")
    private String desc;

    @NameInMap("Msg")
    @Validation(required = true)
    private String msg;

    @NameInMap("RequestId")
    private String requestId;

    private GetVmListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.desc = builder.desc;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVmListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private String data; 
        private String desc; 
        private String msg; 
        private String requestId; 

        /**
         * 业务状态码
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * 业务数据
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * Desc.
         */
        public Builder desc(String desc) {
            this.desc = desc;
            return this;
        }

        /**
         * 返回信息
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetVmListResponseBody build() {
            return new GetVmListResponseBody(this);
        } 

    } 

}
