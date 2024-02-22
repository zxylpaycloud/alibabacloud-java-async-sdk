// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.pairecservice20221213.models.*;
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

    CompletableFuture<BackflowFeatureConsistencyCheckJobDataResponse> backflowFeatureConsistencyCheckJobData(BackflowFeatureConsistencyCheckJobDataRequest request);

    CompletableFuture<CheckInstanceResourcesResponse> checkInstanceResources(CheckInstanceResourcesRequest request);

    CompletableFuture<CloneExperimentResponse> cloneExperiment(CloneExperimentRequest request);

    CompletableFuture<CloneExperimentGroupResponse> cloneExperimentGroup(CloneExperimentGroupRequest request);

    CompletableFuture<CloneFeatureConsistencyCheckJobConfigResponse> cloneFeatureConsistencyCheckJobConfig(CloneFeatureConsistencyCheckJobConfigRequest request);

    CompletableFuture<CloneLaboratoryResponse> cloneLaboratory(CloneLaboratoryRequest request);

    CompletableFuture<CreateABMetricResponse> createABMetric(CreateABMetricRequest request);

    CompletableFuture<CreateABMetricGroupResponse> createABMetricGroup(CreateABMetricGroupRequest request);

    CompletableFuture<CreateCalculationJobsResponse> createCalculationJobs(CreateCalculationJobsRequest request);

    CompletableFuture<CreateCrowdResponse> createCrowd(CreateCrowdRequest request);

    CompletableFuture<CreateExperimentResponse> createExperiment(CreateExperimentRequest request);

    CompletableFuture<CreateExperimentGroupResponse> createExperimentGroup(CreateExperimentGroupRequest request);

    CompletableFuture<CreateFeatureConsistencyCheckJobResponse> createFeatureConsistencyCheckJob(CreateFeatureConsistencyCheckJobRequest request);

    CompletableFuture<CreateFeatureConsistencyCheckJobConfigResponse> createFeatureConsistencyCheckJobConfig(CreateFeatureConsistencyCheckJobConfigRequest request);

    CompletableFuture<CreateInstanceResourceResponse> createInstanceResource(CreateInstanceResourceRequest request);

    CompletableFuture<CreateLaboratoryResponse> createLaboratory(CreateLaboratoryRequest request);

    CompletableFuture<CreateLayerResponse> createLayer(CreateLayerRequest request);

    CompletableFuture<CreateParamResponse> createParam(CreateParamRequest request);

    CompletableFuture<CreateSceneResponse> createScene(CreateSceneRequest request);

    CompletableFuture<CreateSubCrowdResponse> createSubCrowd(CreateSubCrowdRequest request);

    CompletableFuture<CreateTableMetaResponse> createTableMeta(CreateTableMetaRequest request);

    CompletableFuture<DeleteABMetricResponse> deleteABMetric(DeleteABMetricRequest request);

    CompletableFuture<DeleteABMetricGroupResponse> deleteABMetricGroup(DeleteABMetricGroupRequest request);

    CompletableFuture<DeleteCrowdResponse> deleteCrowd(DeleteCrowdRequest request);

    CompletableFuture<DeleteExperimentResponse> deleteExperiment(DeleteExperimentRequest request);

    CompletableFuture<DeleteExperimentGroupResponse> deleteExperimentGroup(DeleteExperimentGroupRequest request);

    CompletableFuture<DeleteInstanceResourceResponse> deleteInstanceResource(DeleteInstanceResourceRequest request);

    CompletableFuture<DeleteLaboratoryResponse> deleteLaboratory(DeleteLaboratoryRequest request);

    CompletableFuture<DeleteLayerResponse> deleteLayer(DeleteLayerRequest request);

    CompletableFuture<DeleteParamResponse> deleteParam(DeleteParamRequest request);

    CompletableFuture<DeleteSceneResponse> deleteScene(DeleteSceneRequest request);

    CompletableFuture<DeleteSubCrowdResponse> deleteSubCrowd(DeleteSubCrowdRequest request);

    CompletableFuture<DeleteTableMetaResponse> deleteTableMeta(DeleteTableMetaRequest request);

    CompletableFuture<GetABMetricResponse> getABMetric(GetABMetricRequest request);

    CompletableFuture<GetABMetricGroupResponse> getABMetricGroup(GetABMetricGroupRequest request);

    CompletableFuture<GetCalculationJobResponse> getCalculationJob(GetCalculationJobRequest request);

    CompletableFuture<GetExperimentResponse> getExperiment(GetExperimentRequest request);

    CompletableFuture<GetExperimentGroupResponse> getExperimentGroup(GetExperimentGroupRequest request);

    CompletableFuture<GetFeatureConsistencyCheckJobResponse> getFeatureConsistencyCheckJob(GetFeatureConsistencyCheckJobRequest request);

    CompletableFuture<GetFeatureConsistencyCheckJobConfigResponse> getFeatureConsistencyCheckJobConfig(GetFeatureConsistencyCheckJobConfigRequest request);

    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    CompletableFuture<GetInstanceResourceResponse> getInstanceResource(GetInstanceResourceRequest request);

    CompletableFuture<GetInstanceResourceTableResponse> getInstanceResourceTable(GetInstanceResourceTableRequest request);

    CompletableFuture<GetLaboratoryResponse> getLaboratory(GetLaboratoryRequest request);

    CompletableFuture<GetLayerResponse> getLayer(GetLayerRequest request);

    CompletableFuture<GetSceneResponse> getScene(GetSceneRequest request);

    CompletableFuture<GetSubCrowdResponse> getSubCrowd(GetSubCrowdRequest request);

    CompletableFuture<GetTableMetaResponse> getTableMeta(GetTableMetaRequest request);

    CompletableFuture<ListABMetricGroupsResponse> listABMetricGroups(ListABMetricGroupsRequest request);

    CompletableFuture<ListABMetricsResponse> listABMetrics(ListABMetricsRequest request);

    CompletableFuture<ListCalculationJobsResponse> listCalculationJobs(ListCalculationJobsRequest request);

    CompletableFuture<ListCrowdUsersResponse> listCrowdUsers(ListCrowdUsersRequest request);

    CompletableFuture<ListCrowdsResponse> listCrowds(ListCrowdsRequest request);

    CompletableFuture<ListExperimentGroupsResponse> listExperimentGroups(ListExperimentGroupsRequest request);

    CompletableFuture<ListExperimentsResponse> listExperiments(ListExperimentsRequest request);

    CompletableFuture<ListFeatureConsistencyCheckJobConfigsResponse> listFeatureConsistencyCheckJobConfigs(ListFeatureConsistencyCheckJobConfigsRequest request);

    CompletableFuture<ListFeatureConsistencyCheckJobFeatureReportsResponse> listFeatureConsistencyCheckJobFeatureReports(ListFeatureConsistencyCheckJobFeatureReportsRequest request);

    CompletableFuture<ListFeatureConsistencyCheckJobScoreReportsResponse> listFeatureConsistencyCheckJobScoreReports(ListFeatureConsistencyCheckJobScoreReportsRequest request);

    CompletableFuture<ListFeatureConsistencyCheckJobsResponse> listFeatureConsistencyCheckJobs(ListFeatureConsistencyCheckJobsRequest request);

    CompletableFuture<ListInstanceResourcesResponse> listInstanceResources(ListInstanceResourcesRequest request);

    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    CompletableFuture<ListLaboratoriesResponse> listLaboratories(ListLaboratoriesRequest request);

    CompletableFuture<ListLayersResponse> listLayers(ListLayersRequest request);

    CompletableFuture<ListParamsResponse> listParams(ListParamsRequest request);

    CompletableFuture<ListScenesResponse> listScenes(ListScenesRequest request);

    CompletableFuture<ListSubCrowdsResponse> listSubCrowds(ListSubCrowdsRequest request);

    CompletableFuture<ListTableMetasResponse> listTableMetas(ListTableMetasRequest request);

    CompletableFuture<OfflineExperimentResponse> offlineExperiment(OfflineExperimentRequest request);

    CompletableFuture<OfflineExperimentGroupResponse> offlineExperimentGroup(OfflineExperimentGroupRequest request);

    CompletableFuture<OfflineLaboratoryResponse> offlineLaboratory(OfflineLaboratoryRequest request);

    CompletableFuture<OnlineExperimentResponse> onlineExperiment(OnlineExperimentRequest request);

    CompletableFuture<OnlineExperimentGroupResponse> onlineExperimentGroup(OnlineExperimentGroupRequest request);

    CompletableFuture<OnlineLaboratoryResponse> onlineLaboratory(OnlineLaboratoryRequest request);

    CompletableFuture<PushAllExperimentResponse> pushAllExperiment(PushAllExperimentRequest request);

    CompletableFuture<ReportABMetricGroupResponse> reportABMetricGroup(ReportABMetricGroupRequest request);

    CompletableFuture<SyncFeatureConsistencyCheckJobReplayLogResponse> syncFeatureConsistencyCheckJobReplayLog(SyncFeatureConsistencyCheckJobReplayLogRequest request);

    CompletableFuture<TerminateFeatureConsistencyCheckJobResponse> terminateFeatureConsistencyCheckJob(TerminateFeatureConsistencyCheckJobRequest request);

    CompletableFuture<UpdateABMetricResponse> updateABMetric(UpdateABMetricRequest request);

    CompletableFuture<UpdateABMetricGroupResponse> updateABMetricGroup(UpdateABMetricGroupRequest request);

    CompletableFuture<UpdateCrowdResponse> updateCrowd(UpdateCrowdRequest request);

    CompletableFuture<UpdateExperimentResponse> updateExperiment(UpdateExperimentRequest request);

    CompletableFuture<UpdateExperimentGroupResponse> updateExperimentGroup(UpdateExperimentGroupRequest request);

    CompletableFuture<UpdateFeatureConsistencyCheckJobConfigResponse> updateFeatureConsistencyCheckJobConfig(UpdateFeatureConsistencyCheckJobConfigRequest request);

    CompletableFuture<UpdateInstanceResourceResponse> updateInstanceResource(UpdateInstanceResourceRequest request);

    CompletableFuture<UpdateLaboratoryResponse> updateLaboratory(UpdateLaboratoryRequest request);

    CompletableFuture<UpdateLayerResponse> updateLayer(UpdateLayerRequest request);

    CompletableFuture<UpdateParamResponse> updateParam(UpdateParamRequest request);

    CompletableFuture<UpdateSceneResponse> updateScene(UpdateSceneRequest request);

    CompletableFuture<UpdateTableMetaResponse> updateTableMeta(UpdateTableMetaRequest request);

}
