// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.baas20181221.models.*;
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

    CompletableFuture<AcceptFabricInvitationResponse> acceptFabricInvitation(AcceptFabricInvitationRequest request);

    CompletableFuture<ApplyAntChainCertificateResponse> applyAntChainCertificate(ApplyAntChainCertificateRequest request);

    CompletableFuture<ApplyAntChainCertificateWithKeyAutoCreationResponse> applyAntChainCertificateWithKeyAutoCreation(ApplyAntChainCertificateWithKeyAutoCreationRequest request);

    CompletableFuture<BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse> batchAddAntChainMiniAppQRCodeAuthorizedUsers(BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest request);

    CompletableFuture<CheckFabricConsortiumDomainResponse> checkFabricConsortiumDomain(CheckFabricConsortiumDomainRequest request);

    CompletableFuture<CheckFabricOrganizationDomainResponse> checkFabricOrganizationDomain(CheckFabricOrganizationDomainRequest request);

    CompletableFuture<ConfirmFabricConsortiumMemberResponse> confirmFabricConsortiumMember(ConfirmFabricConsortiumMemberRequest request);

    CompletableFuture<CopyAntChainContractProjectResponse> copyAntChainContractProject(CopyAntChainContractProjectRequest request);

    CompletableFuture<CreateAntChainAccountResponse> createAntChainAccount(CreateAntChainAccountRequest request);

    CompletableFuture<CreateAntChainAccountWithKeyPairAutoCreationResponse> createAntChainAccountWithKeyPairAutoCreation(CreateAntChainAccountWithKeyPairAutoCreationRequest request);

    CompletableFuture<CreateAntChainConsortiumResponse> createAntChainConsortium(CreateAntChainConsortiumRequest request);

    CompletableFuture<CreateAntChainContractContentResponse> createAntChainContractContent(CreateAntChainContractContentRequest request);

    CompletableFuture<CreateAntChainContractProjectResponse> createAntChainContractProject(CreateAntChainContractProjectRequest request);

    CompletableFuture<CreateFabricChaincodeResponse> createFabricChaincode(CreateFabricChaincodeRequest request);

    CompletableFuture<CreateFabricChannelResponse> createFabricChannel(CreateFabricChannelRequest request);

    CompletableFuture<CreateFabricChannelMemberResponse> createFabricChannelMember(CreateFabricChannelMemberRequest request);

    CompletableFuture<CreateFabricConsortiumResponse> createFabricConsortium(CreateFabricConsortiumRequest request);

    CompletableFuture<CreateFabricConsortiumMemberResponse> createFabricConsortiumMember(CreateFabricConsortiumMemberRequest request);

    CompletableFuture<CreateFabricOrganizationResponse> createFabricOrganization(CreateFabricOrganizationRequest request);

    CompletableFuture<CreateFabricOrganizationUserResponse> createFabricOrganizationUser(CreateFabricOrganizationUserRequest request);

    CompletableFuture<DeleteAntChainConsortiumResponse> deleteAntChainConsortium(DeleteAntChainConsortiumRequest request);

    CompletableFuture<DeleteAntChainContractContentResponse> deleteAntChainContractContent(DeleteAntChainContractContentRequest request);

    CompletableFuture<DeleteAntChainContractProjectResponse> deleteAntChainContractProject(DeleteAntChainContractProjectRequest request);

    CompletableFuture<DeleteAntChainMiniAppQRCodeAuthorizedUserResponse> deleteAntChainMiniAppQRCodeAuthorizedUser(DeleteAntChainMiniAppQRCodeAuthorizedUserRequest request);

    CompletableFuture<DeleteFabricChaincodeResponse> deleteFabricChaincode(DeleteFabricChaincodeRequest request);

    CompletableFuture<DescribeAntChainAccountsResponse> describeAntChainAccounts(DescribeAntChainAccountsRequest request);

    CompletableFuture<DescribeAntChainAccountsV2Response> describeAntChainAccountsV2(DescribeAntChainAccountsV2Request request);

    CompletableFuture<DescribeAntChainBlockResponse> describeAntChainBlock(DescribeAntChainBlockRequest request);

    CompletableFuture<DescribeAntChainBlockV2Response> describeAntChainBlockV2(DescribeAntChainBlockV2Request request);

    CompletableFuture<DescribeAntChainCertificateApplicationsResponse> describeAntChainCertificateApplications(DescribeAntChainCertificateApplicationsRequest request);

    CompletableFuture<DescribeAntChainCertificateApplicationsV2Response> describeAntChainCertificateApplicationsV2(DescribeAntChainCertificateApplicationsV2Request request);

    CompletableFuture<DescribeAntChainConsortiumsResponse> describeAntChainConsortiums(DescribeAntChainConsortiumsRequest request);

    CompletableFuture<DescribeAntChainConsortiumsV2Response> describeAntChainConsortiumsV2(DescribeAntChainConsortiumsV2Request request);

    CompletableFuture<DescribeAntChainContractProjectContentTreeResponse> describeAntChainContractProjectContentTree(DescribeAntChainContractProjectContentTreeRequest request);

    CompletableFuture<DescribeAntChainContractProjectContentTreeV2Response> describeAntChainContractProjectContentTreeV2(DescribeAntChainContractProjectContentTreeV2Request request);

    CompletableFuture<DescribeAntChainContractProjectsResponse> describeAntChainContractProjects(DescribeAntChainContractProjectsRequest request);

    CompletableFuture<DescribeAntChainContractProjectsV2Response> describeAntChainContractProjectsV2(DescribeAntChainContractProjectsV2Request request);

    CompletableFuture<DescribeAntChainDownloadPathsResponse> describeAntChainDownloadPaths(DescribeAntChainDownloadPathsRequest request);

    CompletableFuture<DescribeAntChainDownloadPathsV2Response> describeAntChainDownloadPathsV2(DescribeAntChainDownloadPathsV2Request request);

    CompletableFuture<DescribeAntChainInformationResponse> describeAntChainInformation(DescribeAntChainInformationRequest request);

    CompletableFuture<DescribeAntChainInformationV2Response> describeAntChainInformationV2(DescribeAntChainInformationV2Request request);

    CompletableFuture<DescribeAntChainLatestBlocksResponse> describeAntChainLatestBlocks(DescribeAntChainLatestBlocksRequest request);

    CompletableFuture<DescribeAntChainLatestBlocksV2Response> describeAntChainLatestBlocksV2(DescribeAntChainLatestBlocksV2Request request);

    CompletableFuture<DescribeAntChainLatestTransactionDigestsResponse> describeAntChainLatestTransactionDigests(DescribeAntChainLatestTransactionDigestsRequest request);

    CompletableFuture<DescribeAntChainLatestTransactionDigestsV2Response> describeAntChainLatestTransactionDigestsV2(DescribeAntChainLatestTransactionDigestsV2Request request);

    CompletableFuture<DescribeAntChainMembersResponse> describeAntChainMembers(DescribeAntChainMembersRequest request);

    CompletableFuture<DescribeAntChainMembersV2Response> describeAntChainMembersV2(DescribeAntChainMembersV2Request request);

    CompletableFuture<DescribeAntChainMiniAppBrowserQRCodeAccessLogResponse> describeAntChainMiniAppBrowserQRCodeAccessLog(DescribeAntChainMiniAppBrowserQRCodeAccessLogRequest request);

    CompletableFuture<DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Response> describeAntChainMiniAppBrowserQRCodeAccessLogV2(DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Request request);

    CompletableFuture<DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse> describeAntChainMiniAppBrowserQRCodeAuthorizedUsers(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersRequest request);

    CompletableFuture<DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response> describeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Request request);

    CompletableFuture<DescribeAntChainMiniAppBrowserTransactionQRCodeResponse> describeAntChainMiniAppBrowserTransactionQRCode(DescribeAntChainMiniAppBrowserTransactionQRCodeRequest request);

    CompletableFuture<DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse> describeAntChainMiniAppBrowserTransactionQRCodeNew(DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest request);

    CompletableFuture<DescribeAntChainNodesResponse> describeAntChainNodes(DescribeAntChainNodesRequest request);

    CompletableFuture<DescribeAntChainNodesV2Response> describeAntChainNodesV2(DescribeAntChainNodesV2Request request);

    CompletableFuture<DescribeAntChainQRCodeAuthorizationResponse> describeAntChainQRCodeAuthorization(DescribeAntChainQRCodeAuthorizationRequest request);

    CompletableFuture<DescribeAntChainQRCodeAuthorizationV2Response> describeAntChainQRCodeAuthorizationV2(DescribeAntChainQRCodeAuthorizationV2Request request);

    CompletableFuture<DescribeAntChainTransactionResponse> describeAntChainTransaction(DescribeAntChainTransactionRequest request);

    CompletableFuture<DescribeAntChainTransactionReceiptResponse> describeAntChainTransactionReceipt(DescribeAntChainTransactionReceiptRequest request);

    CompletableFuture<DescribeAntChainTransactionReceiptV2Response> describeAntChainTransactionReceiptV2(DescribeAntChainTransactionReceiptV2Request request);

    CompletableFuture<DescribeAntChainTransactionStatisticsResponse> describeAntChainTransactionStatistics(DescribeAntChainTransactionStatisticsRequest request);

    CompletableFuture<DescribeAntChainTransactionStatisticsV2Response> describeAntChainTransactionStatisticsV2(DescribeAntChainTransactionStatisticsV2Request request);

    CompletableFuture<DescribeAntChainTransactionV2Response> describeAntChainTransactionV2(DescribeAntChainTransactionV2Request request);

    CompletableFuture<DescribeAntChainsResponse> describeAntChains(DescribeAntChainsRequest request);

    CompletableFuture<DescribeAntChainsV2Response> describeAntChainsV2(DescribeAntChainsV2Request request);

    CompletableFuture<DescribeEthereumDeletableResponse> describeEthereumDeletable(DescribeEthereumDeletableRequest request);

    CompletableFuture<DescribeFabricCandidateOrganizationsResponse> describeFabricCandidateOrganizations(DescribeFabricCandidateOrganizationsRequest request);

    CompletableFuture<DescribeFabricChaincodeUploadPolicyResponse> describeFabricChaincodeUploadPolicy(DescribeFabricChaincodeUploadPolicyRequest request);

    CompletableFuture<DescribeFabricChannelMembersResponse> describeFabricChannelMembers(DescribeFabricChannelMembersRequest request);

    CompletableFuture<DescribeFabricConsortiumAdminStatusResponse> describeFabricConsortiumAdminStatus(DescribeFabricConsortiumAdminStatusRequest request);

    CompletableFuture<DescribeFabricConsortiumChaincodesResponse> describeFabricConsortiumChaincodes(DescribeFabricConsortiumChaincodesRequest request);

    CompletableFuture<DescribeFabricConsortiumChannelsResponse> describeFabricConsortiumChannels(DescribeFabricConsortiumChannelsRequest request);

    CompletableFuture<DescribeFabricConsortiumConfigResponse> describeFabricConsortiumConfig(DescribeFabricConsortiumConfigRequest request);

    CompletableFuture<DescribeFabricConsortiumDeletableResponse> describeFabricConsortiumDeletable(DescribeFabricConsortiumDeletableRequest request);

    CompletableFuture<DescribeFabricConsortiumMemberApprovalResponse> describeFabricConsortiumMemberApproval(DescribeFabricConsortiumMemberApprovalRequest request);

    CompletableFuture<DescribeFabricConsortiumMembersResponse> describeFabricConsortiumMembers(DescribeFabricConsortiumMembersRequest request);

    CompletableFuture<DescribeFabricConsortiumOrderersResponse> describeFabricConsortiumOrderers(DescribeFabricConsortiumOrderersRequest request);

    CompletableFuture<DescribeFabricConsortiumSpecsResponse> describeFabricConsortiumSpecs(DescribeFabricConsortiumSpecsRequest request);

    CompletableFuture<DescribeFabricConsortiumsResponse> describeFabricConsortiums(DescribeFabricConsortiumsRequest request);

    CompletableFuture<DescribeFabricExplorerResponse> describeFabricExplorer(DescribeFabricExplorerRequest request);

    CompletableFuture<DescribeFabricInvitationCodeResponse> describeFabricInvitationCode(DescribeFabricInvitationCodeRequest request);

    CompletableFuture<DescribeFabricInviterResponse> describeFabricInviter(DescribeFabricInviterRequest request);

    CompletableFuture<DescribeFabricOrdererLogsResponse> describeFabricOrdererLogs(DescribeFabricOrdererLogsRequest request);

    CompletableFuture<DescribeFabricOrganizationResponse> describeFabricOrganization(DescribeFabricOrganizationRequest request);

    CompletableFuture<DescribeFabricOrganizationChaincodesResponse> describeFabricOrganizationChaincodes(DescribeFabricOrganizationChaincodesRequest request);

    CompletableFuture<DescribeFabricOrganizationChannelsResponse> describeFabricOrganizationChannels(DescribeFabricOrganizationChannelsRequest request);

    CompletableFuture<DescribeFabricOrganizationDeletableResponse> describeFabricOrganizationDeletable(DescribeFabricOrganizationDeletableRequest request);

    CompletableFuture<DescribeFabricOrganizationMembersResponse> describeFabricOrganizationMembers(DescribeFabricOrganizationMembersRequest request);

    CompletableFuture<DescribeFabricOrganizationPeersResponse> describeFabricOrganizationPeers(DescribeFabricOrganizationPeersRequest request);

    CompletableFuture<DescribeFabricOrganizationSpecsResponse> describeFabricOrganizationSpecs(DescribeFabricOrganizationSpecsRequest request);

    CompletableFuture<DescribeFabricOrganizationUsersResponse> describeFabricOrganizationUsers(DescribeFabricOrganizationUsersRequest request);

    CompletableFuture<DescribeFabricOrganizationsResponse> describeFabricOrganizations(DescribeFabricOrganizationsRequest request);

    CompletableFuture<DescribeFabricPeerLogsResponse> describeFabricPeerLogs(DescribeFabricPeerLogsRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeRootDomainResponse> describeRootDomain(DescribeRootDomainRequest request);

    CompletableFuture<DescribeTasksResponse> describeTasks(DescribeTasksRequest request);

    CompletableFuture<DownloadFabricOrganizationSDKResponse> downloadFabricOrganizationSDK(DownloadFabricOrganizationSDKRequest request);

    CompletableFuture<FreezeAntChainAccountResponse> freezeAntChainAccount(FreezeAntChainAccountRequest request);

    CompletableFuture<InstallFabricChaincodeResponse> installFabricChaincode(InstallFabricChaincodeRequest request);

    CompletableFuture<InstantiateFabricChaincodeResponse> instantiateFabricChaincode(InstantiateFabricChaincodeRequest request);

    CompletableFuture<JoinFabricChannelResponse> joinFabricChannel(JoinFabricChannelRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ResetAntChainCertificateResponse> resetAntChainCertificate(ResetAntChainCertificateRequest request);

    CompletableFuture<ResetAntChainUserCertificateResponse> resetAntChainUserCertificate(ResetAntChainUserCertificateRequest request);

    CompletableFuture<ResetFabricOrganizationUserPasswordResponse> resetFabricOrganizationUserPassword(ResetFabricOrganizationUserPasswordRequest request);

    CompletableFuture<SynchronizeFabricChaincodeResponse> synchronizeFabricChaincode(SynchronizeFabricChaincodeRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UnfreezeAntChainAccountResponse> unfreezeAntChainAccount(UnfreezeAntChainAccountRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateAntChainResponse> updateAntChain(UpdateAntChainRequest request);

    CompletableFuture<UpdateAntChainConsortiumResponse> updateAntChainConsortium(UpdateAntChainConsortiumRequest request);

    CompletableFuture<UpdateAntChainContractContentResponse> updateAntChainContractContent(UpdateAntChainContractContentRequest request);

    CompletableFuture<UpdateAntChainContractProjectResponse> updateAntChainContractProject(UpdateAntChainContractProjectRequest request);

    CompletableFuture<UpdateAntChainMemberResponse> updateAntChainMember(UpdateAntChainMemberRequest request);

    CompletableFuture<UpdateAntChainQRCodeAuthorizationResponse> updateAntChainQRCodeAuthorization(UpdateAntChainQRCodeAuthorizationRequest request);

    CompletableFuture<UpgradeFabricChaincodeResponse> upgradeFabricChaincode(UpgradeFabricChaincodeRequest request);

}
