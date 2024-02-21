// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.privatelink20200415.models.*;
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

    /**
      * *   Before you add an account ID to the whitelist of an endpoint service, make sure that the endpoint service is in the **Active** state. You can call the [GetVpcEndpointServiceAttribute](~~469330~~) operation to query the status of the endpoint service.
      * *   You cannot repeatedly call the **AddUserToVpcEndpointService** operation to add the ID of an Alibaba Cloud account to the whitelist of an endpoint service within a specified period of time.
      *
     */
    CompletableFuture<AddUserToVpcEndpointServiceResponse> addUserToVpcEndpointService(AddUserToVpcEndpointServiceRequest request);

    /**
      * *   **AddZoneToVpcEndpoint** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [ListVpcEndpointZones](~~183560~~) operation to query the state of the zone.
      *     *   If the zone is in the **Creating** state, the zone is being added.
      *     *   If the zone is in the Wait state, the zone is added.
      * *   You cannot repeatedly call the **AddZoneToVpcEndpoint** operation to add a zone to an endpoint within a specified period of time.
      *
     */
    CompletableFuture<AddZoneToVpcEndpointResponse> addZoneToVpcEndpoint(AddZoneToVpcEndpointRequest request);

    /**
      * *   Before you add a service resource to an endpoint service, make sure that the endpoint service is in the **Active** state. You can call the [GetVpcEndpointServiceAttribute](~~469330~~) operation to query the status of the endpoint service.
      * *   You cannot repeatedly call the **AttachResourceToVpcEndpointService** operation to add a service resource to an endpoint service within a specified period of time.
      *
     */
    CompletableFuture<AttachResourceToVpcEndpointServiceResponse> attachResourceToVpcEndpointService(AttachResourceToVpcEndpointServiceRequest request);

    /**
      * *   **AttachSecurityGroupToVpcEndpoint** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListVpcEndpoints](~~183558~~) operation to query the state of the endpoint.
      *     *   If the endpoint is in the **Pending** state, the endpoint is being associated with the security group.
      *     *   If the endpoint is in the **Active** state, the endpoint is associated with the security group.
      * *   You cannot repeatedly call the **AttachSecurityGroupToVpcEndpoint** operation to associate an endpoint with a security group within a specified period of time.
      *
     */
    CompletableFuture<AttachSecurityGroupToVpcEndpointResponse> attachSecurityGroupToVpcEndpoint(AttachSecurityGroupToVpcEndpointRequest request);

    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    CompletableFuture<CheckProductOpenResponse> checkProductOpen(CheckProductOpenRequest request);

    /**
      * **CreateVpcEndpoint** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetVpcEndpointAttribute](~~183568~~) operation to check whether the endpoint is created.
      * *   If the endpoint is in the **Creating** state, the endpoint is being created.
      * *   If the endpoint is in the **Active** state, the endpoint is created.
      *
     */
    CompletableFuture<CreateVpcEndpointResponse> createVpcEndpoint(CreateVpcEndpointRequest request);

    /**
      * *   Before you create an endpoint service, make sure that you have created a Server Load Balancer (SLB) instance that supports PrivateLink. For more information, see [CreateLoadBalancer](~~174064~~).
      * *   **CreateVpcEndpointService** is an asynchronous operation. After a request is sent, the system returns a request ID and an instance ID and runs the task in the background. You can call the [GetVpcEndpointServiceAttribute](~~183542~~) operation to query the status of the endpoint service.
      *     *   If the endpoint service is in the **Creating** state, the endpoint service is being created.
      *     *   If the endpoint service is in the **Active** state, the endpoint service is created.
      *
     */
    CompletableFuture<CreateVpcEndpointServiceResponse> createVpcEndpointService(CreateVpcEndpointServiceRequest request);

    /**
      * *   Before you delete an endpoint, you must delete the zones that are added to the endpoint.
      * *   **DeleteVpcEndpoint** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [GetVpcEndpointAttribute](~~183568~~) operation to check whether the endpoint is deleted.
      *     *   If the endpoint is in the **Deleting** state, the endpoint is being deleted.
      *     *   If the endpoint cannot be queried, the endpoint is deleted.
      *
     */
    CompletableFuture<DeleteVpcEndpointResponse> deleteVpcEndpoint(DeleteVpcEndpointRequest request);

    /**
      * *   Before you delete an endpoint service, you must disconnect the endpoint from the endpoint service and remove the service resources.
      * *   **DeleteVpcEndpointService** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [GetVpcEndpointServiceAttribute](~~183542~~) operation to check whether the endpoint service is deleted.
      *     *   If the endpoint service is in the **Deleting** state, the endpoint service is being deleted.
      *     *   If the endpoint service cannot be queried, the endpoint service is deleted.
      * *   You cannot repeatedly call the **DeleteVpcEndpointService** operation to delete an endpoint service that belongs to an Alibaba Cloud account within a specified period of time.
      *
     */
    CompletableFuture<DeleteVpcEndpointServiceResponse> deleteVpcEndpointService(DeleteVpcEndpointServiceRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    /**
      * *   Before you remove a service resource from an endpoint service, make sure that the endpoint service is in the **Active** state. You can call the [GetVpcEndpointServiceAttribute](~~469330~~) operation to query the status of the endpoint service.
      * *   You cannot repeatedly call the **DetachResourceFromVpcEndpointService** operation to remove a service resource from an endpoint service within a specified period of time.
      *
     */
    CompletableFuture<DetachResourceFromVpcEndpointServiceResponse> detachResourceFromVpcEndpointService(DetachResourceFromVpcEndpointServiceRequest request);

    /**
      * *   **DetachSecurityGroupFromVpcEndpoint** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [ListVpcEndpoints](~~183558~~) to check whether the endpoint is disassociated from the security group.
      *     *   If the endpoint is in the **Pending** state, the endpoint is being disassociated from the security group.
      *     *   If you cannot query the endpoint in the security group, the endpoint is disassociated from the security group.
      * *   You cannot repeatedly call the **DetachSecurityGroupFromVpcEndpoint** operation to disassociate an endpoint from a security group within a specified period of time.
      *
     */
    CompletableFuture<DetachSecurityGroupFromVpcEndpointResponse> detachSecurityGroupFromVpcEndpoint(DetachSecurityGroupFromVpcEndpointRequest request);

    /**
      * *   **DisableVpcEndpointConnection** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetVpcEndpointAttribute](~~183568~~) operation to query the state of the endpoint connection.
      *     *   If the endpoint connection is in the **Disconnecting** state, the endpoint is being disconnected from the endpoint service.
      *     *   If the endpoint connection is in the **Disconnected** state, the endpoint is disconnected from the endpoint service.
      * *   You cannot repeatedly call the **DisableVpcEndpointConnection** operation to allow an endpoint service to reject a connection request from an endpoint within a specified period of time.
      *
     */
    CompletableFuture<DisableVpcEndpointConnectionResponse> disableVpcEndpointConnection(DisableVpcEndpointConnectionRequest request);

    /**
      * *   You can call this operation only when the state of the endpoint is **Connected** and the state of the zone associated with the endpoint is **Connected** or **Migrated**.
      * *   **DisableVpcEndpointZoneConnection** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListVpcEndpointZones](~~183560~~) operation to query the status of the task.
      *     *   If the zone is in the **Disconnecting** state, the task is running.
      *     *   If the zone is in the **Disconnected** state, the task is successful.
      * *   You cannot repeatedly call the **DisableVpcEndpointZoneConnection** operation to allow an endpoint service to reject a connection request from the endpoint in the zone within a specified period of time.
      *
     */
    CompletableFuture<DisableVpcEndpointZoneConnectionResponse> disableVpcEndpointZoneConnection(DisableVpcEndpointZoneConnectionRequest request);

    /**
      * *   **EnableVpcEndpointConnection** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [GetVpcEndpointAttribute](~~183568~~) operation to query the state of the endpoint connection.
      *     *   If the state is **Connecting**, the endpoint connection is being established.
      *     *   If the state is **Connected**, the endpoint connection is established.
      * *   You cannot repeatedly call the **EnableVpcEndpointConnection** operation to allow an endpoint service of an Alibaba Cloud account to accept a connection request from an endpoint within a specified period of time.
      *
     */
    CompletableFuture<EnableVpcEndpointConnectionResponse> enableVpcEndpointConnection(EnableVpcEndpointConnectionRequest request);

    /**
      * *   You can call this operation only when the state of the endpoint is **Connected** and the state of the associated zone is **Disconnected**.
      * *   **EnableVpcEndpointZoneConnection** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [ListVpcEndpointZones](~~183560~~) operation to check whether the endpoint service accepts a connection request from the endpoint in the associated zone.
      *     *   If the zone is in the **Connecting** state, the endpoint service is accepting the connection request from the endpoint.
      *     *   If the zone is in the **Connected** state, the endpoint service has accepted the connection request from the endpoint.
      * *   You cannot repeatedly call the **EnableVpcEndpointZoneConnection** operation to allow an endpoint service to accept a connection request from an endpoint in the associated zone within a specified period of time.
      *
     */
    CompletableFuture<EnableVpcEndpointZoneConnectionResponse> enableVpcEndpointZoneConnection(EnableVpcEndpointZoneConnectionRequest request);

    CompletableFuture<GetVpcEndpointAttributeResponse> getVpcEndpointAttribute(GetVpcEndpointAttributeRequest request);

    CompletableFuture<GetVpcEndpointServiceAttributeResponse> getVpcEndpointServiceAttribute(GetVpcEndpointServiceAttributeRequest request);

    /**
      * *   You must specify **ResourceId.N** or **Tag.N** in the request to specify the object that you want to query.
      * *   **Tag.N** is a resource tag that consists of a key-value pair (Tag.N.Key and Tag.N.Value). If you specify only **Tag.N.Key**, all tag values that are associated with the specified key are returned. If you specify only **Tag.N.Value**, an error message is returned.
      * *   If you specify **Tag.N** and **ResourceId.N** to filter tags, **ResourceId.N** must match all specified key-value pairs.
      * *   If you specify multiple key-value pairs, resources that contain these key-value pairs are returned.
      *
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListVpcEndpointConnectionsResponse> listVpcEndpointConnections(ListVpcEndpointConnectionsRequest request);

    CompletableFuture<ListVpcEndpointSecurityGroupsResponse> listVpcEndpointSecurityGroups(ListVpcEndpointSecurityGroupsRequest request);

    CompletableFuture<ListVpcEndpointServiceResourcesResponse> listVpcEndpointServiceResources(ListVpcEndpointServiceResourcesRequest request);

    CompletableFuture<ListVpcEndpointServiceUsersResponse> listVpcEndpointServiceUsers(ListVpcEndpointServiceUsersRequest request);

    CompletableFuture<ListVpcEndpointServicesResponse> listVpcEndpointServices(ListVpcEndpointServicesRequest request);

    CompletableFuture<ListVpcEndpointServicesByEndUserResponse> listVpcEndpointServicesByEndUser(ListVpcEndpointServicesByEndUserRequest request);

    CompletableFuture<ListVpcEndpointZonesResponse> listVpcEndpointZones(ListVpcEndpointZonesRequest request);

    CompletableFuture<ListVpcEndpointsResponse> listVpcEndpoints(ListVpcEndpointsRequest request);

    CompletableFuture<OpenPrivateLinkServiceResponse> openPrivateLinkService(OpenPrivateLinkServiceRequest request);

    /**
      * *   Before you remove an account ID from the whitelist of an endpoint service, make sure that the endpoint service is in the **Active** state. You can call the [GetVpcEndpointServiceAttribute](~~469330~~) operation to query the status of the endpoint service.
      * *   You cannot repeatedly call the **RemoveUserFromVpcEndpointService** operation to remove the ID of an Alibaba Cloud account from the whitelist of an endpoint service within a specified period of time.
      *
     */
    CompletableFuture<RemoveUserFromVpcEndpointServiceResponse> removeUserFromVpcEndpointService(RemoveUserFromVpcEndpointServiceRequest request);

    /**
      * *   **RemoveZoneFromVpcEndpoint** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListVpcEndpointZones](~~183560~~) operation to check whether the zone of the endpoint is deleted.
      *     *   If the zone of the endpoint is in the **Deleting** state, the zone is being deleted.
      *     *   If the zone cannot be queried, the zone is deleted.
      * *   You cannot repeatedly call the **RemoveZoneFromVpcEndpoint** operation to delete a zone of an endpoint within a specified period of time.
      *
     */
    CompletableFuture<RemoveZoneFromVpcEndpointResponse> removeZoneFromVpcEndpoint(RemoveZoneFromVpcEndpointRequest request);

    /**
      * > You can add up to 20 tags to an instance. Before you add tags to a resource, Alibaba Cloud checks the number of existing tags of the resource. If the maximum number is reached, an error message is returned.
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
      * You cannot repeatedly call the **UpdateVpcEndpointAttribute** operation to modify the attributes of an endpoint that belongs to an Alibaba Cloud account within a specified period of time.
      *
     */
    CompletableFuture<UpdateVpcEndpointAttributeResponse> updateVpcEndpointAttribute(UpdateVpcEndpointAttributeRequest request);

    /**
      * You cannot repeatedly call the **UpdateVpcEndpointConnectionAttribute** operation to modify the bandwidth of an endpoint connection that belongs to an Alibaba Cloud account within a specified period of time.
      *
     */
    CompletableFuture<UpdateVpcEndpointConnectionAttributeResponse> updateVpcEndpointConnectionAttribute(UpdateVpcEndpointConnectionAttributeRequest request);

    /**
      * You cannot repeatedly call the **UpdateVpcEndpointServiceAttribute** operation to modify the attributes of an endpoint service that belongs to an Alibaba Cloud account within a specified period of time.
      *
     */
    CompletableFuture<UpdateVpcEndpointServiceAttributeResponse> updateVpcEndpointServiceAttribute(UpdateVpcEndpointServiceAttributeRequest request);

    /**
      * You cannot repeatedly call the **UpdateVpcEndpointServiceResourceAttribute** operation to modify the attributes of a service resource that is added to an endpoint service within a specified period of time.
      *
     */
    CompletableFuture<UpdateVpcEndpointServiceResourceAttributeResponse> updateVpcEndpointServiceResourceAttribute(UpdateVpcEndpointServiceResourceAttributeRequest request);

    /**
      * ### Prerequisites
      * By default, the feature of modifying a service resource of a zone to which an endpoint connection belongs is unavailable. To use this feature, log on to the [Quota Center console](https://quotas.console.aliyun.com/white-list-products/privatelink/quotas). Click Whitelist Quotas in the left-side navigation pane and click PrivateLink in the Networking section. On the page that appears, search for `privatelink_whitelist/svc_res_mgt_uat` and click Apply in the Actions column.
      * ### Usage notes
      * *   If the endpoint connection is in the **Disconnected** state, you can manually allocate the service resource in the zone.
      * *   If the endpoint connection is in the **Connected** state, you can manually migrate the service resource in the zone. In this case, the connection might be interrupted.
      * *   **UpdateVpcEndpointZoneConnectionResourceAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetVpcEndpointServiceAttribute](~~469330~~) operation to check whether the service resource is modified.
      *     *   If the endpoint service is in the **Pending** state, the service resource is being modified.
      *     *   If the endpoint service is in the **Active** state, the service resource is modified.
      * *   You cannot repeatedly call the **UpdateVpcEndpointZoneConnectionResourceAttribute** operation to modify a service resource in the zone to which an endpoint connection belongs within a specified period of time.
      *
     */
    CompletableFuture<UpdateVpcEndpointZoneConnectionResourceAttributeResponse> updateVpcEndpointZoneConnectionResourceAttribute(UpdateVpcEndpointZoneConnectionResourceAttributeRequest request);

}
