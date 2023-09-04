// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAccountTransactionsRequest} extends {@link RequestModel}
 *
 * <p>QueryAccountTransactionsRequest</p>
 */
public class QueryAccountTransactionsRequest extends Request {
    @Query
    @NameInMap("CreateTimeEnd")
    private String createTimeEnd;

    @Query
    @NameInMap("CreateTimeStart")
    private String createTimeStart;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RecordID")
    private String recordID;

    @Query
    @NameInMap("TransactionChannel")
    private String transactionChannel;

    @Query
    @NameInMap("TransactionChannelSN")
    private String transactionChannelSN;

    @Query
    @NameInMap("TransactionFlow")
    private String transactionFlow;

    @Query
    @NameInMap("TransactionNumber")
    private String transactionNumber;

    @Query
    @NameInMap("TransactionType")
    private String transactionType;

    private QueryAccountTransactionsRequest(Builder builder) {
        super(builder);
        this.createTimeEnd = builder.createTimeEnd;
        this.createTimeStart = builder.createTimeStart;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.recordID = builder.recordID;
        this.transactionChannel = builder.transactionChannel;
        this.transactionChannelSN = builder.transactionChannelSN;
        this.transactionFlow = builder.transactionFlow;
        this.transactionNumber = builder.transactionNumber;
        this.transactionType = builder.transactionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAccountTransactionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTimeEnd
     */
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    /**
     * @return createTimeStart
     */
    public String getCreateTimeStart() {
        return this.createTimeStart;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return recordID
     */
    public String getRecordID() {
        return this.recordID;
    }

    /**
     * @return transactionChannel
     */
    public String getTransactionChannel() {
        return this.transactionChannel;
    }

    /**
     * @return transactionChannelSN
     */
    public String getTransactionChannelSN() {
        return this.transactionChannelSN;
    }

    /**
     * @return transactionFlow
     */
    public String getTransactionFlow() {
        return this.transactionFlow;
    }

    /**
     * @return transactionNumber
     */
    public String getTransactionNumber() {
        return this.transactionNumber;
    }

    /**
     * @return transactionType
     */
    public String getTransactionType() {
        return this.transactionType;
    }

    public static final class Builder extends Request.Builder<QueryAccountTransactionsRequest, Builder> {
        private String createTimeEnd; 
        private String createTimeStart; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String recordID; 
        private String transactionChannel; 
        private String transactionChannelSN; 
        private String transactionFlow; 
        private String transactionNumber; 
        private String transactionType; 

        private Builder() {
            super();
        } 

        private Builder(QueryAccountTransactionsRequest request) {
            super(request);
            this.createTimeEnd = request.createTimeEnd;
            this.createTimeStart = request.createTimeStart;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.recordID = request.recordID;
            this.transactionChannel = request.transactionChannel;
            this.transactionChannelSN = request.transactionChannelSN;
            this.transactionFlow = request.transactionFlow;
            this.transactionNumber = request.transactionNumber;
            this.transactionType = request.transactionType;
        } 

        /**
         * The end of the creation time range to query. By default, the transactions in the last month are queried. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. Example: 2018-01-01T00:00:00Z.
         */
        public Builder createTimeEnd(String createTimeEnd) {
            this.putQueryParameter("CreateTimeEnd", createTimeEnd);
            this.createTimeEnd = createTimeEnd;
            return this;
        }

        /**
         * The beginning of the creation time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. Example: 2018-01-01T00:00:00Z.
         */
        public Builder createTimeStart(String createTimeStart) {
            this.putQueryParameter("CreateTimeStart", createTimeStart);
            this.createTimeStart = createTimeStart;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the order or bill.
         */
        public Builder recordID(String recordID) {
            this.putQueryParameter("RecordID", recordID);
            this.recordID = recordID;
            return this;
        }

        /**
         * The transaction channel. If you specify one of the following transaction channels for this parameter, the results for the specified transaction channel are returned. If the transaction channel that you specify does not belong to the following transaction channels, no result is returned. If you leave this parameter empty, the results for all the following transaction channels are returned by default. Valid values:
         * <p>
         * 
         * *   AccountBalance
         * *   BankTransfer
         * *   Alipay
         * *   AntCreditPay
         * *   OfflineRemittance
         * *   RegularBankCreditRefund
         * *   CreditCard
         * *   MyBankCredit
         * *   HuaxiaBankCInstallment
         * *   ApplePay
         */
        public Builder transactionChannel(String transactionChannel) {
            this.putQueryParameter("TransactionChannel", transactionChannel);
            this.transactionChannel = transactionChannel;
            return this;
        }

        /**
         * The serial number of the transaction channel.
         */
        public Builder transactionChannelSN(String transactionChannelSN) {
            this.putQueryParameter("TransactionChannelSN", transactionChannelSN);
            this.transactionChannelSN = transactionChannelSN;
            return this;
        }

        /**
         * The type of the transaction flow. If you specify one of the following types for this parameter, the results for the specified type are returned. If the type that you specify does not belong to the following types, no result is returned. If you leave this parameter empty, the results for the following two types are returned by default. Valid values:
         * <p>
         * 
         * *   Income
         * *   Expense
         */
        public Builder transactionFlow(String transactionFlow) {
            this.putQueryParameter("TransactionFlow", transactionFlow);
            this.transactionFlow = transactionFlow;
            return this;
        }

        /**
         * The number of the transaction.
         */
        public Builder transactionNumber(String transactionNumber) {
            this.putQueryParameter("TransactionNumber", transactionNumber);
            this.transactionNumber = transactionNumber;
            return this;
        }

        /**
         * The type of the transaction. If you specify one of the following transaction types for this parameter, the results for the specified transaction type are returned. If the transaction type that you specify does not belong to the following types, no result is returned. If you leave this parameter empty, the results for all the following transaction types are returned by default. Valid values:
         * <p>
         * 
         * *   Payment
         * *   Withdraw
         * *   Refund
         * *   Consumption
         * *   Transfer
         * *   Adjust
         */
        public Builder transactionType(String transactionType) {
            this.putQueryParameter("TransactionType", transactionType);
            this.transactionType = transactionType;
            return this;
        }

        @Override
        public QueryAccountTransactionsRequest build() {
            return new QueryAccountTransactionsRequest(this);
        } 

    } 

}
