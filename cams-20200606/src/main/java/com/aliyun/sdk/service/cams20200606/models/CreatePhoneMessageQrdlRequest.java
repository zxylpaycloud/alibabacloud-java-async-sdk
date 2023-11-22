// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePhoneMessageQrdlRequest} extends {@link RequestModel}
 *
 * <p>CreatePhoneMessageQrdlRequest</p>
 */
public class CreatePhoneMessageQrdlRequest extends Request {
    @Body
    @NameInMap("CustSpaceId")
    private String custSpaceId;

    @Body
    @NameInMap("GenerateQrImage")
    @Validation(required = true)
    private String generateQrImage;

    @Body
    @NameInMap("PhoneNumber")
    @Validation(required = true)
    private String phoneNumber;

    @Body
    @NameInMap("PrefilledMessage")
    @Validation(required = true)
    private String prefilledMessage;

    private CreatePhoneMessageQrdlRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.generateQrImage = builder.generateQrImage;
        this.phoneNumber = builder.phoneNumber;
        this.prefilledMessage = builder.prefilledMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePhoneMessageQrdlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return generateQrImage
     */
    public String getGenerateQrImage() {
        return this.generateQrImage;
    }

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return prefilledMessage
     */
    public String getPrefilledMessage() {
        return this.prefilledMessage;
    }

    public static final class Builder extends Request.Builder<CreatePhoneMessageQrdlRequest, Builder> {
        private String custSpaceId; 
        private String generateQrImage; 
        private String phoneNumber; 
        private String prefilledMessage; 

        private Builder() {
            super();
        } 

        private Builder(CreatePhoneMessageQrdlRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.generateQrImage = request.generateQrImage;
            this.phoneNumber = request.phoneNumber;
            this.prefilledMessage = request.prefilledMessage;
        } 

        /**
         * CustSpaceId.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putBodyParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * GenerateQrImage.
         */
        public Builder generateQrImage(String generateQrImage) {
            this.putBodyParameter("GenerateQrImage", generateQrImage);
            this.generateQrImage = generateQrImage;
            return this;
        }

        /**
         * PhoneNumber.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putBodyParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * PrefilledMessage.
         */
        public Builder prefilledMessage(String prefilledMessage) {
            this.putBodyParameter("PrefilledMessage", prefilledMessage);
            this.prefilledMessage = prefilledMessage;
            return this;
        }

        @Override
        public CreatePhoneMessageQrdlRequest build() {
            return new CreatePhoneMessageQrdlRequest(this);
        } 

    } 

}
