// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.expressconnectrouter20230901.models.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    CompletableFuture<AttachExpressConnectRouterChildInstanceResponse> attachExpressConnectRouterChildInstance(AttachExpressConnectRouterChildInstanceRequest request);

    CompletableFuture<CheckAddRegionToExpressConnectRouterResponse> checkAddRegionToExpressConnectRouter(CheckAddRegionToExpressConnectRouterRequest request);

    CompletableFuture<CreateExpressConnectRouterResponse> createExpressConnectRouter(CreateExpressConnectRouterRequest request);

    CompletableFuture<CreateExpressConnectRouterAssociationResponse> createExpressConnectRouterAssociation(CreateExpressConnectRouterAssociationRequest request);

    CompletableFuture<DeleteExpressConnectRouterResponse> deleteExpressConnectRouter(DeleteExpressConnectRouterRequest request);

    CompletableFuture<DeleteExpressConnectRouterAssociationResponse> deleteExpressConnectRouterAssociation(DeleteExpressConnectRouterAssociationRequest request);

    CompletableFuture<DescribeDisabledExpressConnectRouterRouteEntriesResponse> describeDisabledExpressConnectRouterRouteEntries(DescribeDisabledExpressConnectRouterRouteEntriesRequest request);

    CompletableFuture<DescribeExpressConnectRouterResponse> describeExpressConnectRouter(DescribeExpressConnectRouterRequest request);

    CompletableFuture<DescribeExpressConnectRouterAllowedPrefixHistoryResponse> describeExpressConnectRouterAllowedPrefixHistory(DescribeExpressConnectRouterAllowedPrefixHistoryRequest request);

    CompletableFuture<DescribeExpressConnectRouterAssociationResponse> describeExpressConnectRouterAssociation(DescribeExpressConnectRouterAssociationRequest request);

    CompletableFuture<DescribeExpressConnectRouterChildInstanceResponse> describeExpressConnectRouterChildInstance(DescribeExpressConnectRouterChildInstanceRequest request);

    CompletableFuture<DescribeExpressConnectRouterInterRegionTransitModeResponse> describeExpressConnectRouterInterRegionTransitMode(DescribeExpressConnectRouterInterRegionTransitModeRequest request);

    CompletableFuture<DescribeExpressConnectRouterRegionResponse> describeExpressConnectRouterRegion(DescribeExpressConnectRouterRegionRequest request);

    CompletableFuture<DescribeExpressConnectRouterRouteEntriesResponse> describeExpressConnectRouterRouteEntries(DescribeExpressConnectRouterRouteEntriesRequest request);

    CompletableFuture<DescribeInstanceGrantedToExpressConnectRouterResponse> describeInstanceGrantedToExpressConnectRouter(DescribeInstanceGrantedToExpressConnectRouterRequest request);

    CompletableFuture<DetachExpressConnectRouterChildInstanceResponse> detachExpressConnectRouterChildInstance(DetachExpressConnectRouterChildInstanceRequest request);

    CompletableFuture<DisableExpressConnectRouterRouteEntriesResponse> disableExpressConnectRouterRouteEntries(DisableExpressConnectRouterRouteEntriesRequest request);

    CompletableFuture<EnableExpressConnectRouterRouteEntriesResponse> enableExpressConnectRouterRouteEntries(EnableExpressConnectRouterRouteEntriesRequest request);

    CompletableFuture<ForceDeleteExpressConnectRouterResponse> forceDeleteExpressConnectRouter(ForceDeleteExpressConnectRouterRequest request);

    CompletableFuture<GetExpressConnectRouterResponse> getExpressConnectRouter(GetExpressConnectRouterRequest request);

    CompletableFuture<GrantInstanceToExpressConnectRouterResponse> grantInstanceToExpressConnectRouter(GrantInstanceToExpressConnectRouterRequest request);

    CompletableFuture<ListExpressConnectRouterSupportedRegionResponse> listExpressConnectRouterSupportedRegion(ListExpressConnectRouterSupportedRegionRequest request);

    CompletableFuture<ModifyExpressConnectRouterResponse> modifyExpressConnectRouter(ModifyExpressConnectRouterRequest request);

    CompletableFuture<ModifyExpressConnectRouterAssociationAllowedPrefixResponse> modifyExpressConnectRouterAssociationAllowedPrefix(ModifyExpressConnectRouterAssociationAllowedPrefixRequest request);

    CompletableFuture<ModifyExpressConnectRouterInterRegionTransitModeResponse> modifyExpressConnectRouterInterRegionTransitMode(ModifyExpressConnectRouterInterRegionTransitModeRequest request);

    CompletableFuture<RevokeInstanceFromExpressConnectRouterResponse> revokeInstanceFromExpressConnectRouter(RevokeInstanceFromExpressConnectRouterRequest request);

    CompletableFuture<SynchronizeExpressConnectRouterInterRegionBandwidthResponse> synchronizeExpressConnectRouterInterRegionBandwidth(SynchronizeExpressConnectRouterInterRegionBandwidthRequest request);

}
