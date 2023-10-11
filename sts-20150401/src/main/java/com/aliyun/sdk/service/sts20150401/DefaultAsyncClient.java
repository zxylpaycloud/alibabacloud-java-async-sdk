// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sts20150401;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.sts20150401.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "Sts";
        this.version = "2015-04-01";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-2-pop", "sts.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "sts.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "sts.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "sts.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "sts.aliyuncs.com"),
            new TeaPair("cn-edge-1", "sts.aliyuncs.com"),
            new TeaPair("cn-fujian", "sts.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "sts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "sts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "sts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "sts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "sts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "sts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "sts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "sts.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "sts.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "sts.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "sts-vpc.cn-north-2-gov-1.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "sts.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "sts.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "sts.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "sts.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "sts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "sts-vpc.cn-shenzhen-finance-1.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "sts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "sts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "sts.aliyuncs.com"),
            new TeaPair("cn-wuhan", "sts.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "sts.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "sts.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "sts.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "sts.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "sts.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "sts.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "sts.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
      * ### Prerequisites
      * You cannot use an Alibaba Cloud account to call this operation. The requester of this operation can only be a RAM user or RAM role. Make sure that the AliyunSTSAssumeRoleAccess policy is attached to the requester. After this policy is attached to the requester, the requester has the management permissions on STS.
      * If you do not attach the AliyunSTSAssumeRoleAccess policy to the requester, the following error message is returned:
      * `You are not authorized to do this action. You should be authorized by RAM.`
      * You can refer to the following information to troubleshoot the error:
      * *   Cause of the error: The policy that is required to assume a RAM role is not attached to the requester. To resolve this issue, attach the AliyunSTSAssumeRoleAccess policy or a custom policy to the requester. For more information, see [Can I specify the RAM role that a RAM user can assume?](~~39744~~) and [Grant permissions to a RAM user](~~116146~~).
      * *   Cause of the error: The requester is not authorized to assume the RAM role. To resolve this issue, add the requester to the Principal element in the trust policy of the RAM role For more information, see [Edit the trust policy of a RAM role](~~116819~~).
      * ### Best practices
      * An STS token is valid for a period of time after it is issued, and the number of STS tokens that can be issued within an interval is also limited. Therefore, we recommend that you configure a proper validity period for an STS token and repeatedly use the token within this period. This prevents frequent issuing of STS tokens from adversely affecting your services if a large number of requests are sent. For more information about the limit, see [Is the number of STS API requests limited?](~~39744~~) You can configure the `DurationSeconds` parameter to specify a validity period for an STS token.
      * When you upload or download Object Storage Service (OSS) objects on mobile devices, a large number of STS API requests are sent. In this case, repeated use of an STS token may not meet your business requirements. To avoid the limit on STS API requests from affecting access to OSS, you can **add a signature to the URL of an OSS object**. For more information, see [Add signatures to URLs](~~31952~~) and [Obtain signature information from the server and upload data to OSS](~~31926~~).
      *
     */
    @Override
    public CompletableFuture<AssumeRoleResponse> assumeRole(AssumeRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssumeRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssumeRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssumeRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Prerequisites
      * *   An OIDC token is obtained from an external identity provider (IdP).
      * *   An OIDC IdP is created in the RAM console. For more information, see [Create an OIDC IdP](~~327123~~) or [CreateOIDCProvider](~~327135~~).
      * *   A RAM role whose trusted entity is an OIDC IdP is created in the RAM console. For more information, see [Create a RAM role for a trusted IdP](~~116805~~) or [CreateRole](~~28710~~).
      *
     */
    @Override
    public CompletableFuture<AssumeRoleWithOIDCResponse> assumeRoleWithOIDC(AssumeRoleWithOIDCRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssumeRoleWithOIDC").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssumeRoleWithOIDCResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssumeRoleWithOIDCResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ###
      * *   A SAML response is obtained from an external identity provider (IdP).
      * *   A SAML IdP is created in the RAM console. For more information, see [Create a SAML IdP](~~116083~~) or [CreateSAMLProvider](~~186846~~).
      * *   A RAM role whose trusted entity is a SAML IdP is created in the RAM console. For more information, see [Create a RAM role for a trusted IdP](~~116805~~) or [CreateRole](~~28710~~).
      *
     */
    @Override
    public CompletableFuture<AssumeRoleWithSAMLResponse> assumeRoleWithSAML(AssumeRoleWithSAMLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssumeRoleWithSAML").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssumeRoleWithSAMLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssumeRoleWithSAMLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetCallerIdentityResponse> getCallerIdentity(GetCallerIdentityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCallerIdentity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCallerIdentityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCallerIdentityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
