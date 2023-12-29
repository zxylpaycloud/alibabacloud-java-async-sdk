// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifySmsCodeRequest} extends {@link RequestModel}
 *
 * <p>VerifySmsCodeRequest</p>
 */
public class VerifySmsCodeRequest extends Request {
    @Query
    @NameInMap("PhoneNumber")
    @Validation(required = true)
    private String phoneNumber;

    @Query
    @NameInMap("SmsCode")
    @Validation(required = true)
    private String smsCode;

    @Query
    @NameInMap("SmsToken")
    @Validation(required = true)
    private String smsToken;

    private VerifySmsCodeRequest(Builder builder) {
        super(builder);
        this.phoneNumber = builder.phoneNumber;
        this.smsCode = builder.smsCode;
        this.smsToken = builder.smsToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifySmsCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return smsCode
     */
    public String getSmsCode() {
        return this.smsCode;
    }

    /**
     * @return smsToken
     */
    public String getSmsToken() {
        return this.smsToken;
    }

    public static final class Builder extends Request.Builder<VerifySmsCodeRequest, Builder> {
        private String phoneNumber; 
        private String smsCode; 
        private String smsToken; 

        private Builder() {
            super();
        } 

        private Builder(VerifySmsCodeRequest request) {
            super(request);
            this.phoneNumber = request.phoneNumber;
            this.smsCode = request.smsCode;
            this.smsToken = request.smsToken;
        } 

        /**
         * The phone number, which is used to receive SMS verification codes.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * The SMS verification code.
         */
        public Builder smsCode(String smsCode) {
            this.putQueryParameter("SmsCode", smsCode);
            this.smsCode = smsCode;
            return this;
        }

        /**
         * The text message verification code. After you successfully call the corresponding API operation to send the SMS verification code, the end users receive the SMS verification code. SmsToken is returned by the SDK for SMS verification for you to verify the text message verification code. For an Android client, sendVerifyCode is called to send the verification code. For an iOS client, sendVerifyCodeWithTimeout is called to send the verification code. For more information, see [Overview](~~400434~~).
         */
        public Builder smsToken(String smsToken) {
            this.putQueryParameter("SmsToken", smsToken);
            this.smsToken = smsToken;
            return this;
        }

        @Override
        public VerifySmsCodeRequest build() {
            return new VerifySmsCodeRequest(this);
        } 

    } 

}
